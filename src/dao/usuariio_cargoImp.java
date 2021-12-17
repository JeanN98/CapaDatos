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
                sql.append("INSERT INTO [dbo].[USUARIO_CARGO]\n" +
"           ([ID_USUARIO_CARGO]\n" +
"           ,[CI_USUARIO_CARGO]\n" +
"           ,[ROL]\n" +
"           ,[NOMBRE]\n" +
"           ,[TELEFONO]\n" +
"           ,[DIRECCION]\n" +
"           ,[USUARIO]\n" +
"           ,[CONTRACENA])\n" +
"            VALUES\n" +
"           (10\n" +
"           ,'0501771159'\n" +
"           ,1\n" +
"           ,'piere '\n" +
"           ,'0992457515'\n" +
"           ,'en la casita'\n" +
"           ,'piere_spoileador'\n" +
"           ,'piere_spoileador')");      //crear la cadena de conexion
               
                
                
                this.conn.execute(sql.toString());      //ejecuta la query
           
            save = true;                                //cambia estado de bandera
        } catch(Exception e){
            
        } finally {
            this.conn.close();      //cerrar la conexion
        }
        return save; 
    }
    
}
