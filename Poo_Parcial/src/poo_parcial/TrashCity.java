/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author szelaya
 */
public class TrashCity {
    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas; 
    private ArrayList<Turno> turnos;
    
    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public Empleado getEmpleado(int id) {
        for (Empleado emp : empleados) {
            if (emp.getId() == id) return emp;
        }
        return null;
    }
    
    public void addCamion(Camion camion) {
        camiones.add(camion);
    }

    public Camion getCamion(int id) {
        for (Camion c : camiones) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public void addRuta(ArrayList<PuntoGeografico> puntos) {
        rutas.add(new Ruta(puntos));
    }

    public Ruta getRuta(int index) {
        if (index >= 0 && index < rutas.size()) {
            return rutas.get(index);
        }
        return null;
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
    
    public void addTurno(int id, Camion camion, Empleado conductor, Empleado asis1, Empleado asis2, Ruta ruta) {
        Turno turno = new Turno(id, camion, (Conductor) conductor, (Asistente) asis1, (Asistente) asis2, ruta);
        turnos.add(turno);
    }

    public Turno getTurno(int index) {
        if (index >= 0 && index < turnos.size()) {
            return turnos.get(index);
        }
        return null;
    }

    public void showMinMaxTurnoPorResiduo() {
        String[] categorias = {"Vidrio", "Papel", "Plastico", "Metal", "Residuos Organicos"};
        
        for (int i = 0; i < categorias.length; i++) {
            Turno minTurno = null;
            Turno maxTurno = null;
            double minVal = Double.MAX_VALUE;
            double maxVal = Double.MIN_VALUE;

            for (Turno t : turnos) {
                if (t.getResiduos() == null){
                    continue;
                }
                double val = obtenerValorResiduo(t.getResiduos(), i);
                
                if (val < minVal) {
                    minVal = val;
                    minTurno = t;
                }
                if (val > maxVal) {
                    maxVal = val;
                    maxTurno = t;
                }
            }

            System.out.println("Residuo - " + categorias[i]);
            imprimirDetalleTurno("- Turno Minimo:", minTurno, minVal);
            imprimirDetalleTurno("- Turno Maximo:", maxTurno, maxVal);
            System.out.println();
        }
    }

    private double obtenerValorResiduo(Residuo r, int index) {
        switch (index) {
            case 0: return r.getVidrio();
            case 1: return r.getPapel();
            case 2: return r.getPlastico();
            case 3: return r.getMetal();
            case 4: return r.getResiduosOrganicos();
            default: return 0;
        }
    }

    private void imprimirDetalleTurno(String titulo, Turno t, double cantidad) {
        if (t == null) return;
        System.out.println(titulo);
        System.out.println("- ID: " + t.getId());
        System.out.println("- Camion: " + t.getCamion().getPlaca());
        System.out.println("- Conductor: " + t.getConductor().getNombre());
        System.out.println("- Asistente 1: " + t.getAsistente1().getNombre());
        System.out.println("- Asistente 2: " + t.getAsistente2().getNombre());
        System.out.println("- Fecha Inicio: " + t.getFechaInicio());
        System.out.println("- Fecha Fin: " + t.getFechaFin());
        
        // Formateo para evitar notación científica o muchos decimales
        String cantidadStr = String.valueOf(cantidad);
        if (cantidadStr.endsWith(".0")) {
            cantidadStr = cantidadStr.substring(0, cantidadStr.length() - 2);
        }
        System.out.println("  - Cantidad: " + cantidadStr);
    }

    public void showRutaMaxMetal() {
        Map<Ruta, Double> rutaMetalMap = new HashMap<>();
        
        for (Turno t : turnos) {
            if (t.getResiduos() != null && t.getRuta() != null) {
                rutaMetalMap.put(t.getRuta(), rutaMetalMap.getOrDefault(t.getRuta(), 0.0) + t.getResiduos().getMetal());
            }
        }

        Ruta maxRuta = null;
        double maxMetal = -1;

        for (Map.Entry<Ruta, Double> entry : rutaMetalMap.entrySet()) {
            if (entry.getValue() > maxMetal) {
                maxMetal = entry.getValue();
                maxRuta = entry.getKey();
            }
        }

        if (maxRuta != null) {
            System.out.println("Los puntos de la ruta con mayor cantidad de metal recogido son:");
            for (PuntoGeografico p : maxRuta.getPuntosGeograficos()) {
                System.out.println("- (" + p.getLatitud() + " , " + p.getLongitud()+ ")");
            }
            // Redondear a 3 decimales para coincidir con la salida esperada
            System.out.println("La cantidad de metal total en la ruta es: " + Math.round(maxMetal * 1000.0) / 1000.0);
        }
    }
    
}
