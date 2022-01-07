/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import model.bodega_sucursal;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public interface GestionarSucursalBodegaI {
    
    public boolean CrearNuevaSucBod(bodega_sucursal sucursal,usuario_cargo admin);
    public bodega_sucursal BuscarSucBod(usuario_cargo admin,String Ruc);
    public boolean ModSucBod(usuario_cargo admin,String Ruc);
    public boolean EliminarSucBod(usuario_cargo admin,String Ruc);
    
    
}
