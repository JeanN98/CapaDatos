/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.util.ArrayList;
import java.util.List;
import model.empleado;
import java.sql.ResultSet;
/**
 *
 * @author Stalin
 */
public class empleadoImp implements empleadoDao {
    ConnectionDb conn;

    public  empleadoImp() {  //constructor vacio
    }

    @Override
    public List<empleado> list() {      // listado desde la bd mysql
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM EMPLEADO"); 
        
        List<empleado> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
                empleado empleado = new empleado();  
                empleado.setID_EMPLEADO(rs.getInt("ID_EMPLEADO"));  
                empleado.setCI_EMPLEADO(rs.getString("CI_EMPLEADO"));  
                empleado.setNOMBRE(rs.getString("NOMBRE"));
                empleado.setDIRECCION(rs.getString("DIRECCION"));
                empleado.setFECHA_INICIO(rs.getString("FECHA_INICIO")); 
                empleado.setFECHA_FINAL(rs.getString("FECHA_FINAL"));
                empleado.setID_BODEGA(rs.getInt("ID_BODEGA"));
                list.add(empleado);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }  

    @Override
    public empleado edit(int id) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
        empleado empleado = new empleado();
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM EMPLEADO WHERE ID_EMPLEADO = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql

            while (rs.next()){          //mientras haya registros cargados en el reseltset
                empleado.setCI_EMPLEADO(rs.getString("CI_EMPLEADO"));  
                empleado.setNOMBRE(rs.getString("NOMBRE")); 
                empleado.setID_BODEGA(rs.getInt("ID"));
                empleado.setDIRECCION(rs.getString("DIRECCIOM"));
                empleado.setFECHA_INICIO(rs.getString("FECHA_INICIO")); 
                empleado.setFECHA_FINAL(rs.getString("FECHA_FINAL"));
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return empleado;             //devuelve el objeto creado
    }
    @Override
    public boolean save(empleado empleado) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
            if ((empleado.getID_EMPLEADO()) == 0) {  //es cero cuando se esta ingresando un registro nuevo: ver inicializacion del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                              
              
                sql.append("INSERT INTO [dbo].[EMPLEADO] ([CI_EMPLEADO] ,[NOMBRE] ,[DIRECCION] ,[FECHA_INICIO] ,[FECHA_FINAL] ,[ID_BODEGA]) VALUES (");
                sql.append("', '").append(empleado.getCI_EMPLEADO());      //crear la cadena de conexion
                sql.append("', '").append(empleado.getNOMBRE());      //crear la cadena de conexion
                sql.append("', '").append(empleado.getDIRECCION());      //crear la cadena de conexion
                sql.append("', '").append(empleado.getFECHA_INICIO());      //crear la cadena de conexion
                sql.append("', '").append(empleado.getFECHA_FINAL());      //crear la cadena de conexion
                sql.append("', '").append(empleado.getID_BODEGA()).append("')");      //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            } else {   //es un registro previamente existente: estamos actualizando
                             
                
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("UPDATE  [dbo].[EMPLEADO] SET [CI_EMPLEADO] = ").append(empleado.getCI_EMPLEADO());
                sql.append(",[NOMBRE]  = '").append(empleado.getNOMBRE());
                sql.append("', [DIRECCION] = ").append(empleado.getDIRECCION());      //crear la cadena de conexion
                sql.append("',[FECHA_INICIO] = ").append(empleado.getFECHA_INICIO()); 
                sql.append("', [FECHA_FINAL] = ").append(empleado.getFECHA_FINAL()); 
                sql.append(", [ID_BODEGA] = ").append(empleado.getID_BODEGA()).append(" WHERE [ID_EMPLEADO] = ").append(empleado.getID_EMPLEADO());      //crear la cadena de conexion
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
            sql.append("DELETE FROM  [dbo].[EMPLEADO] WHERE [ID_EMPLEADO] = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;                              //devuelve el valor de la bandera
    }
}
