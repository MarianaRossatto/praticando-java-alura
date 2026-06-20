public class ItemCarrinho {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemCarrinho(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calculaValorTotal(){
        return preco * quantidade;
    }      
    
    @Override
    public String toString() {
        return "Item: " + nome + " | Quantidade: " + quantidade;
    }
}