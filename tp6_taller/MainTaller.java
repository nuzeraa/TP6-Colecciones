/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_taller;

public class MainTaller {
    public static void main(String[] args) {
        TallerMecanico taller = new TallerMecanico();

        // Crear vehículos
        Vehiculo v1 = new Vehiculo("AA123BB", "Toyota", "Corolla", TipoVehiculo.AUTO);
        Vehiculo v2 = new Vehiculo("BB456CC", "Honda", "CBR500", TipoVehiculo.MOTO);
        Vehiculo v3 = new Vehiculo("CC789DD", "Volvo", "FH16", TipoVehiculo.CAMION);
        Vehiculo v4 = new Vehiculo("DD321EE", "Venzo", "X5", TipoVehiculo.BICICLETA);

        // Ingresar vehículos
        taller.ingresarVehiculo(v1);
        taller.ingresarVehiculo(v2);
        taller.ingresarVehiculo(v3);
        taller.ingresarVehiculo(v4);

        System.out.println("\n--- LISTA DE VEHÍCULOS ---");
        taller.listarVehiculos();

        System.out.println("\n--- BUSCAR VEHÍCULO POR PATENTE (BB456CC) ---");
        Vehiculo encontrado = taller.buscarPorPatente("BB456CC");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("\n--- FILTRAR POR TIPO: AUTO ---");
        taller.filtrarPorTipo(TipoVehiculo.AUTO);

        System.out.println("\n--- MARCAR REPARADO (CC789DD) ---");
        taller.marcarReparado("CC789DD");

        System.out.println("\n--- VEHÍCULOS ACTUALIZADOS ---");
        taller.listarVehiculos();

        System.out.println("\n--- CANTIDAD DE VEHÍCULOS REPARADOS ---");
        System.out.println("Total: " + taller.contarReparados());
    }
}