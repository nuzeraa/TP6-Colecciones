
package tp6_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarPorCodigo(String codigo) {
        for (Libro l : libros) {
            if (l.getCodigo().equalsIgnoreCase(codigo)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String codigo) {
        libros.removeIf(l -> l.getCodigo().equalsIgnoreCase(codigo));
    }

    public void filtrarPorGenero(Genero genero) {
        for (Libro l : libros) {
            if (l.getGenero() == genero) {
                l.mostrarInfo();
            }
        }
    }

    public void filtrarPorAutor(String autor) {
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                l.mostrarInfo();
            }
        }
    }

    public int contarLibrosPorGenero(Genero genero) {
        int contador = 0;
        for (Libro l : libros) {
            if (l.getGenero() == genero) {
                contador++;
            }
        }
        return contador;
    }
}