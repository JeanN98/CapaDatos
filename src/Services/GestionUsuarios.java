/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Restricciones.NivelesAcceso;
import model.empleado;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public class GestionUsuarios {
    
       
    public void GestionAdmin (NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==1){
        
            
            
        }
        
        
           
    }
    
    // gestion de los usuarios empleaados por parte del admin
    public void ADGestionEmpleadoCrear(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==1){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.regsitrarEmpleado();
                                    
        }
    
    }
    
    public void ADGestionEmpleadoModificar(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==1){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.modificarEmpleados();
                                    
        }
    
    }
    
    public void ADGestionEmpleadoEliminar(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==1){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.eliminarEmpelado();
                                    
        }
    
    }
    
    
    
    
    
    
    // gestion de los empleados  por parte del gerente
    
    // gestion de los usuarios empleaados por parte del admin
    public void GEGestionEmpleadoCrear(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==2){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.regsitrarEmpleado();
                                    
        }
    
    }
    
    public void GEGestionEmpleadoModificar(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==2){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.modificarEmpleados();
                                    
        }
    
    }
    
    public void GEGestionEmpleadoEliminar(NivelesAcceso nivel, usuario_cargo usuario){
    
        if(nivel.ACSAdmin(usuario)==2){
        
            empleadoService empleado = new empleadoServiceImp();
            empleado.eliminarEmpelado();
                                    
        }
    
    }
    
    
 
}
