/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import dao.empleadoDao;
import dao.empleadoImp;
import java.util.Scanner;
import model.empleado;

/**
 *
 * @author Stalin
 */
public class empleadoServiceImp implements empleadoService {
    @Override
    public void regsitrarEmpleado() {
        String CI;
        String Nombre;
        String Direccion;
        String FechaInicio;
        String FechaFin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor Inserta los datos del nuevo empleado a ingresar\n");
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
        empleado emple = new empleado(CI, Nombre, Direccion, FechaInicio, FechaFin, 1);
        empleadoDao empleDao = new empleadoImp();
        empleDao.save(emple);
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
            System.out.println(e.getCI_EMPLEADO() + e.getDIRECCION() + e.getFECHA_INICIO()+ e.getFECHA_FINAL() + e.getNOMBRE());
        }
    }
    
    @Override
    public void modificarEmpleados() {
        int id_empleado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id empleado");
        id_empleado = sc.nextInt();
        
        empleado emple = new empleado ("0602963293", "Darwin4", "Av Alborada del sur9 ", "29-12-2021", "01-01-2022", 1);
        empleadoDao empleDao = new empleadoImp();
        empleDao.edit(id_empleado);
    }
    
    @Override 
    public void  buscarEmpleado(){
    
    }
}
