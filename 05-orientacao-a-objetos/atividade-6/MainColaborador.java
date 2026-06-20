public class MainColaborador {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador("Júlia Oliveira", "Pessoa Desenvolvedora Júnior", 1);

        System.out.println("--- Antes da atualização ---");
        System.out.println(colaborador);

        colaborador.atualizarDados("Pessoa Desenvolvedora Plena", 2);
        System.out.println("--- Após atualização ---");
        System.out.println(colaborador);
    }
}