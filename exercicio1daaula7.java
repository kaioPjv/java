import java.util.Scanner;

public class exercicio1daaula7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	String[] tarefasdodia = new String[5];

	System.out.println("== Cadastrar as 5 Principais Tarefas Diária ==");
	for(int i = 0; i <  tarefasdodia .length; i++)
	{
	System.out.print("[" + i + "] " + "Digite a Tarefa: ");
	 tarefasdodia [i] = sc.nextLine();
	}
	System.out.println("== imprimindo tarefas diarias==");
	for(int i = 0; i <  tarefasdodia .length; i++)
	{
	System.out.println("[" + i + "] " + "Tarefa Diária: " +  tarefasdodia [i]);
	}
	sc.close();
	}

}
