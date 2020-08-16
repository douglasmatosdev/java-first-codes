
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a'; // Não pode aspas duplas, não pode mais de um caracter
		System.out.println(letra);
		
		// O número 66 em unicode é o mesmo na tabela asc por isso vai ser impresso a letra B maiúscula
		char valor = 66; 
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
