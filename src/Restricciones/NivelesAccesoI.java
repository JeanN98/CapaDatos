/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Restricciones;

import model.empleado;
import model.usuario_cargo;

/**
 *
 * @author PIERO
 */
public interface NivelesAccesoI {
    
    public int ACSAdmin(usuario_cargo usuario);
    public int ACSGerente(usuario_cargo usuario);
    public int ACSEmpleado(empleado usuario);
    
}
