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
import model.kardex;
import java.sql.ResultSet;



/**
 *
 * @author Stalin
 */
public class kardexImp implements kardexDao {
        ConnectionDb conn;

    public  kardexImp () {  //constructor vacio
    }

    @Override
    public List<kardex> list() {      // listado desde la bd mysql
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM [dbo].[REGISTRA_KARDEX]"); 
        
        List<kardex> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
                kardex kardex = new kardex();  
              
                kardex.setID_EMPLEADO(rs.getInt("ID_EMPLEADO")); 
                kardex.setID_DETALLE(rs.getInt("ID_DETALLE"));
                kardex.setFECHA_REGISTRO(rs.getString("FECHA_REGISTRO"));
                kardex.setDESCRIPCION(rs.getString("DESCRIPCION"));
                kardex.setCANTIDAD(rs.getFloat("CANTIDAD"));
                kardex.setPRECIO_TOTAL(rs.getFloat("PRECIO_TOTAL"));
                kardex.setTIPO(rs.getString("TIPO"));
                kardex.setSALDO(rs.getFloat("SALDO"));
                list.add(kardex);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }  

    @Override
    public kardex edit(int id) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
        kardex kardex = new kardex();
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM REGISTRA_KARDEX WHERE id = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql

            while (rs.next()){          //mientras haya registros cargados en el resultset
                kardex.setID_KARDEX(rs.getInt("ID_KARDEX")); 
                kardex.setID_EMPLEADO(rs.getInt("ID_EMPLEADO")); 
                kardex.setCANTIDAD(rs.getFloat("CANTIDAD"));
                kardex.setTIPO(rs.getString("TIPO"));
                kardex.setFECHA_REGISTRO(rs.getString("FECHA_REGISTRO"));
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return kardex;             //devuelve el objeto creado
    }
    @Override
    public boolean save(kardex kardex) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
           
     
            if (kardex.getID_KARDEX() == 0) {  //es cero cuando se esta ingresando un registro nuevo: ver inicializac'on del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                
                sql.append("INSERT INTO [dbo].[REGISTRA_KARDEX]\n" +
"           ,[ID_EMPLEADO]\n" +
"           ,[ID_DETALLE]\n" +
"           ,[FECHA_REGISTRO]\n" +
"           ,[DESCRIPCION]\n" +
"           ,[CANTIDAD]\n" +
"           ,[PRECIO_TOTAL]\n" +
"           ,[TIPO]\n" +
"           ,[SALDO])"
            + " VALUES ('").append(kardex.getID_EMPLEADO());
                sql.append("', '").append(kardex.getID_DETALLE());      //crear la cadena de conexion
                sql.append("', '").append(kardex.getFECHA_REGISTRO());      //crear la cadena de conexion
                sql.append("', '").append(kardex.getDESCRIPCION());      //crear la cadena de conexion
                sql.append("', '").append(kardex.getCANTIDAD());  
                sql.append("', '").append(kardex.getPRECIO_TOTAL());      //crear la cadena de conexion
                sql.append("', '").append(kardex.getTIPO());
                sql.append("', '").append(kardex.getSALDO()).append("')");      //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            } else {   //es un registro previamente existente: estamos actualizando
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
     
                
                sql.append("UPDATE [dbo].[REGISTRA_KARDEX] SET [ID_KARDEX] = ").append(kardex.getID_KARDEX());
                sql.append(", [FECHA_REGISTRO] = '").append(kardex.getFECHA_REGISTRO());
                sql.append("',[CANTIDAD] = ").append(kardex.getCANTIDAD());      //crear la cadena de conexion
                sql.append(", [TIPO] = ").append(kardex.getTIPO())
                        
                .append(" WHERE I[D_KARDEX] = ").append(kardex.getID_KARDEX());      //crear la cadena de conexion
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
            sql.append("DELETE FROM [dbo].[REGISTRA_KARDEX] WHERE id = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;                              //devuelve el valor de la bandera
    }
}
