
package tp6_estadisticas;

import java.util.Map;
import tp6_sistemadestock.Producto;
import tp6_sistemadestock.CategoriaProducto;

public class MainEstadisticas {
    public static void main(String[] args) {
        SistemaEstadisticas sistema = new SistemaEstadisticas();

        // Crear productos usando los del paquete tp6_sistemadestock
        sistema.agregarProducto(new Producto("A01", "Arroz", 1200, 30, CategoriaProducto.ALIMENTOS));
        sistema.agregarProducto(new Producto("E01", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA));
        sistema.agregarProducto(new Producto("R01", "Campera", 180000, 12, CategoriaProducto.ROPA));
        sistema.agregarProducto(new Producto("H01", "Silla", 22000, 20, CategoriaProducto.HOGAR));
        sistema.agregarProducto(new Producto("A02", "Fideos", 950, 40, CategoriaProducto.ALIMENTOS));

        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        sistema.listarProductos();

        System.out.println("\n--- PROMEDIO DE PRECIOS ---");
        System.out.println("Promedio: $" + sistema.calcularPromedioPrecios());

        System.out.println("\n--- PRODUCTO MÁS CARO ---");
        Producto caro = sistema.productoMasCaro();
        if (caro != null) caro.mostrarInfo();

        System.out.println("\n--- CANTIDAD POR CATEGORÍA ---");
        Map<CategoriaProducto, Integer> conteo = sistema.contarPorCategoria();
        for (CategoriaProducto c : conteo.keySet()) {
            System.out.println(c + ": " + conteo.get(c) + " productos");
        }

        System.out.println("\n--- VALOR TOTAL DEL STOCK ---");
        System.out.println("Total en pesos: $" + sistema.valorTotalStock());
    }
}