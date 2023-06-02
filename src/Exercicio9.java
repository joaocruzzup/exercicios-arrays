import java.util.Random;

// Crie um programa para exibir a soma de 20 números usando uma matriz.
public class Exercicio9 {
    public static void main(String[] args) {
        int [][] matriz_numeros = new int[5][4];

        Random random = new Random();

        // Gerando uma matriz de números aleatórios
        System.out.println("------------Matriz Gerada------------");
        for (int i = 0; i<matriz_numeros.length; i++){
            for (int j = 0; j <matriz_numeros[i].length; j++){
                matriz_numeros[i][j] = random.nextInt(100) + 1;
                System.out.printf("|   %d   ", matriz_numeros[i][j]);
            }
            System.out.println();
        }

        // Realizando a soma dos números
        int soma = 0;
        for (int i = 0; i<matriz_numeros.length; i++){
            for (int j = 0; j <matriz_numeros[i].length; j++){
                soma += matriz_numeros[i][j];
            }
        }

        System.out.println("------------------------------------");
        System.out.printf("A soma dos números da matriz é: %d", soma);


    }
}
