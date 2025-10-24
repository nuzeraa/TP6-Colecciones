
package tp6_biblioteca;

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anio;
    private Genero genero;

    public Libro(String codigo, String titulo, String autor, int anio, Genero genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo + " | Título: " + titulo +
                " | Autor: " + autor + " | Año: " + anio +
                " | Género: " + genero + " (" + genero.getDescripcion() + ")");
    }
}