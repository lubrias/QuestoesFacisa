package agenciaContatoss;

import java.util.HashMap;
import java.util.Map;

public class agendaContatos {
    private HashMap<String, contato > contatos;

    public agendaContatos() {
        contatos = new HashMap<>();
    }

    // Adicionar um novo contato
    public void adicionarContato(String nome, String telefone) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato já existe. Use atualizarContato para modificar o número.");
        } else {
            contatos.put(nome, new contato(nome, telefone));
            System.out.println("Contato adicionado com sucesso.");
        }
    }

    // Atualizar o número de telefone de um contato existente
    public void atualizarContato(String nome, String novoTelefone) {
         contato contato = contatos.get(nome);
        if (contato != null) {
            contato.setTelefone(novoTelefone);
            System.out.println("Contato atualizado com sucesso.");
        } else {
            System.out.println("Contato não encontrado. Use adicionarContato para adicioná-lo.");
        }
    }

    // Remover um contato
    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Verificar se um nome está na agenda
    public boolean verificarContato(String nome) {
        return contatos.containsKey(nome);
    }

    // Exibir todos os contatos
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (Map.Entry<String, contato> entry : contatos.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue().getTelefone());
            }
        }
    }
}

