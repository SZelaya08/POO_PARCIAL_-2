/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;

import java.util.ArrayList;

import java.util.List;



/**
 *
 * @author szelaya
 */

public class Ruta {
    private List<PuntoGeografico>puntosGeograficos;
    public Ruta(List<PuntoGeografico>puntosGeograficos){
        this.puntosGeograficos=new ArrayList<>(puntosGeograficos);
    }
    public List<PuntoGeografico>getPuntosGeograficos(){
        return puntosGeograficos;
    }

}