/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import Restricciones.NivelesAcceso;
import Restricciones.NivelesAccesoI;
import Services.gestionarArticulo;
import Services.gestionarArticuloImp;
import dao.articuloDao;
import dao.articuloImp;
import java.util.List;
import model.articulo;
import model.bodega_sucursal;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public class Inventario implements InventarioI{
    
    articulo articulo;    
    bodega_sucursal sucursal;
  
    /* tiene  articulos  
    
    tiene bodega
  
    
    */
      
    
    ///////////////////////////////////////////////////////////////////
    
    @Override
    public void ArticulosSucursal(usuario_cargo usuario, int Id_sucursal){
    
        NivelesAccesoI nivelacs = new NivelesAcceso();
    
       
        try{
        
            if(nivelacs.ACSAdmin(usuario)<=2 ||nivelacs.ACSGerente(usuario)<=2){
            
                
                articuloDao listaArticulos = new articuloImp();
                
                List<articulo> ListaInventario =listaArticulos.list();
                System.out.println("Sucursal Id" + Id_sucursal);
                
                for(int i = 0 ;i <ListaInventario.size();i++){
                
                  if(ListaInventario.get(i).getID_BODEGA() == Id_sucursal){

                     
                      System.out.println(ListaInventario.get(i).getID_ARTICULO());
                      System.out.println(ListaInventario.get(i).getDESCRIPCION());
                      System.out.println(ListaInventario.get(i).getNOMBRE());
                      System.out.println(ListaInventario.get(i).getSTOCK());
                      System.out.println(ListaInventario.get(i).getUNIDAD_MEDIDA());
                      
                  
                  }
                      
                }
                
            
            }
            else{
                System.out.println("el usuario no tiene el nivel de acceso correcto");
            } 
               
        
        
        }
        catch(Exception e)
        {
        
        }
         
    }
    
    
    
    
    
    
}
