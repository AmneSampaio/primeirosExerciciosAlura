
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");	
		
		int idade = 15;
		int quantidadePessoas = 1;

		if (idade >= 18) { 
			
			System.out.println("Voc� tem mais de 18 anos");
		
		} else {
			if (quantidadePessoas >=2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar, "
						+ "pois est� acompanhado");
			} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
			}	
		}
	}

}
