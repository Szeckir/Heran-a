package main;

import src.Engenheiro;
import src.Funcionario;
import src.Motorista;

public class main {
    
    public static void main(String[] args) {


    Motorista motora1 = new Motorista("pedrao", 12345, 12, "12/90");

    Engenheiro eng1 = new Engenheiro("Yan", 2345, "engenharia");

        System.out.println("Nome: " + motora1.getNome() + " \nCPF: " + motora1.getCpf() + "\nCarteira: " + motora1.getNumCarteira());
        

    }
}
