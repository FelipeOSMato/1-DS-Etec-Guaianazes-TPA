package lista1;

import java.util.Scanner;

public class AlgoritmoDesconto {
    public static void main (String args[]) {
    	Scanner ler = new Scanner(System.in);
    	double p, ds, dp,valor;
    	
    	System.out.println("Digite o valor do Produto");
    	p = ler.nextDouble();
    	
    	System.out.println("Digite o valor do Desconto");
    	ds = ler.nextDouble();  
    	
    	dp=ds/100*p;
    	
    	valor=p-dp;
    			
    	System.out.println("Valor do produto com desconto: R$"+valor);
    	ler.close();
    	
    }
}
