/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import dao.articuloDao;
import dao.articuloImp;
import java.util.List;
import java.util.Scanner;
import model.articulo;

/**
 *
 * @author Stalin
 */
public class gestionarArticuloImp implements gestionarArticulo {
Scanner sc = new Scanner(System.in);
  int ID_CATEGORIA=0;
   int	ID_BODEGA=0;
   String CODIGO_BARRA= " ";
   String NOMBRE=" ";
   float STOCK= 0;
   float PRECIO_UNITARIO=0;
   float PRECIO_TOTAL=0;
   String FECHA_CADUCIDAD= "";
   String DESCRIPCION="";
   String ESTADO ="";
   String UNIDAD_MEDIDA =" ";

    @Override
    public void regsitrarArticulo() {
         
   
 
        try {
            
       articulo art = new articulo (ID_CATEGORIA,ID_BODEGA, CODIGO_BARRA,  NOMBRE,  PRECIO_TOTAL,  FECHA_CADUCIDAD,  STOCK, DESCRIPCION, PRECIO_UNITARIO, ESTADO,  UNIDAD_MEDIDA);
       articuloDao artDao = new articuloImp();
        artDao.save(art);
        
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public void eliminarArticulo() {
        int id_empleado;
     
        System.out.println("Please enter the id empleado");
        id_empleado = sc.nextInt();
         articulo art = new articulo  ();
        articuloDao artDao = new articuloImp();
        
        artDao.delete(id_empleado);
    }

    @Override
    public void listarArticulo() {
       articulo art = new articulo  ();
        articuloDao artDao = new articuloImp();
        for (int i=0; i< (artDao.list()).size(); i++){
           articulo e = (artDao.list()).get(i);
          
        }
    }

    @Override
    public void modificarArticulo() {
        int id_articulo=0;
          try {
    
        articulo art = new articulo ();
       articuloDao artDao = new articuloImp();
        artDao.edit(id_articulo);
           
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }

    @Override
    public void buscarArticulo() {
        String codigo_articulo; 
         
        articulo art = new articulo ();
          articuloDao artDao  = null;
        
        System.out.println("Porfavor ingresa el numero de cedula del empleado a buscar:");
         codigo_articulo = sc.nextLine();
        try {
            //VALIDAR REGLAS NEGOCIO
  
              
                artDao = new articuloImp();
                
                List<articulo> listaArticulo =  artDao.list();
                
                for(int i=0; i< listaArticulo.size();i++)
                {
                
                    if (listaArticulo.get(i).getCODIGO_BARRA().contains(codigo_articulo)){
                         art = listaArticulo.get(i);
                        System.out.println("El empleado se ha encontrado con exito");
                        System.out.println("");
                    }
                    else{
                         throw new Exception("no se encontro un empleado con ese codigo ");                        
                    }                                   
                }
                
          
        } catch (Exception e) {
           
        }
    }
    
}
