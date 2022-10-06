package colecoes.lista.exercicio_aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainV2 {
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {		
		//definir a quantidade de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		//entrar os dados desses alunos
		int op = -1;
		while (op !=5) {
			montaMenu();
			op = s.nextInt();
			s.nextLine();			
			switch(op) {
				case 1 : 
					alunos.add(criarAluno());
					break;
				case 2 : 
					System.out.println("Media dos alunos : " + calcularMedia(alunos));
					System.out.println("Digite <ENTER> para continuar");
					s.nextLine();
					break;
				case 3 : 
					imprimirAlunos(alunos);
					System.out.println("Digite <ENTER> para continuar");
					s.nextLine();
					break;
				case 4 : 
					ordenarAlunos(alunos);
					System.out.println("Digite <ENTER> para continuar");
					s.nextLine();
					break;
				case 5 : 
					System.out.println("Tchau!!!!");
					break;
				default : 
					System.out.println("Entrada inválida!!!");
			}			
			
		}
	}
	
	private static void montaMenu() {
		System.out.println("------------Menu----------------");
		System.out.println("1. Cadastrar Aluno");
		System.out.println("2. Imprimir média das notas");
		System.out.println("3. Imprimir Alunos");
		System.out.println("4. Ordenar Alunos");
		System.out.println("5. Sair");
		System.out.println("--------------------------------");
		System.out.println("Digite a operação desejada : ");
	}
	
	private static void ordenarAlunos(List<Aluno> alunos) {
		Collections.sort(alunos,new Comparator<Aluno>() {
			public int compare(Aluno o1, Aluno o2) {
				if (o1.getNota() > o2.getNota())
					return 1;
				else if (o1.getNota() < o2.getNota())
					return -1;
				else
					return 0;
			}
		});

	}
	
	private static void imprimirAlunos(List<Aluno> alunos) {
		System.out.println("Lista de Alunos : ");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome() + " - " + aluno.getNota());
		}
	}
	
	private static Aluno criarAluno() {
		System.out.println("Digite os dados do próximo aluno:");
		System.out.print("Digite o nome:");
		String nome = s.nextLine();
		System.out.print("Digite a nota:");
		double nota = s.nextDouble();
		return new Aluno(nome, nota);
	}
	
	public static double calcularMedia(List<Aluno> alunos) {
		double total = 0.0;
		for(Aluno aluno : alunos) {
			total += aluno.getNota();
		}
		return total/alunos.size();
	}

}
