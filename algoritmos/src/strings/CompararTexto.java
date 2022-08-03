package strings;

import java.util.Scanner;

public class CompararTexto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		String y = s.nextLine();
		
		if (x.equals(y)) {
			System.out.println("x é igual a y");
		}else {
			System.out.println("x não é igual a y");
		}
		
		s.close();

	}

}
