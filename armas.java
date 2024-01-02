import java.util.Scanner;

public class armas {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("monte sua combinaçao armas + muniçao: ");
		
		System.out.println("Pistola(1) metralhadora(2) fuzildeassalto(3) ");
		
		System.out.println("muniçao 9mm(1) muniçao 45(2) muciçao 556(3)");
		
	     System.out.println("pege sua arma");
	
		
		int armas = scanner.nextInt();
		String arm = "";
		switch (armas) {
	
		
		case 01: arm = " pistola ";
		break;
		case 02: arm =" submetralhadora ";
		break;
		case 03: arm  = " fuzil ";
		
		}
		
		System.out.println(" armas" + arm);
         		
		System.out.println("escolha sua muniçao para sua arma");
		
		int muniçao = scanner.nextInt();
		String muni = "";
		switch (muniçao) {
		
		case 01: muni =" 9mm esta muniçao foi feita para pistola";
		break;   
		
		case 02: muni =" 45 esta muniçao sserve apenas na metralhadora   ";
		break;
		case 03:muni =" 556  esta muniçao e para fuzil vc vai fazer estrago ";
		break;}
		
		System.out.println("muniçao" + muni  );
		
		
	
	}
}
		
		
		
		
		
		
		
		
		
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		


		
		
		
		
	