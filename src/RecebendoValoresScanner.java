import java.util.Scanner;

public class RecebendoValoresScanner {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = ler.nextLine();
		System.out.println("Digite sua idade");
		int idade = ler.nextInt();
		
		System.out.println("Olá " + nome + " sua idade é " + idade);
	}

}
