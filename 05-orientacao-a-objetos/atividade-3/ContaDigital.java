public class ContaDigital {
    private double saldo;

    public ContaDigital(double saldo) {
        this.saldo = saldo;
    }

    void zerarSaldo(){
        saldo = 0.0;
    }

    @Override
    public String toString() {
        return String.format("Saldo atual: R$ %.2f", saldo);
    }
}