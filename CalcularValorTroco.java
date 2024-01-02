import java.util.Scanner;

public class CalcularValorTroco {
	

	public static void main(String[] args) {
		   Scanner Scanner = new Scanner(System.in);
		   
		   System.out.print("Digite o Valor do produto: ");
	       Double valorProduto = Scanner.nextDouble();
	       
       System.out.print("digite quantidade passada pelo cliente" );
	       Double ValorPassadoPeloCliente = Scanner.nextDouble();
	       
	       Double resultado = ValorPassadoPeloCliente - valorProduto;
	       
	       System.out.println("Troco: " +resultado);
	       
	       Scanner.close();
	  }
	  
}