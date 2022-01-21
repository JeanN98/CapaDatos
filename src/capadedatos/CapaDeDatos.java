/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capadedatos;


import Inventario.Inventario;
import Inventario.InventarioI;
import Inventario.MovimientosInventario;
import Services.CalculoStockI;
import Services.CalculoStockImp;
import Services.GestionarSucursalBodegaI;
import Services.GestionarSucursalBodegaImp;
import Services.empleadoService;
import Services.empleadoServiceImp;
import Services.gestionarArticulo;
import Services.gestionarArticuloImp;
import dao.bodega_sucursalDao;
import dao.bodega_sucursalImp;
import dao.empleadoDao;
import dao.empleadoImp;
import dao.kardexDao;
import dao.kardexImp;
import dao.usuariio_cargoImp;
import dao.usuario_cargoDao;
import model.articulo;
import model.bodega_sucursal;
import model.empleado;
import model.kardex;
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
        
      /*  usuario_cargo usu = new usuario_cargo(0, "0605816602", 1, "stalin","0959440770", "Av Simepre viva", "Stalin","admin");
        usuario_cargoDao usua= new usuariio_cargoImp();
        
    
        
        bodega_sucursal  bode = new bodega_sucursal(0,"06001100202", "sucursal1", "av siempre viva", "0959440770", 1);
        bodega_sucursalDao bodeDao = new bodega_sucursalImp();
        empleado emple = new empleado("0602963233", "Darwin", "Av Alborada del sur ", "29-12-2021", "01-01-2022", 1);
        empleadoDao empleDao = new empleadoImp();
    */
        
        
       // empleDao.save(emple);
       //bodeDao.save(bode);
        //empleDao.save(emple);
        
     /*   empleadoService empleImp = new empleadoServiceImp();

        
        
         usua.save(usu);
         bodeDao.save(bode);
         empleDao.save(emple);
         */
       //  empleImp.regsitrarEmpleado();
      // empleImp.listarEmpleados();
      // empleImp.buscarEmpleado();
      // empleImp.modificarEmpleados();
       

        //empleImp.regsitrarEmpleado();
       // empleImp.listarEmpleados();
       // empleImp.modificarEmpleados();
        // empleImp.buscarEmpleado();
         
       //  bodega_sucursal sucursal = new bodega_sucursal();
       /*  usuario_cargo admin =  new usuario_cargo(); 
         bodega_sucursal sucursal = new bodega_sucursal ();
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
        if( bodega.CrearNuevaSucBod(sucursal, admin)==true)
          System.out.println("true");
      if( bodega.ModSucBod(admin, "0504829904")==true)
          System.out.println("true"); 
         System.out.println(bodega.BuscarSucBod(admin, "0504829904").getNOMBRE());
      */
   // GestionarSucursalBodegaI bodega = new GestionarSucursalBodegaImp();
      empleado emple = new empleado();
     articulo art = new articulo();
     
       
     MovimientosInventario inventario = new   MovimientosInventario();
    inventario.EntradasArticulos(emple, art);
    
    
 //  articulo arti = new articulo();  
 //gestionarArticulo art = new   gestionarArticuloImp ();
   
   
  // arti = art.buscarArticulo(1);
       //System.out.println(arti.getNOMBRE());
       
      
      // empleadoService emplea = new empleadoServiceImp();
     
      //  emple= emplea.buscarEmpleado("0602963233");
        //System.out.println(emple.getNOMBRE());
      
       InventarioI Inv = new  Inventario();
        usuario_cargo usu = new usuario_cargo( "0605816602", 1, "stalin","0959440770", "Av Simepre viva", "Stalin","admin");
        usuario_cargoDao usua= new usuariio_cargoImp();
        
       Inv.ArticulosSucursal(usu, 1);
     
    }
    
}
