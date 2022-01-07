/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import dao.bodega_sucursalDao;
import dao.bodega_sucursalImp;
import java.util.List;
import model.usuario_cargo;
import model.bodega_sucursal;


/**
 *
 * @author PIERO
 */
public class GestionarSucursalBodegaImp {
    
    //private usuario_cargo admin ;
    
    // objeto de concexion a la base
    private bodega_sucursalDao almacen;
    //objeto del almacen a crear
    private bodega_sucursal bodega;
    
    public boolean CrearNuevaSucBod(bodega_sucursal sucursal,usuario_cargo admin){
    
        boolean aux= false;
        
        try {
            //VALIDAR REGLAS NEGOCIO
            if (admin.getROl()==1) {
              
                almacen = new bodega_sucursalImp ();
                
                almacen.save(sucursal);
                aux = true;
                
            }else{
                throw new Exception("El usuario debe ser administrador para crear un almacen ");
            }
        } catch (Exception e) {
           
        }
        return aux;
        
    }
    
    
    
    public bodega_sucursal BuscarSucBod(usuario_cargo admin,String Ruc){
        
 
        bodega = null;
        
        try {
            //VALIDAR REGLAS NEGOCIO
            if (admin.getROl()==1) {
              
                almacen = new bodega_sucursalImp ();
                
                List<bodega_sucursal> listaAlmacen = almacen.list();
                
                for(int i=0; i< listaAlmacen.size();i++)
                {
                
                    if (listaAlmacen.get(i).getRUC_SUCURSAL().contains(Ruc)){
                        bodega = listaAlmacen.get(i);
                    }
                    else{
                         throw new Exception("no se encontro el ruc ");                        
                    }                                   
                }
                
            }else{
                throw new Exception("El usuario debe ser administrador para crear un almacen ");
            }
        } catch (Exception e) {
           
        }
        
        return bodega;
    }
    
     public boolean ModSucBod(usuario_cargo admin,String Ruc){
    
        boolean aux= false;
        
        try {
            //VALIDAR REGLAS NEGOCIO
            if (admin.getROl()==1) {
              
                System.out.println(BuscarSucBod(admin,Ruc).getDIRECCION());
                
                BuscarSucBod(admin,Ruc).setDIRECCION("Laracunga");
                
                //BuscarSucBod(admin,Ruc).getDIRECCION();
                System.out.println(BuscarSucBod(admin,Ruc).getID_BODEGA_SUCURSAL());
               
                
                System.out.println(BuscarSucBod(admin,Ruc).getID_USUARIO_CARGO());
                
                BuscarSucBod(admin,Ruc).setID_USUARIO_CARGO(1);
                
                System.out.println(BuscarSucBod(admin,Ruc).getNOMBRE());
                
                BuscarSucBod(admin,Ruc).setNOMBRE("suc 234 ret");
                
                System.out.println(BuscarSucBod(admin,Ruc).getTELEFONO());
                
                BuscarSucBod(admin,Ruc).setTELEFONO("0992451566");
                
                System.out.println(BuscarSucBod(admin,Ruc).getRUC_SUCURSAL());
                
            almacen = new bodega_sucursalImp ();
                
            almacen.edit(BuscarSucBod(admin,Ruc).getID_BODEGA_SUCURSAL());
               aux= true;
                
            }else{
                throw new Exception("El usuario debe ser administrador para crear un almacen ");
            }
        } catch (Exception e) {
           
        }
                
        return aux;
    }
     
      public boolean EliminarSucBod(usuario_cargo admin,String Ruc){
    
        boolean aux= false;
        
        try {
            //VALIDAR REGLAS NEGOCIO
            if (admin.getROl()==1) {
              
                System.out.println(BuscarSucBod(admin,Ruc).getDIRECCION());
                
               
                
                //BuscarSucBod(admin,Ruc).getDIRECCION();
                System.out.println(BuscarSucBod(admin,Ruc).getID_BODEGA_SUCURSAL());
               
                
                System.out.println(BuscarSucBod(admin,Ruc).getID_USUARIO_CARGO());
                
                
                
                System.out.println(BuscarSucBod(admin,Ruc).getNOMBRE());
                
                
                
                System.out.println(BuscarSucBod(admin,Ruc).getTELEFONO());
                
               
                
                System.out.println(BuscarSucBod(admin,Ruc).getRUC_SUCURSAL());
                
            almacen = new bodega_sucursalImp ();
                
            almacen.delete(BuscarSucBod(admin,Ruc).getID_BODEGA_SUCURSAL());
               
            aux= true;
                
            }else{
                throw new Exception("El usuario debe ser administrador para crear un almacen ");
            }
        } catch (Exception e) {
           
        }
        
        return aux;
                
    }
}
