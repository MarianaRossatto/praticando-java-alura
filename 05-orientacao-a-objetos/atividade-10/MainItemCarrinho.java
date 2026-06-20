import java.util.ArrayList;
import java.util.List;

public class MainItemCarrinho {
    public static void main(String[] args) {
        List<ItemCarrinho> listaItens = new ArrayList<>();
        double totalCompra = 0;

        ItemCarrinho i1 = new ItemCarrinho("Teclado", 120, 1);
        ItemCarrinho i2 = new ItemCarrinho("Mouse", 60, 2);
        listaItens.add(i1);
        listaItens.add(i2);

        for (ItemCarrinho item : listaItens) {
            totalCompra += item.calculaValorTotal();
        }

        System.out.printf("Total da compra: R$ %.2f", totalCompra);
    }
}