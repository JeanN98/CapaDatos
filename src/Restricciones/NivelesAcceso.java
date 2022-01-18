/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restricciones;

import model.empleado;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public class NivelesAcceso implements NivelesAccesoI {
    
    @Override 
    public int ACSAdmin(usuario_cargo usuario){
        
        int NAcs = 0;
       
        if (1==usuario.getROl() ){
            NAcs =1;
        }
        return NAcs;
               
    }
    @Override 
    public int ACSGerente(usuario_cargo usuario){
        
        int NAcs = 0;
       
        if (2==usuario.getROl() ){
            NAcs =2;
        }
        return NAcs;
               
    }
    @Override 
    public int ACSEmpleado(empleado usuario){
        
        int NAcs = 3;       
       
        return NAcs;
               
    }
    
    
}
