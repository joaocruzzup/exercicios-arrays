// Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
// a maior e a menor altura do grupo;
// b. média de altura dos homens;
// c. o número de mulheres.

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String[]> dados_pessoas = new ArrayList<>();

        // Criando uma lista de listas, onde cada lista possui um par de valor: "Altura e sexo"
        String[] pessoa1 = {"1.82", "M"};
        String[] pessoa2 = {"1.70", "F"};
        String[] pessoa3 = {"1.85", "F"};
        String[] pessoa4 = {"1.75", "M"};

        dados_pessoas.add(pessoa1);
        dados_pessoas.add(pessoa2);
        dados_pessoas.add(pessoa3);
        dados_pessoas.add(pessoa4);

        System.out.println("---------------Conjunto de dados---------------");
        // Imprimindo o conjunto de dados
        for (String[] pessoa : dados_pessoas) {
            System.out.printf("Altura: %s m | Sexo: %s %n", pessoa[0], pessoa[1]);
        }

        // Criando listas para alturas e para sexos, a partir da lista maior
        List<Double> lista_alturas = new ArrayList<>();
        List<String> lista_sexos = new ArrayList<>();
        for (String[] pessoa : dados_pessoas) {
            double altura = Double.parseDouble(pessoa[0]);
            lista_alturas.add(altura);

            lista_sexos.add(pessoa[1]);
        }

        // Atribuindo o menor e maior valor de alturas, após organizar a lista em ordem crescente
        lista_alturas.sort(null);
        double menorAltura = lista_alturas.get(0);
        double maiorAltura = lista_alturas.get(lista_alturas.size()-1);

        // Realizando a soma das alturas dos homens para conseguir a média
        double soma = 0;
        double qtdHomens = 0;
        for (int i = 0; i < lista_alturas.size(); i++){
            if (lista_sexos.get(i).equalsIgnoreCase("m")){
                soma += lista_alturas.get(i);
                qtdHomens +=1;
            }
        }
        double mediaAlturasHomens = soma / qtdHomens;

        // Realizando a soma da quantidade de mulheres
        int qtdMulheres = 0;
        for (String mulher:lista_sexos) {
            if (mulher.equalsIgnoreCase("f")){
                qtdMulheres += 1;
            }
        }

        System.out.println("\n--------Informações dos dados coletados--------");
        System.out.printf("A maior altura do grupo é: %.2fm %n", maiorAltura);
        System.out.printf("A menor altura do grupo é: %.2fm %n", menorAltura);
        System.out.printf("A média de alturas dos homens é: %.2fm %n", mediaAlturasHomens);
        System.out.printf("A quantidade de mulheres é: %d %n", qtdMulheres);








    }
}
