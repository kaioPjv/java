import java.util.Scanner;

public class calculadorasimpleskaio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		System.out.print("Digite a soma01: ");
		Double numero1 = scanner.nextDouble();

		System.out.print("Digite a Soma: 1 - a Soma, 2 - Subtração, 3 - Divisão, 4 - Multiplicação: ");
		Integer opicao = scanner.nextInt();

		System.out.print("Digite a soma02: ");
		Double numero2 = scanner.nextDouble();

		if(opicao == 1) {
		System.out.println("A soma do números é = " +(numero1 + numero2));
		}if(opicao == 2) {
		System.out.println("A Subtração é = " +(numero1 - numero2));
		}if(opicao == 3){
		System.out.println("A Divisão   é = " +(numero1 / numero2));
		}if(opicao == 4){
		System.out.println("A Multiplicação é = " +(numero1 * numero2));
		}if(opicao == 5){
	     System.out.println("A porcentagem é = " +(numero1 * numero2));
		}if(opicao == 6){
		     System.out.println("A raiz quadrada  é = " +(numero1 * numero2));
		}

}
	
	
}