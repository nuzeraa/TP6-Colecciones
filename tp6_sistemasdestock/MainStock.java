
package tp6_sistemadestock;

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("A01", "Arroz", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E02", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R03", "Campera", 18000, 12, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H04", "Silla", 22000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A05", "Fideos", 900, 40, CategoriaProducto.ALIMENTOS);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        System.out.println("\n--- BUSCAR PRODUCTO POR ID (A01) ---");
        Producto buscado = inventario.buscarProductoPorId("A01");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n--- FILTRAR POR CATEGORÍA: ALIMENTOS ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n--- ACTUALIZAR STOCK (A01 → 50 unidades) ---");
        inventario.actualizarStock("A01", 50);

        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("\n--- TOTAL DE STOCK DISPONIBLE ---");
        System.out.println(inventario.obtenerTotalStock() + " unidades");

        System.out.println("\n--- PRODUCTOS ENTRE $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}