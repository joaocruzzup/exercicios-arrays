// Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lista_numeros = new ArrayList<>();

        // Cabeçalho
        System.out.println("---------------------------------------------------");
        System.out.println("Boas-vindas ao Exibidor em Ordem Decrescente");
        System.out.println("---------------------------------------------------");

        System.out.print("Digite um número: ");
        lista_numeros.add(sc.nextDouble());

        System.out.print("Digite um número: ");
        lista_numeros.add(sc.nextDouble());

        // Comando para organizar em ordem decrescente
        Collections.sort(lista_numeros);
        Collections.reverse(lista_numeros);
        System.out.printf("Os números em ordem decrescente são: %s", lista_numeros);


    }
}
