package view;

import java.util.LinkedList;
import java.util.List;

import model.Aluno;
import model.Notas;
import model.Presenca;
import model.Professor;
import model.Turma;

public class Portal {
	
	public static void main(String[] args) {
		
		// Verificação de notas e faltas
		Verificacao verificacao;
		
		List<Aluno> listaAlunos = new LinkedList<Aluno>();
		List<Professor> listaProfessores = new LinkedList<Professor>();
		
		//Alunos
		Notas notas1 = new Notas(10, 9, 5, 4, 8);
		Presenca presenca1 = new Presenca(10);
		Aluno aluno1 = new Aluno("André Felipe", "04/02/2001", "Análise e Desenvolvimento de Sistemas", "279PROA", notas1, presenca1);
		
		Notas notas2 = new Notas(8, 7, 6, 9, 10);
		Presenca presenca2 = new Presenca(8);
		Aluno aluno2 = new Aluno("Alan Antunes", "05/11/1993", "Análise e Desenvolvimento de Sistemas", "279PROA", notas2, presenca2);
		
		Notas notas3 = new Notas(10, 10, 10, 10, 10);
		Presenca presenca3 = new Presenca(8);
		Aluno aluno3 = new Aluno("Emily Silva", "20/12/1995", "Análise e Desenvolvimento de Sistemas", "279PROA", notas3, presenca3);
		
		
		//Professor
		Professor prof = new Professor("Jailson", "prof18203391");
		Professor prof2 = new Professor("Calisson", "prof1824831");
		
		
		// Turma
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		listaProfessores.add(prof);
		listaProfessores.add(prof2);
		Turma turma = new Turma("279PROA", "Noite 1", "Análise e Desenvolvimento de Sistemas", listaAlunos, listaProfessores);

		System.out.println(turma.toString());
		System.out.println();
		//Mostrando os dados dos professores
		for (int i = 0; i < turma.getListaProfessor().size(); i++) {
			Professor professor = turma.getListaProfessor().get(i);
			System.out.println("Professor " + (i+1));
			System.out.println(professor.toString());
			System.out.println();
		}
		//Mostrando os dados dos alunos
		for (int i = 0; i < turma.getListaAlunos().size(); i++) {
			Aluno aluno = turma.getListaAlunos().get(i);
			System.out.println("Aluno " + (i+1));
			System.out.println(aluno.toString());
			verificacao = new Verificacao(aluno);	
			System.out.println(verificacao.aprovacaoFinal());
			System.out.println();
		}
		
	}
	
}
