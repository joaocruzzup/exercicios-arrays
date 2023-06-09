// Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

import java.util.Arrays;

public class Exercicio11 {
    public static void main(String[] args) {

        // Cabeçalho
        System.out.println("---------------------------------------------------------------");
        System.out.println("Boas-vindas a Calculadora de maior e menor de um vetor qualquer");
        System.out.println("---------------------------------------------------------------");

        // Começando um vetor com valores pré-definidos apenas para teste
        int [] vetor_idades = new int[]{30, 18, 25, 27, 29, 17, 54, 72, 22, 21};

        int maior = vetor_idades[0];
        int menor = vetor_idades[0];
        int posicaoMenor = 0;
        int posicaoMaior = 0;
        for (int i = 0; i < vetor_idades.length; i++){
            if (vetor_idades[i] < menor){
                menor = vetor_idades[i];
                posicaoMenor = i;
            }
            if (vetor_idades[i] > maior){
                maior = vetor_idades[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O vetor de idades é: " + Arrays.toString(vetor_idades));
        System.out.printf("A menor idade é: %d e está na posição: %d %n", menor, posicaoMenor);
        System.out.printf("A maior idade é: %d e está na posição: %d", maior, posicaoMaior);

    }
}
