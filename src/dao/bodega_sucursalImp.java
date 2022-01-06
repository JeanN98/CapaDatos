/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Factory.FactoryConexionSqlServer;
import model.bodega_sucursal;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Stalin
 */


public class bodega_sucursalImp implements bodega_sucursalDao{
    
    
    
     ConnectionDb conn;
    public bodega_sucursalImp(){}  //constructor vacio
    
    
    
      @Override
    public List<bodega_sucursal> list() {      // listado desde la bd mysql
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM BODEGA_SUCURSAL"); 
        
        List<bodega_sucursal> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
                bodega_sucursal bodega = new bodega_sucursal();
                bodega.setID_BODEGA(rs.getInt("ID_BODEGA"));
                bodega.setRUC_SUCURSAL(rs.getString("RUC_SUCURSAL"));
                bodega.setNOMBRE(rs.getString("NOMBRE"));
                bodega.setDIRECCION(rs.getString("DIRECCION"));
                bodega.setTELEFONO(rs.getString("TELEFONO"));
                bodega.setID_USUARIO_CARGO(rs.getInt("ID_USUARIO_CARGO"));
                list.add(bodega);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }  

    
    
    
    @Override
    public boolean save(bodega_sucursal bodega) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
            if (bodega. getID_BODEGA_SUCURSAL() == 0) {  //es cero cuando se esta ingresando un registro nuevo: ver inicializac'on del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("INSERT INTO [dbo].[BODEGA_SUCURSAL](\n" +
"           [RUC_SUCURSAL]\n" +
"           ,[NOMBRE]\n" +
"           ,[DIRECCION]\n" +
"           ,[TELEFONO]\n" +
"           ,[ID_USUARIO_CARGO])\n" +
"     VALUES('").append(bodega.getRUC_SUCURSAL());
                 sql.append("', '").append(bodega.getNOMBRE()); 
                 sql.append("', '").append(bodega.getDIRECCION()); 
                 sql.append("', '").append(bodega.getTELEFONO()); 
                 sql.append("', ").append(bodega.getID_USUARIO_CARGO()).append(")");      //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            } else {   //es un registro previamente existente: estamos actualizando
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("UPDATE [dbo].[BODEGA_SUCURSAL] SET [ID_BODEGA] = ").append(bodega.getID_BODEGA_SUCURSAL());
                sql.append(", [RUC_SUCURSAL] = ").append(bodega.getRUC_SUCURSAL());
                sql.append(", [NOMBRE] = '").append(bodega.getNOMBRE());
                sql.append("', [DIRECCION] = '").append(bodega.getDIRECCION());
                sql.append("', [TELEFONO] = '").append(bodega.getTELEFONO());
                sql.append("', [ID_USUARIO_CARGO] =").append(bodega.getID_USUARIO_CARGO()).append(" WHERE [ID_BODEGA] = ").append(bodega.getID_BODEGA_SUCURSAL()); 
                
//crear la cadena de conexion
                   //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            }
            save = true;                                //cambia estado de bandera
        } catch(Exception e){
            
        } finally {
            this.conn.close();      //cerrar la conexion
        }
        
        return save; 
    }
    
    
    
    @Override
    public boolean delete(int id) {
        boolean delete = false;                     //bandera que indica resultado de operacion

        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        try{
            StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
            sql.append("DELETE FROM [dbo].[BODEGA_SUCURSAL] WHERE ID_BODEGA = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;                              //devuelve el valor de la bandera
    }
    
    
     @Override
    public bodega_sucursal edit(int id) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
       bodega_sucursal bodega = new bodega_sucursal();
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM kardex WHERE ID_BODEGA = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql

            while (rs.next()){          //mientras haya registros cargados en el reseltset
              
                bodega.setID_BODEGA(rs.getInt("ID_BODEGA"));
                bodega.setRUC_SUCURSAL(rs.getString("RUC_SUCURSAL"));
                bodega.setNOMBRE(rs.getString("NOMBRE"));
                bodega.setDIRECCION(rs.getString("DIRECCION"));
                bodega.setTELEFONO(rs.getString("TELEFONO"));
                bodega.setID_USUARIO_CARGO(rs.getInt("ID_USUARIO_CARGO"));
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return bodega;             //devuelve el objeto creado
    }   
}
