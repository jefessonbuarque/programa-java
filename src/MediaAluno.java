import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = ler.nextLine();
		
		System.out.println("Digite a primeira nota");
		double n1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double n2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double n3 = ler.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double n4 = ler.nextDouble();
		
		double media = (n1+n2+n3+n4) / 4;
		
		System.out.println("Olá " + nome + " Sua media é "+ media);
		 
		if(media >= 7) {
			System.out.println("Aluno Aprovado!");
			
		}else if (media >=5 ) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Deu ruim! Aluno Reprovado");
		}
	}
	

}
