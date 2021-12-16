/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

/**
 *
 * @author PIERO
 */
public class FactoryConexionMysql extends ConexionDb{
    
        public FactoryConexionMysql(String[] params) {  //recibve un array de string parametros
        this.params = params;    //el atributo params de superclase recibe el parametro del constructor
        this.open();        //llama al metodo que se implementa abajo
    }
    @Override
    public Connection open() {   //implementacion del metodo abstracto que abre bd
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+this.params[0], this.params[1], this.params[2]);  //subindice 0: nombre bd. paremtro 1: usr; parametro 2: clave.. llega en constructor
        } catch (Exception e){
            e.printStackTrace();
        }
        return this.connection;     //devuelve la conexion q es atributo declarada en superclase
    
}

}