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
public class articulo {
    private int ID_ARTICULO;
    private int ID_CATEGORIA;
    private int	ID_BODEGA;
    private String CODIGO_BARRA;
    private String NOMBRE;
    private float PRECIO_TOTAL;
    private String FECHA_CADUCIDAD;
    private float STOCK;
    private String DESCRIPCION;
    private String NOMBRE_CATEGORIA;
    private String DESCRIPCION_CATEGORIA;
    private float PRECIO_UNITARIO;
    private String CODIGO_BARRA_DETALLE;
    private String DESCIPCION_DETALLE;

    public articulo(int ID_ARTICULO, int ID_CATEGORIA, int ID_BODEGA, String CODIGO_BARRA, String NOMBRE, float PRECIO_TOTAL, String FECHA_CADUCIDAD, float STOCK, String DESCRIPCION, String NOMBRE_CATEGORIA, String DESCRIPCION_CATEGORIA, float PRECIO_UNITARIO, String CODIGO_BARRA_DETALLE, String DESCIPCION_DETALLE) {
        this.ID_ARTICULO = ID_ARTICULO;
        this.ID_CATEGORIA = ID_CATEGORIA;
        this.ID_BODEGA = ID_BODEGA;
        this.CODIGO_BARRA = CODIGO_BARRA;
        this.NOMBRE = NOMBRE;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.FECHA_CADUCIDAD = FECHA_CADUCIDAD;
        this.STOCK = STOCK;
        this.DESCRIPCION = DESCRIPCION;
        this.NOMBRE_CATEGORIA = NOMBRE_CATEGORIA;
        this.DESCRIPCION_CATEGORIA = DESCRIPCION_CATEGORIA;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
        this.CODIGO_BARRA_DETALLE = CODIGO_BARRA_DETALLE;
        this.DESCIPCION_DETALLE = DESCIPCION_DETALLE;
    }

    
    
    
    public articulo() {
            }
    
     public int getID_ARTICULO() {
        return ID_ARTICULO;
    } // DEL ID SOLO NOS INTERESA ACCEDER A SU VALOR,MAS NO INSERTARLO
     
     public void setID_ARTICULO(int ID_ARTICULO) {
        this.ID_ARTICULO = ID_ARTICULO;
    }
     
    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }

    public void setID_CATEGORIA(int ID_CATEGORIA) {
        this.ID_CATEGORIA = ID_CATEGORIA;
    }


    public int getID_BODEGA() {
        return ID_BODEGA;
    }

    public void setID_BODEGA(int ID_BODEGA) {
        this.ID_BODEGA = ID_BODEGA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
    
    public float getPRECIO_TOTAL() {
        return PRECIO_TOTAL;
    }

    public void setPRECIO_TOTAL(float PRECIO_TOTAL) {
        this.PRECIO_TOTAL = PRECIO_TOTAL;
    }

    public String getFECHA_CADUCIDAD() {
        return FECHA_CADUCIDAD;
    }

    public void setFECHA_CADUCIDAD(String FECHA_CADUCIDAD) {
        this.FECHA_CADUCIDAD = FECHA_CADUCIDAD;
    }

    public float getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(float STOCK) {
        this.STOCK = STOCK;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getCODIGO_BARRA() {
        return CODIGO_BARRA;
    }

    public void setCODIGO_BARRA(String CODIGO_BARRA) {
        this.CODIGO_BARRA = CODIGO_BARRA;
    }

    public String getNOMBRE_CATEGORIA() {
        return NOMBRE_CATEGORIA;
    }

    public void setNOMBRE_CATEGORIA(String NOMBRE_CATEGORIA) {
        this.NOMBRE_CATEGORIA = NOMBRE_CATEGORIA;
    }

    public String getDESCRIPCION_CATEGORIA() {
        return DESCRIPCION_CATEGORIA;
    }

    public void setDESCRIPCION_CATEGORIA(String DESCRIPCION_CATEGORIA) {
        this.DESCRIPCION_CATEGORIA = DESCRIPCION_CATEGORIA;
    }

    public float getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }

    public void setPRECIO_UNITARIO(float PRECIO_UNITARIO) {
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
    }

    public String getCODIGO_BARRA_DETALLE() {
        return CODIGO_BARRA_DETALLE;
    }

    public void setCODIGO_BARRA_DETALLE(String CODIGO_BARRA_DETALLE) {
        this.CODIGO_BARRA_DETALLE = CODIGO_BARRA_DETALLE;
    }

    public String getDESCIPCION_DETALLE() {
        return DESCIPCION_DETALLE;
    }

    public void setDESCIPCION_DETALLE(String DESCIPCION_DETALLE) {
        this.DESCIPCION_DETALLE = DESCIPCION_DETALLE;
    }
    
    
}
