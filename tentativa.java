import java.util.Scanner;

public class tentativa {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
	System.out.print("digite a nota: ");
    Double notaDoAluno = scanner.nextDouble();
    
    Boolean passoudeAno = notaDoAluno >= 5;
    if (passoudeAno) {
    System.out.println("Parabens passou de ano.5");
    
    }  else {
    System.out.println("infelismente você repitiu.4");
    
    }
    
    scanner.close();
    
	}
}