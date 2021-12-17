/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PIERO
 */
public abstract class FactoryConexionMysql extends  ConnectionDb {
   
    
        public FactoryConexionMysql(String[] params) {  //recibve un array de string parametros
        this.params = params;    //el atributo params de superclase recibe el parametro del constructor
        this.open();        //llama al metodo que se implementa abajo
    }
    ///comentario
        public static Connection getConexion(){
            
            String conexionUrsl = "jdbc:sqlserver://localhost:1433;"
              + "database=retinvtl;"
               +"user=stalindb;"
               +"password= 12345;"
               +"loginTimeout=30;"; 
           try {
               Connection con = DriverManager.getConnection(conexionUrsl);
               return con;
           }catch(SQLException ex){
               System.out.println(ex.toString());
               return null;
           }
        }

}