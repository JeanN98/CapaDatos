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
       private int ID_ARTICULO; 
       private String FECHA_REGISTRO;
       private String DESCRIPCION;
       private float CANTIDAD;
       private float PRECIO_TOTAL; 
       private String TIPO;
       private float SALDO; 

    public kardex( int ID_EMPLEADO, int ID_ARTICULO, String FECHA_REGISTRO, String DESCRIPCION, float CANTIDAD, float PRECIO_TOTAL, String TIPO, float SALDO) {
     
        this.ID_KARDEX=0;
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.ID_ARTICULO = ID_ARTICULO;
        this.FECHA_REGISTRO = FECHA_REGISTRO;
        this.DESCRIPCION = DESCRIPCION;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TIPO = TIPO;
        this.SALDO = SALDO;
    }

       
    public kardex (){}
 
    
    public void setID_KARDEX(int ID_KARDEX) {
        this.ID_KARDEX = ID_KARDEX;
    }
    public int getID_KARDEX() {
        return ID_KARDEX;
    }
    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public void setID_ARTICULO(int ID_ARTICULO) {
        this.ID_ARTICULO = ID_ARTICULO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public void setCANTIDAD(float CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public void setPRECIO_TOTAL(float PRECIO_TOTAL) {
        this.PRECIO_TOTAL = PRECIO_TOTAL;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public void setSALDO(float SALDO) {
        this.SALDO = SALDO;
    }
    

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public int getID_ARTICULO() {
        return ID_ARTICULO;
    }

    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public float getCANTIDAD() {
        return CANTIDAD;
    }

    public float getPRECIO_TOTAL() {
        return PRECIO_TOTAL;
    }

    public String getTIPO() {
        return TIPO;
    }

    public float getSALDO() {
        return SALDO;
    }

       
}
