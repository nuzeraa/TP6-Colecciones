
package tp6_taller;

import java.util.ArrayList;

public class TallerMecanico {
    private ArrayList<Vehiculo> vehiculos;

    public TallerMecanico() {
        vehiculos = new ArrayList<>();
    }

    public void ingresarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void listarVehiculos() {
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }

    public Vehiculo buscarPorPatente(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }

    public void filtrarPorTipo(TipoVehiculo tipo) {
        for (Vehiculo v : vehiculos) {
            if (v.getTipo() == tipo) {
                v.mostrarInfo();
            }
        }
    }

    public void marcarReparado(String patente) {
        Vehiculo v = buscarPorPatente(patente);
        if (v != null) {
            v.reparar();
            System.out.println("✅ Vehículo con patente " + patente + " marcado como reparado.");
        } else {
            System.out.println("⚠ No se encontró vehículo con patente: " + patente);
        }
    }

    public int contarReparados() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v.isReparado()) contador++;
        }
        return contador;
    }
}