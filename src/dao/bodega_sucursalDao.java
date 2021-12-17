/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import model.bodega_sucursal;

/**
 *
 * @author Stalin
 */
public interface bodega_sucursalDao {
    
    
    public List<bodega_sucursal> list();    //prototipo metodo listar
    public bodega_sucursal edit(int id);    //prototipo metodo editar
    public boolean save (bodega_sucursal bodega);   //prototipo metodo guardar
    public boolean delete(int id);      //protot
    
}
