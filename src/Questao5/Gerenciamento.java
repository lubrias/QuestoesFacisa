package Questao5;

//Classe criada para gerenciar a classe Cliente

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gerenciamento {

    private HashMap<String, Cliente> clientes;
    Scanner scan = new Scanner(System.in);

    public Gerenciamento() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente() {
        System.out.println("Informe o nome do cliente:");
        String nome = scan.nextLine();

        System.out.println("Informe o CPF do cliente:");
        String cpf = scan.nextLine();
        if (clientes.containsKey(cpf)) {
            System.out.println("Erro: já existe um cliente com esse CPF.");
            return;
        }

        System.out.println("Informe o endereço do cliente:");
        String endereco = scan.nextLine();

        Cliente novoCliente = new Cliente(cpf, nome, endereco);
        clientes.put(cpf, novoCliente);

        System.out.println("Cliente adicionado com sucesso!");
    }

    public void verificarCliente(){
        System.out.println("Informe o cpf do cliente:");
        String cpfVerificar = scan.nextLine();

        if (clientes.containsKey(cpfVerificar)) {
            System.out.println("Cliente já está cadastrado!");
        } else {
            System.out.println("Cliente não está cadastrado!");
        }
    }

    public void removerCliente(){
        System.out.println("Informe o cpf do cliente a ser removido:");
        String cpf = scan.nextLine();

        if (clientes.containsKey(cpf)) {
            clientes.remove(cpf);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public void buscarCliente() {
        System.out.println("Informe o cpf do cliente a ser buscado:");
        String cpf = scan.nextLine();

        if (clientes.containsKey(cpf)) {
            Cliente cliente = clientes.get(cpf);
            System.out.println("Cliente encontrado com sucesso!");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }
}
