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
public class kardex {
       private int ID_KARDEX;
       private int ID_EMPLEADO;
       private String FECHA_REGISTRO;
       private float CANTIDAD;
       private String TIPO;

    public kardex(int ID_KARDEX, int ID_EMPLEADO, String FECHA_REGISTRO, float CANTIDAD, String TIPO) {
        this.ID_KARDEX = ID_KARDEX;
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.FECHA_REGISTRO = FECHA_REGISTRO;
        this.CANTIDAD = CANTIDAD;
        this.TIPO = TIPO;
    }

       
       
    public int getID_KARDEX() {
        return ID_KARDEX;
    }

    public void setID_KARDEX(int ID_KARDEX) {
        this.ID_KARDEX = ID_KARDEX;
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    public float getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(float CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }
       
       
       
       
}
