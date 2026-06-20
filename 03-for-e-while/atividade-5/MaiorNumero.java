import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numerosString = scanner.nextLine().split(" ");
        
        int maiorNum = Integer.MIN_VALUE;
        
        for (String numString : numerosString) {
            int numInt = Integer.parseInt(numString);
            if (numInt > maiorNum) {
                maiorNum = numInt;
            }
        }
        System.out.println("O maior número é: " + maiorNum);
    }
}