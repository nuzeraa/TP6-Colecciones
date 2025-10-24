
package tp6_colecciones;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public Producto buscarPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void actualizarStock(String id, int nuevoStock) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setStock(nuevoStock);
            System.out.println("✅ Stock actualizado para " + p.getNombre());
        } else {
            System.out.println("⚠️ Producto no encontrado.");
        }
    }

    public Producto productoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getStock() > mayor.getStock()) {
                mayor = p;
            }
        }
        return mayor;
    }
}
