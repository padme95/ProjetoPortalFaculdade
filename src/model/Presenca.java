package model;

public class Presenca{

	private int totalFaltas;
	
	public Presenca(int totalFaltas) {
		super();
		this.totalFaltas = totalFaltas;
	}
	
	public Presenca() {
		super();
	}

	public int getTotalFaltas() {
		return totalFaltas;
	}
	public void setTotalFaltas(int totalFaltas) {
		this.totalFaltas = totalFaltas;
	}
	
	public boolean aprovacaoFaltas() {
		if(this.totalFaltas > 7) {
			return true;
		} else {
			return false;
		}
	}
}
