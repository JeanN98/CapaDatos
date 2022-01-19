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
public class categoriaArticulo {
    private int ID_CATEGORIA;
    private String NOMBRE_CATEGORIA;
    private String DESCRIPCION_CATEGORIA;

    public categoriaArticulo( String NOMBRE_CATEGORIA, String DESCRIPCION_CATEGORIA) {
        this.NOMBRE_CATEGORIA = NOMBRE_CATEGORIA;
        this.DESCRIPCION_CATEGORIA = DESCRIPCION_CATEGORIA;
    }
    public categoriaArticulo (){}

    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }

    public void setID_CATEGORIA(int ID_CATEGORIA) {
        this.ID_CATEGORIA = ID_CATEGORIA;
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
    
}
