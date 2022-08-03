package strings;

import java.util.Scanner;

public class PercorrerTexto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (c != ' ') {
				System.out.print(c + ";");
			}
		}
	}
}
