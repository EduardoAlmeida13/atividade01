package entities;

public class Funcionario {
    
        private String nome;
	private int idade;
	private double peso;
        private double salario;
        private String funçao;
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
        public double getSalario(){
                return salario;
        }
        public void setSalario (double salario){
                this.salario = salario;
        }
        public String getFunçao(){
                return funçao;
        }
        public void setFunçao (String funçao){
                this.funçao = funçao;
        }
        
    @Override
	public String toString() {
		return "[Nome=" + nome + ", idade=" + idade + "anos, peso=" + peso + "kg]";
	}

}
