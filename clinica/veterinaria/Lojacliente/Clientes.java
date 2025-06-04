package clinica.veterinaria.Lojacliente;

import clinica.veterinaria.Gerente.Animal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Clientes {
    private String nomeClinica;
    private List<Animal> animalList;

    public Clientes(String nomeClinica) {
        this.nomeClinica = nomeClinica;
        this.animalList = new ArrayList<>();
    }


    public void adicionarAnimal(Animal animal) {
        this.animalList.add(animal);
        System.out.println(animal.getNome() + " foi adicionado(a) à clínica " + this.nomeClinica);
    }

    public void removerAnimal(String nomeAnimal) {
        Animal animalRemover = null;
        for (Animal animal : animalList) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                animalRemover = animal;
                break;
            }
        }

        if (animalRemover != null) {
            this.animalList.remove(animalRemover);
            System.out.println(nomeAnimal + " foi removido(a) da clínica " + this.nomeClinica);
        } else {
            System.out.println("Animal com nome '" + nomeAnimal + "' não encontrado(a) na clínica " + this.nomeClinica);
        }
    }

    public void listarAnimais() {
        if (animalList.isEmpty()) {
            System.out.println("A clínica " + this.nomeClinica + " não possui animais cadastrados.");
        } else {
            System.out.println("\n--- Animais na clínica " + this.nomeClinica + " ---");
            for (Animal animal : animalList) {
                
                System.out.println(animal);
            }
            System.out.println("------------------------------------");
        }
    }


    public static void main(String[] args) {
        System.out.println("Bem vindo ao petshop Ramon caramelo ");


        Scanner scan = new Scanner(System.in);


        Clientes meuPetshop = new Clientes("Petshop Ramon Caramelo");


        while (true) {
            System.out.println("1) Adicionar animal \n " +
                    "2) Remover animal \n" +
                    "3) Listar animais. \n" +
                    "0) Sair do programa. \n");


            String opcao;
            opcao = scan.nextLine();
            System.out.println("Você escolheu a opção " + opcao);


            switch (opcao) {
                case "1":
                    System.out.println("\n--- Adicionar Novo Animal ---");
                    System.out.print("Nome do animal: ");

                    String nomeAnimal = scan.nextLine();
                    System.out.print("Tipo do animal (cachorro, gato, etc.): ");
                    String tipoAnimal = scan.nextLine();
                    System.out.print("Idade do animal: ");
                    int idadeAnimal = 0;
                    try {
                        idadeAnimal = Integer.parseInt(scan.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Idade inválida! Por favor, digite um número.");

                        break;
                    }


                    System.out.print("Nome do dono: ");
                    String nomeDono = scan.nextLine();


                    Animal novoAnimal = new Animal(nomeAnimal, tipoAnimal, idadeAnimal, nomeDono);


                    meuPetshop.adicionarAnimal(novoAnimal);
                    break;


                case "2":
                    System.out.println("\n--- Remover Animal ---");
                    System.out.print("Digite o nome do animal a ser removido: ");
                    String nomeRemover = scan.nextLine();
                    meuPetshop.removerAnimal(nomeRemover);
                    break;

                case "3":
                    System.out.println("\n--- Listar Animais ---");
                    meuPetshop.listarAnimais();
                    break;

                case "0":
                    System.out.println("\nSaindo do Petshop. Volte sempre!");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida! Por favor, digite um número de 0 a 3.");
                    break;
            }
        }
    }
}