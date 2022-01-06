/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Factory.ConnectionDb;

import Factory.FactoryConexionSqlServer;

import Factory.FactoryConnectionDb;
import model.articulo;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class articuloImp implements articuloDao {

    ConnectionDb conn;
    public articuloImp(){}  //constructor vacio
    
    
    
      @Override
    public List<articulo> list() {      // listado desde la bd mysql
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM ARTICULO"); 
        
        List<articulo> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
                articulo articulo = new articulo();  
                articulo.setID_ARTICULO(rs.getInt("ID_ARTICULO"));
                articulo.setID_CATEGORIA(rs.getInt("ID_CATEGORIA"));
                articulo.setID_BODEGA(rs.getInt("ID_BODEGA"));
                articulo.setNOMBRE(rs.getString("NOMBRE"));
                articulo.setPRECIO_UNITARIO(rs.getFloat("PRECIO_TOTAL"));
                articulo.setFECHA_CADUCIDAD(rs.getFloat("FECHA_CADUCIDAD"));
                articulo.setSTOCK(rs.getFloat("STOCK"));
                articulo.setDESCRIPCION(rs.getString("DESCRIPCION"));
                articulo.setCODIGO_BARRA(rs.getString("CODIGO_BARRA"));
              
                list.add(articulo);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }  

    
    
    
    @Override
    public boolean save(articulo articulo) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
            if (articulo.getID_ARTICULO() == 0) {  //es cero cuando se esta ingresando un registro nuevo: ver inicializac'on del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("INSERT INTO [dbo].[ARTICULO]\n" +
"           ,[ID_CATEGORIA]\n" +
"           ,[ID_BODEGA]\n" +
"           ,[CODIGO_BARRA])\n" +
"           ,[NOMBRE]\n" +
"           ,[PRECIO_TOTAL]\n" +
"           ,[FECHA_CADUCIDAD]\n" +
"           ,[STOCK]\n" +
"           ,[DESCRIPCION]\n" +
"     VALUES(").append(articulo.getID_CATEGORIA());
                sql.append(", ").append(articulo.getID_BODEGA());      //crear la cadena de conexion
                sql.append(", ").append(articulo.getCODIGO_BARRA());
                sql.append(", '").append(articulo.getNOMBRE());
                sql.append("', '").append(articulo.getPRECIO_TOTAL());
                sql.append("', '").append(articulo.getFECHA_CADUCIDAD());
                sql.append("', '").append(articulo.getSTOCK());
                sql.append("', '").append(articulo.getDESCRIPCION()).append("')"); //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            } else {   //es un registro previamente existente: estamos actualizando
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("UPDATE [dbo].[ARTICULO] SET [ID_ARTICULO] = ").append(articulo.getID_ARTICULO());
                sql.append(", [ID_CATEGORIA]= ").append(articulo.getID_CATEGORIA());
                sql.append(", [ID_BODEGA] = ").append(articulo.getID_BODEGA());
                sql.append(",[CODIGO_BARRA]=").append(articulo.getCODIGO_BARRA());
                sql.append(", [NOMBRE] = '").append(articulo.getNOMBRE());
                sql.append("', [PRECIO_TOTAL] = '").append(articulo.getPRECIO_TOTAL());
                sql.append("', [FECHA_CADUCIDAD] = '").append(articulo.getFECHA_CADUCIDAD());
                sql.append("', [STOCK] ='").append(articulo.getSTOCK());
                sql.append("', [DESCRIPCION] =  '").append(articulo.getDESCRIPCION()).append("' WHERE [ID_ARTICULO] = ").append(articulo.getID_ARTICULO());
               

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
            sql.append("DELETE FROM [dbo].[ARTICULO] WHERE ID_ARTICULO = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;                              //devuelve el valor de la bandera
    }
    
    
     @Override
    public articulo edit(int id) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
        articulo articulo = new articulo();
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM kardex WHERE id = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql


            while (rs.next()){          //mientras haya registros cargados en el reseltset
              
                articulo.setID_CATEGORIA(rs.getInt("ID_CATEGORIA"));
                articulo.setID_BODEGA(rs.getInt("ID_BODEGA"));
                articulo.setCODIGO_BARRA(rs.getString("CODIGO_BARRA"));
                articulo.setNOMBRE(rs.getString("NOMBRE"));
                articulo.setPRECIO_UNITARIO(rs.getFloat("PRECIO_TOTAL"));
                articulo.setFECHA_CADUCIDAD(rs.getFloat("FECHA_CADUCIDAD"));
                articulo.setSTOCK(rs.getFloat("STOCK"));
                articulo.setDESCRIPCION(rs.getString("DESCRIPCION"));
      
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return articulo;             //devuelve el objeto creado
    }
    
        
}
