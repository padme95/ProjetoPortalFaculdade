package model;

import java.util.List;

public class Turma {

	private String nome;
	private String turno;
	private String curso;
	private List<Aluno> listaAlunos;
	private List<Professor> listaProfessores;
	
	public Turma(String nome, String turno, String curso, List<Aluno> listaAlunos, List<Professor> listaProfessor) {
		super();
		this.nome = nome;
		this.turno = turno;
		this.curso = curso;
		this.listaAlunos = listaAlunos;
		this.listaProfessores = listaProfessor;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Turma() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	public List<Professor> getListaProfessor() {
		return listaProfessores;
	}

	public void setListaProfessor(List<Professor> listaProfessor) {
		this.listaProfessores = listaProfessor;
	}

	@Override
	public String toString() {
		return "Informações da Turma: \n" + nome + "\nTurno: " + turno + "\nCurso: " + curso;
	}

}
