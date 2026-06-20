public class SensorTemperatura {
    private String local;
    private double temperaturaAtual;

    public SensorTemperatura(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    void exibirRelatorio() {
        System.out.println("Sensor no local: " + local +
                           "\nTemperatura: " + temperaturaAtual + " ºC");
        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}