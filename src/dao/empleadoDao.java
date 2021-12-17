/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.empleado;

/**
 *
 * @author Stalin
 */
public interface empleadoDao {
    public List<empleado> list();    //prototipo metodo listar
    public empleado edit(int id);    //prototipo metodo editar
    public boolean save (empleado kardex);   //prototipo metodo guardar
    public boolean delete(int id);      //prototipo metodo borrar
}
