import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<>();
        System.out.println("Quantos números você deseja inserir na lista: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %dª número: ", i);
            lista_numeros.add(sc.nextInt());
        }

        Collections.reverse(lista_numeros);
        System.out.println("A lista na ordem inversa da digitada é: ");
        System.out.println(lista_numeros);

    }
}
