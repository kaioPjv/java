import java.util.Scanner;

class naos {

public static void main(String[] args) {

	String nome;
	
	int x;
	
	Scanner ler = new  Scanner(System.in);
	
	
	System.out.println("digite seu nome");
	nome = ler.nextLine();
	
	System.out.println("ola" + nome);
	
	
	System.out.println("ok kaio tudo bem? digite(1)pra sim");
	double sim1 = ler.nextDouble();
	
	System.out.println("ok vc quer criar um sitema de dobro?(2sim");
	double sim2 = ler.nextDouble();
	
	System.out.println("digite um numero");
	
x = ler.nextInt();
	
	int dobro = x*2;
    System.out.println("dobro de x e" + dobro);
    
	}

}