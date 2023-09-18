package src;
public class Motorista extends Funcionario {
    private int numCarteira;
    private String dataExpiracao;

    public Motorista(String nome, int cpf, int numCarteira, String dataExpiracao) {
        super(nome, cpf);
        this.numCarteira = numCarteira;
        this.dataExpiracao = dataExpiracao;
    }

    public int getNumCarteira() {
        return this.numCarteira;
    }

    public String getDataExpiracao() {
        return this.dataExpiracao;
    }
}
