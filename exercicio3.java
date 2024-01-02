import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		Double notaDoAluno = scanner.nextDouble();
		
		Boolean passouDeAno = notaDoAluno >= 5;
		
		if (passouDeAno) {
			System.out.println("Parabéns! Você passou de ano por pouco.5z  ");
		} else {
			System.out.println("Infelizmente, ficou de recuperação.4");
		}
		
		scanner.close();
	}
}
