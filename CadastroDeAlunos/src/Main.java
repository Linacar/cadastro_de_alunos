import java.util.ArrayList;
import java.util.Scanner;

import Models.*;

public class Main {
	
	static Aluno al;
	static ArrayList<Sala> sal = new ArrayList<Sala>();
	static Scanner menu = new Scanner (System.in);

	public static void main(String[] args) {
		
		sal.add(new Sala());
		
		while(true) 
		{
			System.out.println("##### MENU #####");
			
			System.out.println("1. Iserir");
			System.out.println("2. Listar");
			System.out.println("3. Situações");
			System.out.println("4. Sair");
			System.out.print("Opção: ");
			int opcao = menu.nextInt();
			System.out.println("");
			
			if(opcao == 4) {
				System.out.println("Encerrando aplicação!");
				menu.close();
			}
			
			switch (opcao) {
				case 1: {
					inserirAluno();
	                break;
				}
				case 2: {
					sal.get(0).listarTodos();
	                break;
				}
				case 3: {
					sal.get(0).verSituacoes();
	                break;
				}
				default:
	                System.out.print("Opção Inválida");
	                break;
			}
		}

	}
	
	static void inserirAluno() {
		//iniciando valores para o aluno
		System.out.print("Nome do aluno: ");
		String nome = menu.next();
		
		System.out.print("Cpf do aluno: ");
		String cpf = menu.next();
		
		al = new Aluno(nome, cpf);
		
		//adicionar notas
		AdicionarNotasDoAluno();
				
		sal.get(0).insereAluno(al);
	}
	
	static void AdicionarNotasDoAluno() {
		int contador = 1;
		
		Boolean inserirMaisUmaNota = true;
		Boolean estaComOpcaoInvalida = false;
		do{
				if(!estaComOpcaoInvalida) {
					System.out.print("Nota "+contador+": ");
					float nota = menu.nextFloat();
					al.inserirNota(nota);
				}
				
				System.out.println("Inserir mais uma nota para o aluno?");
				System.out.println("1. SIM");
				System.out.println("2. NÃO");
				System.out.print("Opção: ");	
				int opcaoTerminouDelancarAsNotas = menu.nextInt();
				System.out.println("");
				
				switch (opcaoTerminouDelancarAsNotas) {
				case 1:
					estaComOpcaoInvalida = false;
					inserirMaisUmaNota = true;
					contador++;
					break;						
				case 2:
					estaComOpcaoInvalida = false;
					inserirMaisUmaNota = false;
					break;
				default:
					estaComOpcaoInvalida = true;
					System.out.println("Opção inválida");
				}
		}
		while (inserirMaisUmaNota);
	}

}
