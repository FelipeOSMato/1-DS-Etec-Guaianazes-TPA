package listaTeams;

import java.util.Scanner;

public class AlgoritmoInteiros {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 int num1, num2, num3, soma;
    	 
    	 System.out.println("Insira o primeiro número: ");
    	 num1 = ler.nextInt();
    	 
    	 System.out.println("Insira o segundo número: ");
    	 num2 = ler.nextInt();
    	 
    	 System.out.println("Insira o terceiro número: ");
    	 num3 = ler.nextInt();
    	 
    	 soma=(num1*num1)+(num2*num2)+(num3*num3);
    	 
    	 System.out.println("Resultado da soma dos quadrados dos números: "+soma);
    	 
    	 ler.close();
    }
}
