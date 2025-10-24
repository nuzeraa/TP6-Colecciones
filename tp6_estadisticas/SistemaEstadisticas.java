
package tp6_estadisticas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tp6_sistemadestock.Producto;
import tp6_sistemadestock.CategoriaProducto;

public class SistemaEstadisticas {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public double calcularPromedioPrecios() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return productos.isEmpty() ? 0 : total / productos.size();
    }

    public Producto productoMasCaro() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getPrecio() > max.getPrecio()) max = p;
        }
        return max;
    }

    public Map<CategoriaProducto, Integer> contarPorCategoria() {
        Map<CategoriaProducto, Integer> conteo = new HashMap<>();
        for (Producto p : productos) {
            CategoriaProducto cat = p.getCategoria();
            conteo.put(cat, conteo.getOrDefault(cat, 0) + 1);
        }
        return conteo;
    }

    public double valorTotalStock() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }
}