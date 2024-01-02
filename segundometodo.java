import java.util.Scanner;

public class segundometodo {

	private static String[] curso;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] meuscursos = listaDeCursos();
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i = 0; i < meuscursos.length; i++) {
			System.out.println("[" + i + "] " + meuscursos[i]);
		}

		System.out.print("O curso que você deseja é o: ");
		Integer posicaodoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaodoCursoEscolhido >= 0 && posicaodoCursoEscolhido < meuscursos.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = exibirFormaDePagamento();
		
		System.out.println("Escolha as formas de pagamento abaixo: ");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[i]);
		}

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
	
		String cursoEscolhido = curso[posicaodoCursoEscolhido];
		String suaformadePagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso que vc  escolheu foi " + cursoEscolhido + " e a forma de pagamento é " + suaformadePagamentoEscolhida);
		
		scanner.close();
	}

	static String[] listaDeCursos() {
		String[] cursos = new String[] {"cursoJava150rs ", "cursoSpring250rs", "cursoJava Avançado500rs"};
		return cursos;
	}
	
	static String[] exibirFormaDePagamento() {
		String[] pagamentos = new String[] {"Cartão", "Boleto",};
		return pagamentos;
	}
	
	static void imprimirTraco() {
		System.out.println("-----------------------------------------------");
	}
}