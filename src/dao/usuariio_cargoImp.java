/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Factory.ConnectionDb;

import Factory.FactoryConnectionDb;
import model.usuario_cargo;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.articulo;

/**
 *
 * @author Stalin
 */
public class usuariio_cargoImp implements usuario_cargoDao {
    
    ConnectionDb conn;
    
    @Override
    
    public boolean save(usuario_cargo usuario) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
             //es cero cuando se esta ingresando un registro nuevo: ver inicializac'on del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("INSERT INTO [dbo].[USUARIO_CARGO](\n" +
"           [CI_USUARIO_CARGO]\n" +
"           ,[ROL]\n" +
"           ,[NOMBRE]\n" +
"           ,[TELEFONO]\n" +
"           ,[DIRECCION]\n" +
"           ,[USUARIO]\n" +
"           ,[CONTRACENIA])\n" +
"            VALUES('").append( usuario.getCI_USUARIO_CARGO());
                sql.append("',  ").append(usuario.getROl());      //crear la cadena de conexion
                sql.append(" , '").append(usuario.getNOMBRE());
                sql.append("', '").append(usuario.getTELEFONO());
                sql.append("', '").append(usuario.getDIRECCION());
                sql.append("', '").append(usuario.getUSUARIO());
                sql.append("', '").append(usuario.getCONTRACENIA()).append("')"); //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
               
           
            save = true;                                //cambia estado de bandera
        } catch(Exception e){
            
        } finally {
            this.conn.close();      //cerrar la conexion
        }
        return save; 
    }

    @Override
    public List<usuario_cargo> list() {
            this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM USUARIO_CARGO"); 
        
        List<usuario_cargo> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
                usuario_cargo usuario = new usuario_cargo();  
                usuario.setID_USUARIO_CARGO(rs.getInt("ID_USUARIO_CARGO")); 
                usuario.setCI_USUARIO_CARGO(rs.getString("CI_USUARIO_CARGO"));
                usuario.setROl(rs.getInt("ROL"));
                usuario.setNOMBRE(rs.getString("NOMBRE"));
                usuario.setTELEFONO(rs.getString("TELEFONO"));
                usuario.setDIRECCION(rs.getString("DIRECCION"));
                usuario.setUSUARIO(rs.getString("USUARIO"));
                usuario.setCONTRACENIA(rs.getString("CONTRACENIA"));
                list.add(usuario);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }

    
    @Override
    public usuario_cargo edit(int id) {
            this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
        usuario_cargo usuario = new usuario_cargo();
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM USUARIO_CARGO WHERE id = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql


            while (rs.next()){          //mientras haya registros cargados en el reseltset
                
                 usuario.setID_USUARIO_CARGO(rs.getInt("ID_USUARIO_CARGO")); 
                usuario.setCI_USUARIO_CARGO(rs.getString("CI_USUARIO_CARGO"));
                usuario.setROl(rs.getInt("ROL"));
                usuario.setNOMBRE(rs.getString("NOMBRE"));
                usuario.setTELEFONO(rs.getString("TELEFONO"));
                usuario.setDIRECCION(rs.getString("DIRECCION"));
                usuario.setUSUARIO(rs.getString("USUARIO"));
                usuario.setCONTRACENIA(rs.getString("CONTRACENIA"));
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return usuario;             //devuelve el objeto creado
    }

    @Override
    public boolean delete(int id) {
         boolean delete = false;                     //bandera que indica resultado de operacion

        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        try{
            StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
            sql.append("DELETE FROM [dbo].[BODEGA_SUCURSAL] WHERE ID_USUARIO_CARGO = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;            
    }
    
}
