
public class Fatorial {
	public static void main(String[] args) {
		int FatorialAnterior=1;
		for (int numero=1; numero<=10; numero++) {
			int Fatorial = (numero)*FatorialAnterior;
			FatorialAnterior = Fatorial;
			System.out.println("O Fatorial de " + numero + " � " + Fatorial);
		}
	}
}