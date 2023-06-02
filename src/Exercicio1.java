import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Escreva um programa para remover um elemento específico de uma lista.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<>();

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

        lista_numeros.remove(lista_numeros.indexOf(valor));

        System.out.println("A lista atualizada é: " + lista_numeros);

    }
}
