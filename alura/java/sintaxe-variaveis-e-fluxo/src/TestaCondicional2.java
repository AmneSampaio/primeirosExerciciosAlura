
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 15;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado) {
		//if (idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar.");			
		}
		
	}

}