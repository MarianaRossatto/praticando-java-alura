public class MainItemEstoque {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque("Camiseta", 10);

        item.vender(3);
        item.vender(8);
    }
}