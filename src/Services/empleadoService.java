/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import model.empleado;

/**
 *
 * @author Stalin
 */
public interface empleadoService {
    
    public void regsitrarEmpleado();
    public void eliminarEmpelado();
    public void listarEmpleados();
    public void modificarEmpleados();
    public empleado buscarEmpleado(String ci_empleado);
}
