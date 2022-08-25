package strings;

public class ClasseStringBuilderComparacaoTempo {

	public static void main(String[] args) {
		long exec= 400000;
		String strFinal = "";
		long tInicio = System.currentTimeMillis();
		for (int i = 0; i < exec; i++) {
			strFinal += "a";
		}
		long tFim = System.currentTimeMillis();
		long tResultado = tFim - tInicio;
		System.out.println("Tempo de Execução com operador '+' = " + tResultado + " ms");

		StringBuilder strBuilder = new StringBuilder();
		tInicio = System.currentTimeMillis();
		for (int i = 0; i < exec; i++) {
			strBuilder.append("a");
		}
		tFim = System.currentTimeMillis();
		tResultado = tFim - tInicio;
		System.out.println("Tempo de Execução com StringBuilder = " + tResultado + " ms");
	}

}
