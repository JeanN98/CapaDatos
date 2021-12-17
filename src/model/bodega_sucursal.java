/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Stalin
 */
public class bodega_sucursal {
   private int  ID_BODEGA;
   private String RUC_SUCURSAL;
   private String NOMBRE;
   private String DIRECCION;
   private String  TELEFONO;
   private String  ID_USUARIO_CARGO;

    public bodega_sucursal(String RUC_SUCURSAL, String NOMBRE, String DIRECCION, String TELEFONO, String ID_USUARIO_CARGO) {
        this.RUC_SUCURSAL = RUC_SUCURSAL;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.ID_USUARIO_CARGO = ID_USUARIO_CARGO;
    }
   
   

    public int getID_BODEGA() {
        return ID_BODEGA;
    }

    public void setID_BODEGA(int ID_BODEGA) {
        this.ID_BODEGA = ID_BODEGA;
    }

    public String getRUC_SUCURSAL() {
        return RUC_SUCURSAL;
    }

    public void setRUC_SUCURSAL(String RUC_SUCURSAL) {
        this.RUC_SUCURSAL = RUC_SUCURSAL;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getID_USUARIO_CARGO() {
        return ID_USUARIO_CARGO;
    }

    public void setID_USUARIO_CARGO(String ID_USUARIO_CARGO) {
        this.ID_USUARIO_CARGO = ID_USUARIO_CARGO;
    }
   
   
}
