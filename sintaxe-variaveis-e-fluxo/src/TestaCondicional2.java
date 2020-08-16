
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 15;
		int quantidadePessoas = 1;
		boolean acompanhado = false; // quantidadePessoas >= 2
		
		System.out.println("O valor de acompanhado é = " + acompanhado);
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo(a)!!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		if (idade < 18 && acompanhado) {
			System.out.println("Você é menor de 18, mas pode entrar porque está acompnhado");
		} else {
			System.out.println("Você se quer está acompanhado");
		}

	}
}
