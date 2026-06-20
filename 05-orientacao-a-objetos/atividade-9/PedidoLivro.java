public class PedidoLivro {
    private String titulo;
    private int diasAtraso;

    public PedidoLivro(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    private double calculaMulta(){
        return (diasAtraso * 2.5);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + 
        " | Multa por " + diasAtraso + 
        " dias de atraso: R$ " + 
        String.format("%.2f", calculaMulta());
    }
}