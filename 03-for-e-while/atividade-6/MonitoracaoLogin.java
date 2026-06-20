import java.util.Scanner;     

public class MonitoracaoLogin {     
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in); 
        final String SENHA_CORRETA = "1234";
        
        int tentativa = 3; 

        while (tentativa > 0) {
            System.out.print("Digite sua senha: ");      
            String senhaInserida = scanner.nextLine();

            if (senhaInserida.equals(SENHA_CORRETA)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } 

            tentativa --;

            if (tentativa > 0){
                System.out.println("Senha incorreta. Você tem " + tentativa + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }            
    }
}      