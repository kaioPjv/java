import java.util.Scanner;

public class bonusnosalari {
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para média salarial: ");
		double mediaSalarialdoFuncionario = sc.nextDouble();
		
		System.out.println("Digite um valor para meta de faturamento anual: ");
		double metaFaturamentoAnual = sc.nextDouble();
		
		System.out.println("Informe o faturamento real da empresa: ");
		double faturamentoReal = sc.nextDouble();

		double percentagemMetaFaturamentoAnual = (metaFaturamentoAnual * 80) / 100; 
		double premiodebomFuncionario = 0;

		if (faturamentoReal >= metaFaturamentoAnual) {
			premiodebomFuncionario = mediaSalarialdoFuncionario;
			System.out.println("Faturamento Real é MAIOR que a meta \n " + " Seu prêmio é: "+ premiodebomFuncionario);

		} else if ((faturamentoReal < metaFaturamentoAnual) || (faturamentoReal >= percentagemMetaFaturamentoAnual)) {
			premiodebomFuncionario = (mediaSalarialdoFuncionario * 80) / 100;
			System.out.println("Faturamento Real é MENOR que a meta: " + premiodebomFuncionario);
		}

	}

}



