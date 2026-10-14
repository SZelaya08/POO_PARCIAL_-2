

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simonhoyos
 */
public class Conductor extends Empleado {
    private ArrayList<Turno> turnos;
    
    public Conductor(int id, String nombre, int edad, float salario) {
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
