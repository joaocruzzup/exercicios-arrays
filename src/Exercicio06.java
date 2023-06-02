import java.util.Scanner;

// Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num %7 ==0){
            System.out.printf("O número %d é múltiplo de 5 e 7", num);
        } else if (num % 5 == 0) {
            System.out.printf("O número %d é múltiplo apenas de 5", num);
        } else if (num % 7 == 0){
            System.out.printf("O número %d é múltiplo apenas de 7", num);
        } else {
            System.out.println("O número não é múltiplo nem de 5 nem de 7");
        }

    }
}