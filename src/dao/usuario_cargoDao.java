/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.usuario_cargo;

/**
 *
 * @author Stalin
 */
public interface usuario_cargoDao {
    
    
    public List<usuario_cargo> list();    //prototipo metodo listar
    public usuario_cargo edit(int id);    //prototipo metodo editar
    public boolean save (usuario_cargo usuario);
    public boolean delete(int id);      //protot
    
}
