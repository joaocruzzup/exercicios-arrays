import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Criar um programa que calcule a média de salários de uma empresa,
// pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> dados_funcionario = new HashMap<>();

        System.out.println("Quantos funcionários você deseja registrar? ");
        int qtdFuncionarios = sc.nextInt();

        for(int i = 1; i <= qtdFuncionarios; i++){
            System.out.print("Digite o id do funcionário: ");
            int id = sc.nextInt();
            if (dados_funcionario.containsKey(id)){
                System.out.println("id inválido! O id desse funcionário já existe.");
                System.out.print("Informe outro id: ");
                id = sc.nextInt();
            }
            System.out.print("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();

            dados_funcionario.put(id, salario);

        }

        double soma = 0;
        for (double salario:dados_funcionario.values()) {
            soma += salario;
        }

        int qtdFunc = dados_funcionario.size();
        double mediaSalarial = soma / qtdFunc;

        System.out.println("-----------------------------------------------");
        System.out.printf("A média salarial dos funcionários é: R$%.2f", mediaSalarial);

    }
}
