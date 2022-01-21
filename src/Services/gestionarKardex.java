/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author Stalin
 */
public interface gestionarKardex {
    public void regsitrarKardex(int ID_EMPLEADO, int ID_ARTICULO, String FECHA_REGISTRO, String DESCRIPCION, float CANTIDAD , float PRECIO_TOTAL, String TIPO, float SALDO);
    public void eliminarKardex();
    public void listarKardex();
    public void modificarKardex();
    public void buscarKardex();
}
