/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import dao.bodega_sucursalImp;
import dao.empleadoDao;
import dao.empleadoImp;
import java.util.List;
import java.util.Scanner;
import model.bodega_sucursal;
import model.empleado;

/**
 *
 * @author Stalin
 */
public class empleadoServiceImp implements empleadoService {
    
    public  Scanner sc = new Scanner(System.in);
    public ValidacionCedula ValidarCedula = new ValidacionCedula();
    
    @Override
    public void regsitrarEmpleado() {
        String CI;
        String Nombre;
        String Direccion;
        String FechaInicio;
        String FechaFin;
        
        System.out.println("Porfavor Inserta los datos del nuevo empleado a modificar");
        
        System.out.println("Cedula:");
        CI= sc.nextLine();
        System.out.println("Nombre");
        Nombre= sc.nextLine();
        System.out.println("Direccion");
        Direccion= sc.nextLine();
        System.out.println("FecgaInicio");
        FechaInicio = sc.nextLine();
        System.out.println("FechaFin");
        FechaFin= sc.nextLine();
        
        
        
        try {
            if (ValidarCedula.ValidarCedula(CI)){
        empleado emple = new empleado(CI, Nombre, Direccion, FechaInicio, FechaFin, 1);
        empleadoDao empleDao = new empleadoImp();
        empleDao.save(emple);
            }else {
                System.out.println("Datos no insertados, la cédula ingresada no es válida");
            }
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }

    @Override
    public void eliminarEmpelado() {
        int id_empleado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id empleado");
        id_empleado = sc.nextInt();
        empleado emple = new empleado ();
        empleadoDao empleDao = new empleadoImp();
        
        empleDao.delete(id_empleado);
    }

    @Override
    public void listarEmpleados() {
        empleado emple = new empleado ();
        empleadoDao empleDao = new empleadoImp();
        for (int i=0; i< (empleDao.list()).size(); i++){
            empleado e = (empleDao.list()).get(i);
            System.out.println(e.getID_EMPLEADO()+" "+ e.getCI_EMPLEADO() + " "+  e.getNOMBRE() + " "+ e.getDIRECCION() + " "+  e.getFECHA_INICIO()+ " "+ e.getFECHA_FINAL());
        }
    }
    
    @Override
    public void modificarEmpleados() {
        int id_empleado;
        String CI;
        String Nombre;
        String Direccion;
        String FechaInicio;
        String FechaFin;
        System.out.println("Porfavr ingrese el  id empleado a modificar");
        id_empleado = sc.nextInt();
        
        
        System.out.println("Porfavor Inserta los nuevos datos \n");
        System.out.println("Cedula:");
        CI= sc.nextLine();
        System.out.println("Nombre");
        Nombre= sc.nextLine();
        System.out.println("Direccion");
        Direccion= sc.nextLine();
        System.out.println("FecgaInicio");
        FechaInicio = sc.nextLine();
        System.out.println("FechaFin");
        FechaFin= sc.nextLine();
        
          try {
            if (ValidarCedula.ValidarCedula(CI)){
        empleado emple = new empleado (CI, Nombre, Direccion, FechaInicio, FechaFin, 1);
        empleadoDao empleDao = new empleadoImp();
        empleDao.edit(id_empleado);
            }else{
                System.out.println("Datos no insertados, la cédula ingresada no es válida");
            }
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }
    
    @Override 
    public empleado  buscarEmpleado(String ci_empleado){
        System.out.println("adasd");
         
        empleado emple = new empleado();
        empleadoDao empleDao = null;

        try {
            //VALIDAR REGLAS NEGOCIO
  
              
                empleDao = new empleadoImp();
                
                List<empleado> listaEmpleado = empleDao.list();
                
                for(int i=0; i< listaEmpleado.size();i++)
                {
                
                    if (listaEmpleado.get(i).getCI_EMPLEADO().contains(ci_empleado)){
                        emple = listaEmpleado.get(i);
                        System.out.println("El empleado se ha encontrado con exito");
                       // System.out.println(emple.getID_EMPLEADO()+" "+ emple.getCI_EMPLEADO() + " "+  emple.getNOMBRE() + " "+ emple.getDIRECCION() + " "+  emple.getFECHA_INICIO()+ " "+ emple.getFECHA_FINAL());
                    }
                    else{
                         throw new Exception("no se encontro un empleado con ese CI ");                        
                    }                                   
                }
                
          
        } catch (Exception e) {
           
        }
        
       
      return emple;  
    }
    

    
}
