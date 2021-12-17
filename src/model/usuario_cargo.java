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
public class usuario_cargo {
      private int ID_PERSONA;
      private int ROl ;
      private String NOMBRE;
      private String TELEFONO;
      private String DIRECCION;
      private String USUARIO;
      private String CONTRACENA;

    public usuario_cargo(int ROl, String NOMBRE, String TELEFONO, String DIRECCION, String USUARIO, String CONTRACENA) {
        this.ROl = ROl;
        this.NOMBRE = NOMBRE;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
        this.USUARIO = USUARIO;
        this.CONTRACENA = CONTRACENA;
    }

      
      
    public int getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(int ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public int getROl() {
        return ROl;
    }

    public void setROl(int ROl) {
        this.ROl = ROl;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getCONTRACENA() {
        return CONTRACENA;
    }

    public void setCONTRACENA(String CONTRACENA) {
        this.CONTRACENA = CONTRACENA;
    }
      
      
      
      
  

}
