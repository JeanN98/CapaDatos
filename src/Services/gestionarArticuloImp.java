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
    public void modificarArticulo(articulo articulo) {
       
          try {
            
       articuloDao artDao = new articuloImp();
        artDao.edit(articulo.getID_ARTICULO());
           
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
    }

    @Override
    public articulo buscarArticulo(int Id_Articulo ) {
         
        System.out.println("tetwrwe");     
        articulo art = new articulo ();
          articuloDao artDao  = new articuloImp();
       
        
        try {
            //VALIDAR REGLAS NEGOCIO  
              
          
                
                List<articulo> listaArticulo =  artDao.list();
                
                for(int i=0; i< listaArticulo.size();i++)
                {
                
                    if (listaArticulo.get(i).getID_ARTICULO()==Id_Articulo){
                         art = listaArticulo.get(i);
                        System.out.println("El articulo se ha encontrado con exito");
               
                        
                    }
                    else{
                         throw new Exception("no se encontro un articulo con ese ID ");                        
                    }                                   
                }
                
          
        } catch (Exception e) {
           
        }
        return art;
    }
    
}
