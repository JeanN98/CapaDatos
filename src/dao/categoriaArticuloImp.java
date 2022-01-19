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
import model.categoriaArticulo;
import java.sql.ResultSet;


/**
 *
 * @author Stalin
 */
public class categoriaArticuloImp implements categoriaArticuloDao{
  ConnectionDb conn;
    @Override
    public List<categoriaArticulo> list() {
        
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER); //inicializa conexion por defecto a MySql

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CATEGORIA"); 
        
        List<categoriaArticulo> list = new ArrayList<>();
        
        try{
            ResultSet rs = this.conn.query(sql.toString());  //ejecuta la consulta
            while (rs.next()){  //mientras haya registros en la tabla
              categoriaArticulo categoria = new categoriaArticulo();  
              categoria.setID_CATEGORIA(rs.getInt("ID_CATEGORIA"));
              categoria.setNOMBRE_CATEGORIA(rs.getString("NOMBRE"));
              categoria.setDESCRIPCION_CATEGORIA(rs.getString("DESCRIPCION"));
                list.add(categoria);  //añade el objeto temporal en la lista
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();      //cierra la conexion
        }
        return list;    //devuelve la lista generada
    }

    @Override
    public categoriaArticulo edit(int id) {
       this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);
      categoriaArticulo categoria = new categoriaArticulo();  
        
        StringBuilder sql = new StringBuilder();    //para almacenar la consulta e efectuar en la bd
        sql.append("SELECT * FROM CATEGORIA WHERE ID_CATEGORIA = ").append(id);   //cadena de consulta
        
        try {
            ResultSet rs = this.conn.query(sql.toString());  //carga todos los registros que cumplen con la condicion del sql

            while (rs.next()){          //mientras haya registros cargados en el reseltset
                categoria.setNOMBRE_CATEGORIA(rs.getString("NOMBRE"));
                categoria.setDESCRIPCION_CATEGORIA("DESCRIPCION");
            }
        } catch (Exception e) {
            
        } finally {
            this.conn.close();          //cierra la conexion
        }
        return categoria;             //devuelve el objeto creado
    }

    @Override
    public boolean save(categoriaArticulo categoria) {
        
         this.conn = FactoryConnectionDb.open(FactoryConnectionDb.SQLSERVER);    //abrir la conexion con bd mysql
        boolean save = true;        //bandera para indicar si se almacenaron los cambios
        
        try {
            if ((categoria.getID_CATEGORIA()) == 0) {  //es cero cuando se esta ingresando un registro nuevo: ver inicializacion del atributo 
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                              
              
                sql.append("INSERT INTO [dbo].[CATEGORIA] ([NOMBRE] ,[DESCRIPCION]) VALUES (");
                sql.append(" '").append(categoria.getNOMBRE_CATEGORIA());      //crear la cadena de conexion
      
                sql.append("', ' ").append(categoria.getDESCRIPCION_CATEGORIA()).append("' )");      //crear la cadena de conexion
                this.conn.execute(sql.toString());      //ejecuta la query
            } else {   //es un registro previamente existente: estamos actualizando
                             
                
                StringBuilder sql = new StringBuilder();   //para crear la sentencia sql
                sql.append("UPDATE  [dbo].[CATEGORIA] SET [NOMBRE] = ").append(categoria.getNOMBRE_CATEGORIA());
       
                sql.append(", [DESCRIPCION] = ").append(categoria.getDESCRIPCION_CATEGORIA()).append(" WHERE [ID_CATEGORIA] = ").append(categoria.getID_CATEGORIA());      //crear la cadena de conexion
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
            sql.append("DELETE FROM [dbo].[CATEGORIA] WHERE id = ").append(id);    //crea la sentencia de borrado
            this.conn.execute(sql.toString());              //ejecuta sentencia sql
            delete = true;
        } catch (Exception e) {
            
        } finally {
            this.conn.close();                  //cierra la conexion
        }
        return delete;                              //devuelve el valor de la bandera
    }
    
    
}
