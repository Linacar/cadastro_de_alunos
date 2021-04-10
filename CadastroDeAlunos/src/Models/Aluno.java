package Models;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String cpf;
	private ArrayList<Float> notas = new ArrayList<Float>();
	
	//construtores
	public Aluno(String nome){
		this.nome = nome;
	}
	
	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void inserirNota(float nota) {
		notas.add(nota);
	}
	
	public float calcularNotas() {
		float total = 0;
		
        for(int i = 0; i < this.notas.size(); i++) {
            total += (float) this.notas.get(i);
        }
        
        return total;
	}
	
	public void listar() {
		String listaDeNotasEmTexto = "";
		
        for(int i = 0; i < this.notas.size(); i++) {
        	
        	listaDeNotasEmTexto += ("Nota "+(i+1)+": "+this.notas.get(i)+"\n");
        }
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+ this.cpf);
		System.out.print(listaDeNotasEmTexto);
	}
	
}
