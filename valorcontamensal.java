import java.util.Scanner;

public class valorcontamensal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	
	
	System.out.print("valor conta  luz:");
	double luz = sc.nextDouble();
    
    System.out.print("valor conta celular:");
    Double cel = sc.nextDouble();
    
    System.out.print("valor  conta agua:");
    Double agua = sc.nextDouble();
    
    System.out.print("valor conta escola do filho:");
    Double escola = sc.nextDouble();
    
    System.out.print("valor conta do cartao:");
    Double cartao = sc.nextDouble();
   
   System.out.print("valor  conta do mercado:");
   Double mercado = sc.nextDouble();
    
    
    Double total = luz
    		    +=cel
    		    +=agua
    		    +=escola
    		    +=cartao
    	        +=mercado;
    	    	
    		
    		System.out.print("resultado mensal =" + total);
    
	}

	}