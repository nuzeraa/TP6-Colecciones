
package tp6_biblioteca;

public enum Genero {
    NOVELA("Narraciones extensas de ficción"),
    CIENCIA_FICCION("Historias con base científica o futurista"),
    HISTORIA("Libros sobre hechos y personajes históricos"),
    POESIA("Obras literarias en verso"),
    INFANTIL("Libros destinados a niños");

    private final String descripcion;

    Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}