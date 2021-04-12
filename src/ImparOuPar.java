import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero e te direi se é impar ou par");
		int numero = ler.nextInt();
		
		if(numero % 2 == 0){
			System.out.println(numero+ " Numero par");
		}else {
			System.out.println(numero + " Numero impar");
		}
		

	}

}
