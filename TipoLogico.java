
public class TipoLogico {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variável false: " + variavelFalsa);
		
		System.out.println("--------------------------------------");
		
		Integer idade = 18;
		
		Boolean suacnhestaemdia = idade >= 18;
		
		// System.out.println("Pode compra um carro? " + pode compra um carro);
		
		if (suacnhestaemdia) {
			System.out.println("Sim! Ele(a) pode compra um carro");
		} else {
			System.out.println("Não! Ele(a) vc nao pode comprar um carro sua cn esta incorreta.");
		}
	}

}