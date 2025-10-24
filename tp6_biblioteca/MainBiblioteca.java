
package tp6_biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro l1 = new Libro("L001", "Cien años de soledad", "Gabriel García Márquez", 1967, Genero.NOVELA);
        Libro l2 = new Libro("L002", "1984", "George Orwell", 1949, Genero.CIENCIA_FICCION);
        Libro l3 = new Libro("L003", "La Odisea", "Homero", -800, Genero.HISTORIA);
        Libro l4 = new Libro("L004", "Poemas completos", "Pablo Neruda", 1950, Genero.POESIA);
        Libro l5 = new Libro("L005", "El Principito", "Antoine de Saint-Exupéry", 1943, Genero.INFANTIL);

        // Agregar libros
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        biblioteca.agregarLibro(l5);

        System.out.println("\n--- LISTA DE LIBROS ---");
        biblioteca.listarLibros();

        System.out.println("\n--- BUSCAR LIBRO POR CÓDIGO (L002) ---");
        Libro buscado = biblioteca.buscarPorCodigo("L002");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n--- FILTRAR POR GÉNERO: POESÍA ---");
        biblioteca.filtrarPorGenero(Genero.POESIA);

        System.out.println("\n--- FILTRAR POR AUTOR: Homero ---");
        biblioteca.filtrarPorAutor("Homero");

        System.out.println("\n--- CANTIDAD DE LIBROS DE NOVELA ---");
        System.out.println("Total: " + biblioteca.contarLibrosPorGenero(Genero.NOVELA));

        System.out.println("\n--- ELIMINAR LIBRO (L003) ---");
        biblioteca.eliminarLibro("L003");

        System.out.println("\n--- LISTA ACTUALIZADA ---");
        biblioteca.listarLibros();
    }
}