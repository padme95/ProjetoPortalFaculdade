package model;

public class Aluno extends Disciplina{
	
	private String nome;
	private String dataNasc;
	private String curso;
	private String turma;
	Notas notas;
	Presenca presenca;
	
	public Aluno(String nome, String dataNasc, String curso, String turma, Notas notas, Presenca presenca) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.curso = curso;
		this.turma = turma;
		this.notas = notas;
		this.presenca = presenca;;
	}
	
	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Notas getNotas() {
		return notas;
	}
	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	public Presenca getPresenca() {
		return presenca;
	}
	public void setPresenca(Presenca presenca) {
		this.presenca = presenca;
	}

	@Override
	public String toString() {
		return "Nome do aluno: " + nome + "\nCurso: " + curso + "\nTurma: " + turma + "\nNotas do aluno: " + notas;
	}
	
}
