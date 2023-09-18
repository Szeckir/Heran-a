package src;
public class Engenheiro extends Funcionario{
    private String area;

    public Engenheiro(String nome, int cpf, String area) {
        super(nome, cpf);
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }
    
}
