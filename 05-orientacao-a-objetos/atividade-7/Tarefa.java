public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String mostraStatus(){
        if (concluida) {
            return "Concluída";
        } else {
            return "Pendente";
        }
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " - Status: " + mostraStatus();
    }
}