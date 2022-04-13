package view;

import model.Aluno;

public class Verificacao {
	
	Aluno aluno;
	
	public Verificacao(Aluno aluno) {
		super();
		this.aluno = aluno;
	}

	public String aprovacaoFinal() {
		if (!this.aluno.getPresenca().aprovacaoFaltas() ) {
			return "N�o passou por causa de faltas";
		} else {
			if(this.aluno.getNotas().aprovacaoNotas()) {
				return "Passou de ano";
			} else {
				return "N�o passou por causa de notas";
			}
		}
	}
}
	
	


