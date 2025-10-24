/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_taller;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private TipoVehiculo tipo;
    private boolean reparado;

    public Vehiculo(String patente, String marca, String modelo, TipoVehiculo tipo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.reparado = false;
    }

    public String getPatente() {
        return patente;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void reparar() {
        this.reparado = true;
    }

    public void mostrarInfo() {
        System.out.println("Patente: " + patente + " | Marca: " + marca + " | Modelo: " + modelo +
                " | Tipo: " + tipo + " (" + tipo.getDescripcion() + ")" +
                " | Reparado: " + (reparado ? "Sí" : "No"));
    }
}
