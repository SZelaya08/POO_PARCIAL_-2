/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;

/**
 *
 * @author simonhoyos
 */
public class PuntoGeografico {
   private float latitud;
   private float longitud;
   public PuntoGeografico(float latitud, float longitud){
       this.latitud=latitud;
       this.longitud=longitud;
   }

    public float getLatitud() {
        return latitud;
    }

    public float getLongitud() {
        return longitud;
    }
   
}
