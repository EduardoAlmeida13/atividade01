package application;

import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
            Funcionario f = new Funcionario();
            Funcionario f2 = new Funcionario();
		
            f.setNome("Professor");
            f.setIdade(34);
            f.setPeso(60.62);
            f.setSalario(1520.50);
            f.setFunçao("Corrige provas");
		
            f2.setNome("Gerente");
            f2.setIdade(30);
            f2.setPeso(73.64);
            f2.setSalario(3320.33);
            f2.setFunçao("Gerencia uma empresa");
            
            System.out.println(f);
            System.out.println(f2);
    }
}
