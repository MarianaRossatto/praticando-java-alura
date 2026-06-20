public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }  

    @Override
    public String toString() {
        return String.format("\"%s\" de %s com %d páginas", titulo, autor, paginas);
    }
}