package lista2;

import java.util.Scanner;

public class AlgoritmoSalario {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double s, d, sf;
    	 
    	 System.out.println("Insira o Salário do funcionário: ");
    	 s= ler.nextDouble();
    	 
    	 System.out.println("Insira a quantia de dependentes do funcionário: ");
    	 d= ler.nextDouble();
    	 
    	 sf= s+(d*55);
    	 
    	 System.out.println("Salário final do funcionário: R$"+sf);
    	 ler.close();
     }
}
