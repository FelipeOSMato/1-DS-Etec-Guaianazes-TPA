package lista2;

import java.util.Scanner;

public class AlgoritmoDescontoProduto {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double p, pd;
    	 int d;
    	 
    	 System.out.println("Insira o preço do produto: ");
    	 p= ler.nextDouble();
    	 
    	 System.out.println("Insira o valor do desconto: ");
    	 d= ler.nextInt();
    	 
    	 pd= p-(d*p)/100;
    	 
    	 System.out.println("Valor do produto com desconto: R$"+pd);
    	 
    	 ler.close();
     }
}
