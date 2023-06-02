import java.util.Arrays;
import java.util.List;

// Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples
// dos elementos ímpares armazenados neste vetor.
public class Exercicio10 {
    public static void main(String[] args) {
        // Começando um vetor com valores pré-definidos apenas para teste
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("A lista dos números é: " + Arrays.toString(vetor));
        int qtdImpares = 0;
        int somaImpares = 0;
        for (int numero: vetor) {
            if ((numero % 2) != 0){
                somaImpares += numero;
                qtdImpares += 1;
            }
        }
        System.out.printf("A soma dos números ímpares presentes no vetor é: %d", somaImpares);


    }
}
