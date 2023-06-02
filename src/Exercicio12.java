import java.util.Arrays;

// Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C
// serão armazenados o valores pares e ímpares de A, respectivamente.
public class Exercicio12 {
    public static void main(String[] args) {
        // Começando um vetor com valores pré-definidos apenas para teste
        int [] vetor_A = new int[]{5, 9, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n_impares = 0;
        int n_pares = 0;

        for (int i = 0; i < vetor_A.length; i++){
            if ((vetor_A[i] % 2) == 0){
                n_pares+=1;
            } else {
                n_impares+=1;
            }
        }

        int [] vetor_B = new int[n_pares];
        int [] vetor_C = new int[n_impares];

        int iPar = 0;
        int iImpar = 0;
        for (int i = 0; i < vetor_A.length; i++){
            if ((vetor_A[i] % 2) == 0){
                vetor_B[iPar] = vetor_A[i];
                iPar++;
            }
            else {
                vetor_C[iImpar] = vetor_A[i];
                iImpar++;
            }
        }
        System.out.println(Arrays.toString(vetor_B));
        System.out.println(Arrays.toString(vetor_C));







    }
}
