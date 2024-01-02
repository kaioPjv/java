import java.util.Scanner;

public class calculadoraaddesubb {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite a soma 1: ");
        Double numero1 = scanner.nextDouble();
        
        System.out.println("Digite a Soma: 1 - a Soma, 2 - Subtração");
        Integer opicao = scanner.nextInt();

        System.out.println("digite a soma2: ");
        Double numero2 = scanner.nextDouble();
        
        int opiçao;
        if (opicao == 1) {
        
        System.out.println("A adiçao dos números é = " +(numero1 + numero2)); 
        
        } if (opicao == 2) {
        System.out.println("a subtraçao dos numeros e = " +(numero1 - numero2));
        }
        	
        }
	}
