package model;

public class Professor {

	private String nome;
	private String matricula;

	public Professor(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public Professor() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Professor: " + nome + "\nMatricula: " + matricula;
	}
	
}
