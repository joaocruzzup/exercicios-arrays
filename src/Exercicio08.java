import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie um programa para exibir todos os inteiros dentro do intervalo 100-150 cuja soma de todos os dígitos é um número par.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista dos números inteiros do intervalo, considerando o 100 e o 150.
        List<Integer> lista_intervalo = new ArrayList<>();
        for (int i = 100; i <= 150; i++){
            lista_intervalo.add(i);
        }

        // Lista dos números convertidos em Strings
        List<String> lista_intervalo_string = new ArrayList<>();
        for (int numero:lista_intervalo) {
            lista_intervalo_string.add(Integer.toString(numero));
        }

        /* A lógica utilizada foi:
        * Percorrer as Strings com um foreach;
        * Cada String da lista irá passar por um for, que irá separar a string em caractere em uma lista auxiliar momentânea
        * Os caracteres convertidos em inteiros irão passar por mais um for para somar os valores
        * O if irá analisar se o número é par, se for adiciona na lista_soma_par
        * Após cada for, a lista auxiliar momentânea é recriada e atualizada, assim dando para analisar valor por valor
        * */
        List<Integer> lista_soma_par = new ArrayList<>();
        for (String valor:lista_intervalo_string) {
            List<Integer> auxiliar = new ArrayList<>();
            for (int i = 0; i <valor.length(); i++){
                char caractere = valor.charAt(i);
                auxiliar.add(Integer.parseInt(String.valueOf(caractere)));
            }
            int soma = 0;
            for (int i = 0; i < auxiliar.size(); i++){
                soma += auxiliar.get(i);
            }
            if (soma %2 == 0){
                lista_soma_par.add(Integer.valueOf(valor));
            }

        }
        System.out.println("A lista dos inteiros dentro do intervalo 100-150 cuja soma de todos os dígitos é um número par, é: ");
        System.out.println(lista_soma_par);



    }
}
