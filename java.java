import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		
		
		int x;
		String nome;
	
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("estre com seu nome:");
		nome = ler.nextLine();
		
		System.out.println("ola " + nome);
		
		System.out.println("digite um numero");
		
		x = ler.nextInt();
		
		if (x<5){
			int dobro = x*2;
			
			System.out.println("o dobro de x e" + dobro);

	
		}
		else {
			
			double metade = x/4;
			
			System.out.println("a metade de x e" + metade);
		}
		
		
		
		
	}

}
