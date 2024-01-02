import java.util.Scanner;

public class concursopublico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com sua nota policial:");
		Double notamatematica = sc.nextDouble();
		
		System.out.println("entre com sua nota portugues:");
		Double notaportugues = sc.nextDouble();
		
        Double somadenotas = notamatematica + notaportugues;
        

		Boolean atingiuMenosQue60Pontos = notaportugues >= 60 && notamatematica >= 60;
		Boolean atingiuNotaMinimaTotal = somadenotas >= 150;
		
		if (atingiuNotaMinimaTotal && atingiuMenosQue60Pontos) {
			System.out.println("Parabéns! Você passou no concurso.");
		} else {
			System.out.println("Você não passou.");
		}

		sc.close();


	}
}
