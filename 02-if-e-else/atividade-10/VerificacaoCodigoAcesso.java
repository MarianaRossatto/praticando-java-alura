import java.util.Scanner;

public class VerificacaoCodigoAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigoCorreto = 2023;    

        System.out.print("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o nível de permissão: ");
        int permissao = scanner.nextInt();

        boolean codigoValido = codigo == codigoCorreto;  
        boolean permissaoValida = permissao == 1 || permissao == 2 || permissao == 3;    
 
        if (codigoValido && permissaoValida) {    
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");    
        } else {    
            System.out.println("Acesso negado. Motivo(s):");    
            if (!codigoValido) {    
                System.out.println("- Código de acesso incorreto.");    
            }    
            if (!permissaoValida) {    
                System.out.println("- Nível de permissão inválido.");    
            }    
        }    
    }    
} 