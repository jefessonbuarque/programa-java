import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int n1 = ler.nextInt();
		System.out.println("Digite o segundo numero");
		int n2 = ler.nextInt();

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				System.out.println("Numero par" + i);
				break;
			}
		}

	}

}
