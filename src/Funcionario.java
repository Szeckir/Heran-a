package src;
public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = Integer.toString(cpf);
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }
}