/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;

import java.util.ArrayList;

/**
 *
 * @author simonhoyos
 */
public class Asistente extends Empleado {
    private ArrayList<Turno> turnos;
    
    public Asistente(int id, String nombre, int edad, double salario) {
        super(id, nombre, edad, salario);
        turnos = new ArrayList<>();
    }
    public ArrayList<Turno> getTurnos(){
        return turnos;
    }
    public void agregarTurno(Turno turno){
        turnos.add(turno);
    }
}
