/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.kardex;

/**
 *
 * @author Stalin
 */
public interface kardexDao {
    public List<kardex> list();    //prototipo metodo listar
    public kardex edit(int id);    //prototipo metodo editar
    public boolean save (kardex kardex);   //prototipo metodo guardar
    public boolean delete(int id);      //prototipo metodo borrar
}
