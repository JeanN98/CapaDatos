/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import dao.kardexDao;
import dao.kardexImp;
import java.util.List;
import java.util.Scanner;
import model.kardex;

/**
 *
 * @author Stalin
 */
public class gestionarKardexImp implements gestionarKardex{
     public  Scanner sc = new Scanner(System.in); 
      
      int ID_EMPLEADO;
      int ID_ARTICULO; 
      String FECHA_REGISTRO;
      String DESCRIPCION;
      float CANTIDAD;
      float PRECIO_TOTAL; 
      String TIPO;
      float SALDO; 


    @Override
    public void regsitrarKardex() {
       
        
        try {
       kardex kardex = new kardex (ID_EMPLEADO,ID_ARTICULO,  FECHA_REGISTRO,  DESCRIPCION,  CANTIDAD,  PRECIO_TOTAL, TIPO,  SALDO);
       kardexDao kardexDao = new  kardexImp();
        kardexDao.save(kardex);
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public void eliminarKardex() {
       int ID_KARDEX;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id empleado");
        ID_KARDEX = sc.nextInt();
        kardexDao kardexDao = new  kardexImp();
       
        
        kardexDao.delete(ID_KARDEX);
    }

    @Override
    public void listarKardex() {
        kardexDao cateDao = new kardexImp();
        for (int i=0; i< (cateDao .list()).size(); i++){
            kardex e = (cateDao.list()).get(i);
            
            
        }
    }

    @Override
    public void modificarKardex() {
        int ID_CATEGORIA=0;
            try {
      
         kardexDao kardexDao = new  kardexImp();
        kardexDao.edit(ID_CATEGORIA);
         
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }

    @Override
    public void buscarKardex() {
        int id_kardex;
       kardex kardex1 = new kardex();
       kardexDao kardexDao = null;
        
        System.out.println("Porfavor ingresa el numero de cedula del empleado a buscar:");
         id_kardex = sc.nextInt();
        try {
            //VALIDAR REGLAS NEGOCIO
  
              
                kardexDao = new kardexImp();
                
                List<kardex>  listaKardex = kardexDao.list();
                
                for(int i=0; i<listaKardex.size();i++)
                {
                
                    if (listaKardex.get(i).getID_KARDEX()== id_kardex){
                        kardex1 = listaKardex.get(i);
                        System.out.println("El empleado se ha encontrado con exito");
                        //System.out.println(cate.getNOMBRE_CATEGORIA()+ " " + cate.getDESCRIPCION_CATEGORIA());
                    }
                    else{
                         throw new Exception("no se encontro un empleado con ese CI ");                        
                    }                                   
                }
                
          
        } catch (Exception e) {
           
        }
    }
    
}
