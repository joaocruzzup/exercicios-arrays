// Crie um programa para exibir a soma de 20 números usando uma matriz.
public class Exercicio9 {
    public static void main(String[] args) {
        int [][] matriz_numeros = new int[5][4];
        matriz_numeros[0][0] = 1;
        matriz_numeros[0][1] = 2;
        matriz_numeros[0][2] = 3;
        matriz_numeros[0][3] = 1;

        matriz_numeros[1][0] = 4;
        matriz_numeros[1][1] = 5;
        matriz_numeros[1][2] = 6;
        matriz_numeros[1][3] = 6;

        matriz_numeros[2][0] = 7;
        matriz_numeros[2][1] = 8;
        matriz_numeros[2][2] = 9;
        matriz_numeros[2][3] = 10;

        matriz_numeros[3][0] = 11;
        matriz_numeros[3][1] = 12;
        matriz_numeros[3][2] = 13;
        matriz_numeros[3][3] = 14;

        matriz_numeros[4][0] = 15;
        matriz_numeros[4][1] = 16;
        matriz_numeros[4][2] = 17;
        matriz_numeros[4][3] = 18;

        int soma = 0;
        for (int i = 0; i<matriz_numeros.length; i++){
            for (int j = 0; j <matriz_numeros[i].length; j++){
                soma += matriz_numeros[i][j];
            }
        }

        System.out.printf("A soma dos números da matriz é: %d", soma);


    }
}
