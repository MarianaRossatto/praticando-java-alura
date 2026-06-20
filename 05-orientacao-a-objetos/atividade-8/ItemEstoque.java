public class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int qntVendida){
        if (qntVendida <= quantidade ) {
           quantidade -= qntVendida; 
           System.out.println("Venda realizada. Estoque restante de " + nome + ": " + quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }    

    @Override
    public String toString() {
        return "Item: " + nome + " | Quantidade em estoque: " + quantidade;
    }
}