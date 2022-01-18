/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capadedatos;

<<<<<<< HEAD
=======
import Services.CalculoStockI;
import Services.CalculoStockImp;
import Services.GestionarSucursalBodegaI;
>>>>>>> 204b3ccfedd9e29de27a34360caf309d7546f1f1
import Services.GestionarSucursalBodegaImp;
import Services.empleadoService;
import Services.empleadoServiceImp;
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
       // empleado emple = new empleado("0602963233", "Darwin", "Av Alborada del sur ", "29-12-2021", "01-01-2022", 1);
       // empleadoDao empleDao = new empleadoImp();
        //empleado emple = new empleado("0605816602", "STALIN" ,"av. siempre viva", "14-10-2020", "12-11-2021");
       // empleadoDao empleDao = new empleadoImp();
        
        
       // empleDao.save(emple);
       //bodeDao.save(bode);
        //empleDao.save(emple);
        
        empleadoService empleImp = new empleadoServiceImp();
<<<<<<< HEAD
        bodega_sucursal sucursal = new bodega_sucursal ();
        

       //empleImp.regsitrarEmpleado();
       empleImp.listarEmpleados();
       empleImp.buscarEmpleado();
       empleImp.modificarEmpleados();
       
=======
        //empleImp.regsitrarEmpleado();
       // empleImp.listarEmpleados();
       // empleImp.modificarEmpleados();
         empleImp.buscarEmpleado();
         
         bodega_sucursal sucursal = new bodega_sucursal();
         usuario_cargo admin =  new usuario_cargo(); 
         
         admin.setCI_USUARIO_CARGO("0504829904");
         admin.setCONTRACENIA("1234");
         admin.setDIRECCION("ambato");
         admin.setROl(1);
         
        CalculoStockI pruebaC;
       pruebaC = new CalculoStockImp();
       pruebaC.StockMinimo();
       pruebaC.StockMinSeguridad();
       pruebaC.StockSeguridad();
       pruebaC.StockMaximo();
       
       GestionarSucursalBodegaI bodega = new GestionarSucursalBodegaImp();
       
      if( bodega.CrearNuevaSucBod(sucursal, admin)==true)
          System.out.println("true");
      if( bodega.ModSucBod(admin, "0504829904")==true)
          System.out.println("true"); 
      
      
      System.out.println(bodega.BuscarSucBod(admin, "0504829904").getNOMBRE());
       
         
         
>>>>>>> 204b3ccfedd9e29de27a34360caf309d7546f1f1
        
    }
    
}
