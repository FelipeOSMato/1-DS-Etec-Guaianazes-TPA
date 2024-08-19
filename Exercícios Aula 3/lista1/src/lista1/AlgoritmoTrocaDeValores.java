package lista1;
 import java.util.Scanner;

public class AlgoritmoTrocaDeValores {
    public static void main (String args[]) {
    	Scanner ler = new Scanner(System.in);
    	int a, b, c;
    	
    	System.out.println("Digite o valor A:");
    	a = ler.nextInt();
    	
    	System.out.println("Digite o valor B:");
    	b = ler.nextInt();
    	
    	c=a;
    	a=b;
    	b=c;
    	
    	System.out.println("Valor A invertido: "+a);
    	System.out.println("Valor B invertido: "+b);
    		
    	ler.close();
    }
	     
}
