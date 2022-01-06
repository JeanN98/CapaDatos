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
      private int ID_USUARIO_CARGO;
      private String CI_USUARIO_CARGO;
      private int ROl ;
      private String NOMBRE;
      private String TELEFONO;
      private String DIRECCION;
      private String USUARIO;
      private String CONTRACENIA;

    public usuario_cargo(int ID_USUARIO_CARGO, String CI_USUARIO_CARGO, int ROl, String NOMBRE, String TELEFONO, String DIRECCION, String USUARIO, String CONTRACENIA) {
        this.ID_USUARIO_CARGO = ID_USUARIO_CARGO;
        this.CI_USUARIO_CARGO = CI_USUARIO_CARGO;
        this.ROl = ROl;
        this.NOMBRE = NOMBRE;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
        this.USUARIO = USUARIO;
        this.CONTRACENIA= CONTRACENIA;
    }



    public usuario_cargo() {
      
    }

    public void setID_USUARIO_CARGO(int ID_USUARIO_CARGO) {
        this.ID_USUARIO_CARGO = ID_USUARIO_CARGO;
    }

    
    public int getID_USUARIO_CARGO() {
        return ID_USUARIO_CARGO;
    }
    
    public void setCI_USUARIO_CARGO(String CI_USUARIO_CARGO) {
        this.CI_USUARIO_CARGO = CI_USUARIO_CARGO;
    }

    public void setROl(int ROl) {
        this.ROl = ROl;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public void setCONTRACENIA(String CONTRACENIA) {
        this.CONTRACENIA = CONTRACENIA;
    }

    
    public String getCI_USUARIO_CARGO() {
        return CI_USUARIO_CARGO;
    }

    public int getROl() {
        return ROl;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public String getCONTRACENIA() {
        return CONTRACENIA;
    }

      

      
      
  

}
