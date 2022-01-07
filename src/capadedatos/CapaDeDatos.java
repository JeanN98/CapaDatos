/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capadedatos;

import dao.bodega_sucursalDao;
import dao.bodega_sucursalImp;
import dao.empleadoDao;
import dao.empleadoImp;
import dao.usuariio_cargoImp;
import dao.usuario_cargoDao;
import model.bodega_sucursal;
import model.empleado;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public class CapaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //usuario_cargo usu = new usuario_cargo(0, "0605816602", 1, "stalin","0959440770", "Av Simepre viva", "Stalin","admin");
        //usuario_cargoDao usua= new usuariio_cargoImp();
        
    
        
      //  bodega_sucursal  bode = new bodega_sucursal(0,"06001100202", "sucursal1", "av siempre viva", "0959440770", 1);
       // bodega_sucursalDao bodeDao = new bodega_sucursalImp();
        empleado emple = new empleado("0602963233", "Darwin", "Av Alborada del sur ", "29-12-2021", "01-01-2022", 1);
        empleadoDao empleDao = new empleadoImp();
        //empleado emple = new empleado("0605816602", "STALIN" ,"av. siempre viva", "14-10-2020", "12-11-2021");
       // empleadoDao empleDao = new empleadoImp();
        
        
        empleDao.save(emple);
       //bodeDao.save(bode);
        //empleDao.save(emple);
        
    }
    
}
