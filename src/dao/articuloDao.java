/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.articulo;

/**
 *
 * @author Stalin
 */
public interface articuloDao {

    
    public List<articulo> list();    //prototipo metodo listar
    public articulo edit(int id);    //prototipo metodo editar
    public boolean save (articulo articulo);   //prototipo metodo guardar
    public boolean delete(int id);      //protot
    


}
