import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Valor do produto:");
	Double valorProduto = scanner.nextDouble();

	System.out.print("Quantidade do Produto: ");
	Integer quantidadeProduto = scanner.nextInt();
	
	Double subTotal = valorProduto * quantidadeProduto;
	
	Boolean freteGratis = subTotal>=100.00;

	Double frete = 15.00;

	if(freteGratis) {
	frete = 0.0;
	System.out.println("Você pode usar frete grátis!");
	} else {
	System.out.println("Será incluido o valor de R$ 15,00 de frete.");
	}

	Double valorFinal = subTotal + frete;
	System.out.println("Total para pagar: " + valorFinal);

	scanner.close();
	}
	}
