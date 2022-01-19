/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import dao.categoriaArticuloDao;
import dao.categoriaArticuloImp;
import dao.empleadoDao;
import dao.empleadoImp;
import java.util.List;
import java.util.Scanner;
import model.categoriaArticulo;


/**
 *
 * @author Stalin
 */
public class gestionarCategoriaImp implements gestionarCategoria{
        
   
   public  Scanner sc = new Scanner(System.in); 
    
    @Override
    public void regsitrarCategoria() {
        
        String NOMBRE ="categoria1";
        String DESCRIPCION="descripcionde la categoria 1";
        
        try {
       categoriaArticulo cate = new categoriaArticulo (NOMBRE, DESCRIPCION);
       categoriaArticuloDao cateDao = new categoriaArticuloImp();
        cateDao.save(cate);
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public void eliminarCategoria() {
        int ID_CATEGORIA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id empleado");
        ID_CATEGORIA = sc.nextInt();
        categoriaArticulo cate = new categoriaArticulo ();
        empleadoDao empleDao = new empleadoImp();
        
        empleDao.delete(ID_CATEGORIA);
    }

    @Override
    public void listarCategoria() {
     
        categoriaArticuloDao cateDao = new categoriaArticuloImp();
        for (int i=0; i< (cateDao .list()).size(); i++){
            categoriaArticulo e = (cateDao.list()).get(i);
            
            System.out.println(e.getID_CATEGORIA() + " " + e.getNOMBRE_CATEGORIA() + " " + e.getDESCRIPCION_CATEGORIA() );
        }
    }

    @Override
    public void modificarCategoria() {
   
        int ID_CATEGORIA;
        String NOMBRE;
        String DESCRIPCION;
        System.out.println("Porfavr ingrese el  id de la categoría modificar");
       ID_CATEGORIA = sc.nextInt();
        
        
        System.out.println("Porfavor Inserta los nuevos datos \n");
        System.out.println("NOMBRE:");
        NOMBRE= sc.nextLine();
        System.out.println("DESCRIPCION:");
        DESCRIPCION= sc.nextLine();
     
          try {
      
        categoriaArticulo cate = new  categoriaArticulo(NOMBRE, DESCRIPCION);
        categoriaArticuloDao cateDao = new  categoriaArticuloImp();
        cateDao.edit(ID_CATEGORIA);
         
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }

    @Override
    public void buscarCategoria() {
        String Nombre; 
         
        categoriaArticulo cate = new categoriaArticulo();
        categoriaArticuloDao cateDao = null;
        
        System.out.println("Porfavor ingresa el numero de cedula del empleado a buscar:");
        Nombre= sc.nextLine();
        try {
            //VALIDAR REGLAS NEGOCIO
  
              
                cateDao = new categoriaArticuloImp();
                
                List<categoriaArticulo>  listaCategoria = cateDao.list();
                
                for(int i=0; i<listaCategoria.size();i++)
                {
                
                    if (listaCategoria.get(i).getNOMBRE_CATEGORIA().contains(Nombre)){
                        cate = listaCategoria.get(i);
                        System.out.println("El empleado se ha encontrado con exito");
                        System.out.println(cate.getNOMBRE_CATEGORIA()+ " " + cate.getDESCRIPCION_CATEGORIA());
                    }
                    else{
                         throw new Exception("no se encontro un empleado con ese CI ");                        
                    }                                   
                }
                
          
        } catch (Exception e) {
           
        }
    }
    
}
