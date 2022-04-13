package model;

public class Disciplina{
	
	String nomeDisciplina;
	int cargaHoraria;
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		System.out.println("Você cursará a disciplina: " + this.nomeDisciplina);
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
		System.out.println("Carga horária da disciplina: " + this.cargaHoraria);
	}

}
