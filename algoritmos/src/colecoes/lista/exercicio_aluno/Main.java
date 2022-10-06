package colecoes.lista.exercicio_aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//definir a quantidade de alunos
		System.out.print("Informe a quantidade de Alunos : ");
		int n = s.nextInt();
		List<Aluno> alunos = new ArrayList<Aluno>();
		//entrar os dados desses alunos
		for (int i=0; i<n; i++) {
			System.out.println("Digite os dados do próximo aluno:");
			System.out.print("Digite o nome:");
			s.nextLine();			
			String nome = s.nextLine();
			System.out.print("Digite a nota:");
			double nota = s.nextDouble();
			alunos.add(new Aluno(nome, nota));
		}
		//imprimir a média das notas desses alunos
		System.out.println("Media dos alunos : " + calcularMedia(alunos));
	}
	
	public static double calcularMedia(List<Aluno> alunos) {
		double total = 0.0;
		for(int i=0; i<alunos.size();i++) {
			//Aluno temp = alunos.get(i);
			//total+= temp.getNota();
			total += alunos.get(i).getNota();
		}
		return total/alunos.size();
	}

}
