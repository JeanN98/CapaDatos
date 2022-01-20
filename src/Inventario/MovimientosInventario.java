/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import Restricciones.NivelesAccesoI;
import Services.CalculoStockI;
import Services.CalculoStockImp;
import Services.ValidacionCedula;
import Services.gestionarArticulo;
import Services.gestionarKardex;
import java.util.Scanner;
import model.articulo;
import model.empleado;


/**
 *
 * @author PIERO
 */
public class MovimientosInventario {
    
    
    // entradas asociamos usuario   empleado    articuos   bodega 
    
    gestionarArticulo MArt ;
    NivelesAccesoI NivelAcs;
    articulo Art;
    gestionarKardex Kardex;
    private int Cantidad ;
    empleado empleado ;
    
    
    Scanner sc = new Scanner(System.in);
    
    
    /////////////////////////////////////////////////////////////////////
    public void EntradasArticulos(empleado empleado){           
    
        try{
            float cantidad = sc.nextFloat();       
                     
        // REGISTRO DEL KARDEX 
        //(int ID_EMPLEADO, int ID_ARTICULO, String DESCRIPCION, float CANTIDAD , float PRECIO_TOTAL, String TIPO, float SALDO);
        Kardex.regsitrarKardex(empleado.getID_EMPLEADO(), Art.getID_ARTICULO(), "DESCRIPCION DEL KARDEX", cantidad, 1500000,"ENTRADA", 15);
        
        Art =   MArt.buscarArticulo(1);
        
        Art.setSTOCK(Art.getSTOCK()+cantidad);           
        
        MArt.modificarArticulo(Art);  
        }
        catch(Exception e){
            System.out.println("Error al ingresar los articulos ");
        
        }
            
        
    
    } 
    /////////////////////////////////////////////////////////////////
    public void SalidasArticulos(empleado empleado){           
    
       
        try{
            float cantidad = sc.nextFloat();       
        
        CalculoStockI stockminimo = new CalculoStockImp(); 
             
        // REGISTRO DEL KARDEX 
        //(int ID_EMPLEADO, int ID_ARTICULO, String DESCRIPCION, float CANTIDAD , float PRECIO_TOTAL, String TIPO, float SALDO);
        Kardex.regsitrarKardex(empleado.getID_EMPLEADO(), Art.getID_ARTICULO(), "DESCRIPCION DEL KARDEX", cantidad, 1500000,"ENTRADA", 15);
        
        Art =   MArt.buscarArticulo(1);
        
        if ((Art.getSTOCK()- cantidad) >= stockminimo.StockMinimo() )
        {
        Art.setSTOCK(Art.getSTOCK()- cantidad);           
        
        MArt.modificarArticulo(Art); 
        }
        else
            System.out.println("Advertencia el Stock Actual es inferior al Stock minimo");
            
        }
        catch(Exception e){
            System.out.println("Error al ingresar los articulos ");
        
        }
            
    } 
}
