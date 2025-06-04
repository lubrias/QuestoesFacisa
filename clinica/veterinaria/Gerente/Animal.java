package clinica.veterinaria.Gerente;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private String nomedono;

    public Animal (String nome,String tipo,int idade, String nomedono){
        this.nome=nome;
        this.tipo=tipo;
        this.idade=idade;
        this.nomedono=nomedono;

    }
    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;

    }

    public int getIdade() {
        return idade;
    }

    public String getNomedono(){
        return nomedono;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNomedono(String nomedono) {
        this.nomedono = nomedono;
    }

    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", idade=" + idade +
                ", nomeDono='" + nomedono + '\'' +
                '}';
    }

    public void adicionarAnimal(Animal novoAnimal) {
    }
}
