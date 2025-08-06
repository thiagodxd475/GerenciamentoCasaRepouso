package Funcionarios;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class ColaboradoresArvore {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private int idade;

    public ColaboradoresArvore(String nome, String cpf, String rg, double salario, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void ExibirFuncionario() {
        System.out.println("Nome do Funcionario: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("---------------------------------------------------------------------------------");
    }
}

public class Colaboradores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ColaboradoresArvore> ColaboradoresRepouso = new HashMap<>();

        System.out.println("Insira a quantidade de Funcionarios que deseja cadastrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro #" + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("RG: ");
            String rg = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            // Criação e inserção no mapa
            ColaboradoresArvore colaborador = new ColaboradoresArvore(nome, cpf, rg, salario, idade);
            ColaboradoresRepouso.put(cpf, colaborador);
        }

        // Exibindo os funcionários cadastrados
        System.out.println("\n=== Funcionários cadastrados ===");
        for (ColaboradoresArvore c : ColaboradoresRepouso.values()) {
            c.ExibirFuncionario();
        }
    }
}
