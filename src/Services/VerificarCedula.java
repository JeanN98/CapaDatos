/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author PIERO
 */
public class VerificarCedula {
    
    public boolean verificarCI(char[] ci)
    {
        boolean res = false;
       
        int total =0;
        
        if (ci.length ==10)
        {
            for(int i=0 ;i<10;i++)
            {
               int aux = Integer.parseInt(String.valueOf(ci[i]))-48;
                ci[i]= (char) aux ;
                
            }
            for(int i=0 ;i<=8;i=i+2)
            {
               int aux = Integer.parseInt(String.valueOf(ci[i]))*2;
               int aux2;
                ci[i]= (char) aux ;
                if(ci[i]>=10)
                {
                    aux2 = Integer.parseInt(String.valueOf(ci[i]))-9;
                    ci[i]= (char) aux2 ;
                    
                }              
            }
            
            for(int i=0 ;i<=8;i++)
            {                      
                total =total+Integer.parseInt(String.valueOf(ci[i]));               
            }
            
            for(int i=0;i<=9;i++)
            {
                if((total % 10)!=0)
                {
                    if(  ((total+10) -  (total%10)  -total)==ci[9]  )
                    {
                        res=true;
                    }
                }
                else
                {
                    if(   (total-total) == ci[9]  )
                    {
                        res=true;
                    }
                }
            
            }
        
        }
        
        
        return res;
    
        
    }
    
}
