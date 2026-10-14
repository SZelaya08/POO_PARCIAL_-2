/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;
import java.util.ArrayList;
/**
 *
 * @author szelaya
 */
public class TrashCity {
    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas; 
    private ArrayList<Turno> turnos;
    
    public TrashCity(){
        empleados = new Arraylist<>();
        camiones = new Arraylist<>();
        rutas = new Arraylist<>();
        turnos = new Arraylist<>();
    }

    public TrashCity(ArrayList<Empleado> empleados, ArrayList<Camion> camiones, ArrayList<Ruta> rutas, ArrayList<Turno> turnos) {
        this.empleados = empleados;
        this.camiones = camiones;
        this.rutas = rutas;
        this.turnos = turnos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }
    
    
}
