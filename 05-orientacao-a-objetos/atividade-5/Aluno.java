public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    private String verificarSituacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Nota 1: %.2f
                Nota 2: %.2f
                Média: %.2f
                Situação: %s
                """,
                nome,
                nota1,
                nota2,
                calcularMedia(),
                verificarSituacao());
    }
}