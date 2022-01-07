/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import model.articulo;

/**
 *
 * @author Stalin
 */
public class CalculoPorductoCaducar {
    
  public String CalularEstadoProducto(int day, articulo art) throws ParseException{
  
      int milisecondsByDay = 86400000;
      SimpleDateFormat formato =  new SimpleDateFormat("dd/MM/yyyy");
      Date fecha_caducidad = formato.parse(art.getFECHA_CADUCIDAD());
      Date fecha_actual = new Date(System.currentTimeMillis());
      int dias = (int) (( fecha_caducidad.getTime()-fecha_actual.getTime()) / milisecondsByDay);
      
      if (dias >=10){
       return "Buen estado";
      }else{
          if (dias< 10 && dias >0){
              return "Proximo a caducar";
          }
      }
      return "Caducado";

  }
    
    
}
