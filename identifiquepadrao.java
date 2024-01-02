import java.util.Scanner;

public class identifiquepadrao {
	public static void main(String[] args, String[] curso) {
		Scanner sc = new Scanner(System.in);
		
		imprimirTraco1();
		
		String[] meuscursos = listaDeCursos();
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i = 0; i < meuscursos.length; i++) {
			System.out.println("[" + i + "] " + meuscursos[i]);
		}

		System.out.print("O curso que você deseja é o: ");
		Integer posicaodoCursoEscolhido = sc.nextInt();
		
		Boolean posicaoValida = posicaodoCursoEscolhido >= 1 && posicaodoCursoEscolhido < meuscursos.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		imprimirTraco1();
		
		String[] formasPagamento = exibirFormaDePagamento();
		
		System.out.println("Escolha as formas de pagamento abaixo: ");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[i]);
		}

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		
		String cursoEscolhido = curso[posicaodoCursoEscolhido];
		String suaformadePagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco1();
		
		System.out.println("O curso que vc  escolheu foi " + cursoEscolhido + " e a forma de pagamento é " + suaformadePagamentoEscolhida);
		
		sc.close();
	}

	static String[] listaDeCursos() {
		String[] cursos = new String[] {"cursoJava150rs ", "cursoSpring250rs", "cursoJava Avançado500rs"};
		return cursos;
	}
	
	static String[] exibirFormaDePagamento() {
		String[] pagamentos = new String[] {"Cartão", "Boleto",};
		return pagamentos;
	}
	
	static void imprimirTraco1() {
		System.out.println("-------------");
	}



static void validarPosicao(Boolean posicaoValida, Integer posicao02, Integer posicao03, String[] posicao04) {
	posicaoValida= posicao02 >= 0 && posicao03 < posicao04.length; 
}

static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
	for(int i = 0; i < vetor.length; i++) {
		System.out.println("[" + i + "] " + vetor[i]);
	}
}

static void imprimirTraco2() {
	System.out.println("----------------------------------------------");
}

static void encerrarProgramaPorCausaDaPosicaoInvalida() {
	System.err.println("Posição inválida!");
	System.exit(1);
}
}



