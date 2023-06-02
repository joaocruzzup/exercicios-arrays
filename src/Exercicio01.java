// Escreva um programa para remover um elemento específico de uma lista.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<>();
        System.out.println("--------------------------------------------------");
        System.out.println("Boas-vindas ao removedor de elementos de uma lista");
        System.out.println("--------------------------------------------------");

        // Gerando uma lista aleatória de tamanho máximo 10, com valores aleatórios
        Random random = new Random();
        int n = random.nextInt(9) + 2;

        for (int i =0; i < n; i++){
            lista_numeros.add(random.nextInt(50));
        }

        // Lógica para remover um número específico
        System.out.println("A lista de valores é: " + lista_numeros);
        System.out.println("Qual valor você deseja remover da lista? ");
        int valor = sc.nextInt();

        // Caso o valor não exista, a mensagem é enviada novamente
        while (!lista_numeros.contains(valor)){
            System.out.println("O valor não existe na lista!");
            System.out.println("Qual valor você deseja remover da lista? ");
            valor = sc.nextInt();
        }
        lista_numeros.remove(lista_numeros.indexOf(valor));

        System.out.println("A lista atualizada é: " + lista_numeros);

    }
}
