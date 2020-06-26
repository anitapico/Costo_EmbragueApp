/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costo_embragueapp;

/**
 *
 * @author Ana Pico Solis
 */
class Costo_Embrague {

    //Atributos
    private String proceso;
    private double costo_cambio;
    
    //Constructores
    public Costo_Embrague(String proceso){
        this(proceso,0); //Sobrecarga
    }
    
    public Costo_Embrague(String proceso, double costo_cambio){
        this.proceso  = proceso;
        //Si la cantidad_dinero es menor que cero, le ponemos a cero.
        if (costo_cambio< 0){
           this.costo_cambio= 0;
        }  else {
              this.costo_cambio= costo_cambio;
        }
    }

    
    //Métodos
    public void setProceso(String proceso){ //Set,  modifica o almacena el valor en la variable.
         this.proceso= proceso;
    }
    
    public String getProceso(){  //get, muestra o extrae el valor del dato.
       return proceso;
    }
    
    public void setCosto_Cambio (double costo_cambio) {
          this.costo_cambio= costo_cambio;
    }
    
    public double getCosto_Cambio(){
         return costo_cambio;
    }
    
   /** 
    * Ingersa dinero en la cuenta,
    * solo si es positovo la cantidad_dinero
    */ 
    
    public void Ingresar_Proceso(double costo_cambio){
       if(costo_cambio > 0){
           this.costo_cambio += costo_cambio;
       } //cantidad_dinero += cantidad_dinero+dinero
    
    }
    
    /**
     * Retira una cantidad_dinero de la cuenta, si se queddara en negativo 
     * se quedaria en cero.
     */
     
    
    public void Retirar_Proceso(double costo_cambio){
        if (costo_cambio < 0){
           this.costo_cambio = costo_cambio;
        } else{
           this.costo_cambio -=costo_cambio;
        }//cantidad_dinero =cantidad_dinero-cantidad_dinero 
    }
     
    
    /**
     * Devuelve el estado del objeto
     * 
     * @return
     */
    
    @Override
    public String toString(){
       return "El proceso " + proceso +  " cuesta " + costo_cambio +
               " dolares. " ;
    }

}

public class Costo_EmbragueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Costo_Embrague proceso_1=new Costo_Embrague("Cambio total del kit de embrague",500);
           Costo_Embrague proceso_2=new Costo_Embrague("Mantenieminto de embrague");
   
       //Ingreso de dinero en las cuentas
       proceso_1.Ingresar_Proceso(500);
       proceso_2.Ingresar_Proceso(350);
    
       
       //Retiro de dinero de las cuentas
       proceso_1.Retirar_Proceso(100);
       proceso_2.Retirar_Proceso(50);
       
       //Presentación de infromación de las cuentas
         System.out.println(proceso_1);// 400 dólares
         System.out.println(proceso_2); // 300 dólares
    
    } 
 }
    
    

