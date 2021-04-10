package Models;

import java.util.ArrayList;

public class Sala {
	private ArrayList<Aluno> alunos;
	
	public Sala(){
		alunos = new ArrayList<Aluno>();
	}
	
	public void insereAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void listarTodos() {
        for(int i = 0; i < this.alunos.size(); i++) {
        	this.alunos.get(i).listar();
        	System.out.println("\n");
        }		
	}
	
	public void verSituacoes() {
        for(int i = 0; i < this.alunos.size(); i++) {
        	Aluno aluno = (Aluno) this.alunos.get(i);
        	aluno.listar();
        	String situacao =  aluno.calcularNotas() >= 70 ? "Aprovado" : "Reprovado";
        	
        	System.out.println("Nota total: "+aluno.calcularNotas());
        	System.out.println("Situação: "+situacao);
        	System.out.println("\n");
        }	
	}

}
