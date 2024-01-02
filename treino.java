import java.util.Scanner;

public class treino { 
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("digite sua nota");
		 Double notaDoAluno = sc.nextDouble();
		 
		  Boolean passoudeAno = notaDoAluno >= 5;
		    if (passoudeAno) {
         
		   System.out.println("parabens passou de ano");
		   
	
		    } else {

		    System.out.println("infelismente repetiu");
		    
		    
		    }
}
	
	
}