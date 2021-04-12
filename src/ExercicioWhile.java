import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = ler.nextLine();

//		int i = 1;
//
//		do {
//			System.out.println("Estou aqui");
//		} while (i == 1);

		int i = 10;
		while (i >= 1) {
			System.out.println(nome + " na posição " + i);
			i = i - 1;
		}

	}

}
