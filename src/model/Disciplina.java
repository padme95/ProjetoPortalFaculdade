package model;

public class Disciplina{
	
	String nomeDisciplina;
	int cargaHoraria;
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		System.out.println("Voc� cursar� a disciplina: " + this.nomeDisciplina);
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
		System.out.println("Carga hor�ria da disciplina: " + this.cargaHoraria);
	}

}
