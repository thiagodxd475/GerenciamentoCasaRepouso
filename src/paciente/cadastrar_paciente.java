package paciente;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class pacientes {
    private String nome;
    private int idade;
    private String cpf;
    private String rg;

    public pacientes(String nome, int idade, String cpf, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void exibirPaciente() {
        System.out.println("Nome do Paciente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("-----------------------------");
    }
}

public class cadastrar_paciente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Map<String, pacientes> pacientesMap = new HashMap<>();

        System.out.println("Insira a quantidade de idosos que deseja cadastrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro #" + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            sc.nextLine();

            System.out.print("RG: ");
            String rg = sc.nextLine();
            sc.nextLine();

            // Cria objeto paciente
            pacientes p = new pacientes(nome, idade, cpf, rg);

            // Adiciona ao HashMap
            pacientesMap.put(cpf, p);
        }

        System.out.println("\n🧓 Lista de pacientes cadastrados:");
        for (pacientes p : pacientesMap.values()) {
            p.exibirPaciente();
        }

        sc.close();
    }
}
