public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void atualizarDados(String novoCargo, int novoNivelAcesso) {
        this.cargo = novoCargo;
        this.nivelAcesso = novoNivelAcesso;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Cargo: %s
                Nível de acesso: %d
                """,
                nome, cargo, nivelAcesso);
    }
}