import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> convidados = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do convidado: (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nome = scanner.nextLine();
            nome = nome.toLowerCase();
            nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);   
            }

            if (convidados.contains(nome)) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados." );
            }                
        }  
    }    
} 