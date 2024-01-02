import java.util.Scanner;

public class nomedodia {


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Ente com o número do dia da semana (de 1 até 7): ");
Integer dia = sc.nextInt();

String diadaSemana = "";

switch (dia) {
case 01: diadaSemana = "Segunda Feira";
break;
case 02: diadaSemana = "terça feira";
break;
case 03: diadaSemana = "quarta feira";
break;
case 04:diadaSemana = "quinta feira";
break;
case 05:diadaSemana = "sexta feira";
break;
default:
System.out.println("Digite um dia da semana válido! (1 ate 7) ");
System.exit(1);
}

System.out.println("Dia da semana: " + diadaSemana);

sc.close();
}

}