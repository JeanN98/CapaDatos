/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.util.Scanner;

/**
 *
 * @author PIERO
 */
public class CalculoStockImp implements CalculoStockI{
    
    CalculoStockImp(){}
    
    //Stock Máximo = (Tiempo de Entrega Habitual del Proveedor) x (Consumo Promedio) + Stock Mínimo = Stock Mínimo * 2
    
    
    //Mínimo de Seguridad = (Tiempo de Entrega con Retraso – Tiempo de Entrega Habitual) x (Consumo Promedio)
    
    
    //Stock Mínimo = (Tiempo de Entrega Habitual del Proveedor) x (Consumo Promedio)
    
    //Stock de Seguridad = Stock Mínimo + Mínimo de Seguridad,
    
    
    public int StockMinimo(){
    
        Scanner in = new Scanner(System.in);
        
        // datos generales
 
        System.out.println("Tiempo de abastecimiento");
        
        int TAbas = in.nextInt();
        
        System.out.println("Consumo promedio ");       
        
        int Consumo = in.nextInt();
        
        
        // aqui se puede utilizar un algotitmo usando kardex como no tenemos todavia  se ingresa manualmente 
        
       return  TAbas * Consumo;        
    
    }
    
    
    public int StockMinSeguridad(){
    
        Scanner in = new Scanner(System.in);
        
        // datos generales
 
        System.out.println("Tiempo de abastecimiento con retraso");
        
        int TAbasRetraso = in.nextInt();
        
        System.out.println("Tiempo de abastecimiento");
        
        int TAbas = in.nextInt();
        
        System.out.println("Consumo promedio ");       
        
        int Consumo = in.nextInt();
                
        // aqui se puede utilizar un algotitmo usando kardex como no tenemos todavia  se ingresa manualmente 
        
       return  (TAbasRetraso - TAbas) * Consumo;        
    
    }
    
    public int StockSeguridad(){    
       
       return  StockMinSeguridad()+ StockMinimo();       
    
    }
    
    public int StockMaximo(){
    
    return StockMinimo() *2;
    
    }
    
}
