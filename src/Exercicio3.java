// Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lista_numeros = new ArrayList<>();

        System.out.print("Digite um número: ");
        lista_numeros.add(sc.nextDouble());

        System.out.print("Digite um número: ");
        lista_numeros.add(sc.nextDouble());

        // Comando para organizar em ordem decrescente
        lista_numeros.sort(Collections.reverseOrder());
        System.out.printf("Os números em ordem decrescente são: %s", lista_numeros);


    }
}
