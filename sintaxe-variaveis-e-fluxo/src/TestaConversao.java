
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1250.70;
		int valor = (int) salario; // casting
		System.out.println(valor);
		
		long numeroGrande  = 324324235231L;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		// Colocar um double como float é ruim devido,
		// os tipos double suportar 64bits e os tipos floats,
		// apenas 32 bits
		// float pontoFlutuante = 3.14; // can not convert double to float
		// System.out.println(pontoFlutuante); // can not convert double to float

		float pontoFlutuanteCasting = (float) 3.14; // Não recomendado
		System.out.println(pontoFlutuanteCasting);

		float pontoFlutuanteFloat = 3.14f; // Recomendado
		System.out.println(pontoFlutuanteFloat);
	}

}
