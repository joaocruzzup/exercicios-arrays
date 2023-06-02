// Escreva um programa para inserir um elemento (posição específica) em uma lista.
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista_produtos = new ArrayList<>();
        lista_produtos.addAll(Arrays.asList("Banana", "Pêra", "Maçã", "Uva", "Goiaba"));


        // Lógica para inserir o elemento
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("A lista de produtos atual é: %s %n", lista_produtos);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Digite qual produto você deseja adicionar na lista: ");
        String produto = sc.nextLine();

        System.out.printf("Digite em qual posição da lista você deseja adicionar %s?%n", produto);
        int posicao = sc.nextInt();

        while (posicao > lista_produtos.size() || posicao < 0){
            System.out.println("A posição é inválida!");
            System.out.printf("Digite em qual posição da lista você deseja adicionar %s?%n", produto);
            posicao = sc.nextInt();
        }

        lista_produtos.add(posicao, produto);
        System.out.println("-------------------------------------");
        System.out.println("A lista foi atualizada! ");
        System.out.printf("A nova lista é: %s", lista_produtos);

    }
}
