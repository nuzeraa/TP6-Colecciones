/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_taller;

public enum TipoVehiculo {
    AUTO("Automóviles particulares"),
    MOTO("Motocicletas"),
    CAMION("Camiones de carga"),
    BICICLETA("Vehículos sin motor");

    private final String descripcion;

    TipoVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}