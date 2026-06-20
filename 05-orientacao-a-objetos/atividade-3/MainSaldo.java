public class MainSaldo {
    public static void main(String[] args) {
        ContaDigital conta = new ContaDigital(1579.42);

        System.out.println(conta);
        conta.zerarSaldo();
        System.out.println(conta);
    }
}