
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem idade maior ou igual a 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("VocÊ não tem 18 anos," + " mas está acompanhado e agora pode entrar.");

			} else {

				System.out.println("Você tem idade menor que 18 anos");
			}
		}
	}
}
