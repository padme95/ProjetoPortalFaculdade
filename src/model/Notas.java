package model;

public class Notas{

	private int avaliacao1;
	private int avaliacao2;
	private int avaliacao3;
	private int avaliacao4;
	private int avaliacaoConclusiva;
	
	
	public Notas(int avaliacao1, int avaliacao2, int avaliacao3, int avaliacao4, int avaliacaoConclusiva) {
		super();
		this.avaliacao1 = avaliacao1;
		this.avaliacao2 = avaliacao2;
		this.avaliacao3 = avaliacao3;
		this.avaliacao4 = avaliacao4;
		this.avaliacaoConclusiva = avaliacaoConclusiva;
	}

	public Notas() {
		super();
	}

	public int getAvaliacao1() {
		return avaliacao1;
	}
	public void setAvaliacao1(int avaliacao1) {
		this.avaliacao1 = avaliacao1;
	}
	public int getAvaliacao2() {
		return avaliacao2;
	}
	public void setAvaliacao2(int avaliacao2) {
		this.avaliacao2 = avaliacao2;
	}
	public int getAvaliacao3() {
		return avaliacao3;
	}
	public void setAvaliacao3(int avaliacao3) {
		this.avaliacao3 = avaliacao3;
	}
	public int getAvaliacao4() {
		return avaliacao4;
	}
	public void setAvaliacao4(int avaliacao4) {
		this.avaliacao4 = avaliacao4;
	}
	public int getAvaliacaoConclusiva() {
		return avaliacaoConclusiva;
	}
	public void setAvaliacaoConclusiva(int avaliacaoConclusiva) {
		this.avaliacaoConclusiva = avaliacaoConclusiva;
	}

	public double media() {
		return avaliacao1 + avaliacao2 + avaliacao3 + avaliacao4 / 4;
	}
	
	public boolean aprovacaoNotas() {
		if(this.media() > 7) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\n\tNota da Av1: " + avaliacao1 + "\n\tNota da Av2: " + avaliacao2 + "\n\tNota da Av3: " + avaliacao3
				+ "\n\tNota da Av4: " + avaliacao4 + "\n\tAvaliação Conclusiva: " + avaliacaoConclusiva;
	}

}
	
	

