
package tp6_colecciones;

public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        Producto p1 = new Producto("A01", "Arroz", 1200, 30);
        Producto p2 = new Producto("B02", "Televisor", 250000, 5);
        Producto p3 = new Producto("C03", "Campera", 18000, 12);
        Producto p4 = new Producto("D04", "Silla", 22000, 20);
        Producto p5 = new Producto("E05", "Fideos", 900, 40);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("---- LISTA DE PRODUCTOS ----");
        inv.listarProductos();

        System.out.println("\n---- BUSCAR PRODUCTO POR ID (A01) ----");
        System.out.println(inv.buscarPorId("A01"));

        System.out.println("\n---- ACTUALIZAR STOCK ----");
        inv.actualizarStock("A01", 55);

        System.out.println("\n---- PRODUCTO CON MAYOR STOCK ----");
        System.out.println(inv.productoConMayorStock());
    }
}
