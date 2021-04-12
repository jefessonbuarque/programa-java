
public class PessoaExemplo {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.CPF = "112";
		p1.idade = 27;
		p1.nome = "Pedro";
		
		System.out.println(p1);
		
		Pessoa p2 = new Pessoa();
		p2.CPF = "321";
		p2.idade = 20;
		p2.nome = "Maria";
		
		System.out.println(p2);
		
		
	}

}
