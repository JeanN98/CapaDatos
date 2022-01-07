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
public class empleado {
     private int ID_EMPLEADO;
     private String CI_EMPLEADO;
     private String NOMBRE;
     private String DIRECCION;
     private String FECHA_INICIO;
     private String FECHA_FINAL;
     private int ID_BODEGA;

     
     public empleado (){
     
     }
    public empleado(String CI_EMPLEADO, String NOMBRE, String DIRECCION, String FECHA_INICIO, String FECHA_FINAL, int ID_BODEGA) {
        this.CI_EMPLEADO = CI_EMPLEADO;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FINAL = FECHA_FINAL;
        this.ID_BODEGA = ID_BODEGA;
    }

    public empleado(int ID_EMPLEADO, String CI_EMPLEADO, String NOMBRE, String DIRECCION, String FECHA_INICIO, String FECHA_FINAL, int ID_BODEGA) {
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.CI_EMPLEADO = CI_EMPLEADO;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FINAL = FECHA_FINAL;
        this.ID_BODEGA = ID_BODEGA;
    }
    
    
    
    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public String getCI_EMPLEADO() {
        return CI_EMPLEADO;
    }

    public void setCI_EMPLEADO(String CI_EMPLEADO) {
        this.CI_EMPLEADO = CI_EMPLEADO;
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

    public String getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(String FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public String getFECHA_FINAL() {
        return FECHA_FINAL;
    }

    public void setFECHA_FINAL(String FECHA_FINAL) {
        this.FECHA_FINAL = FECHA_FINAL;
    }

    public int getID_BODEGA() {
        return ID_BODEGA;
    }

    public void setID_BODEGA(int ID_BODEGA) {
        this.ID_BODEGA = ID_BODEGA;
    }
     
     
}
