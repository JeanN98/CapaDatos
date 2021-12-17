/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capadedatos;

import dao.usuariio_cargoImp;
import dao.usuario_cargoDao;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public class CapaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        usuario_cargo usu = new usuario_cargo();
        usuario_cargoDao usua= new usuariio_cargoImp();
        
        usua.save(usu);
    }
    
}
