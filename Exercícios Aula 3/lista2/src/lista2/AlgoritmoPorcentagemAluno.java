package lista2;

import java.util.Scanner;

public class AlgoritmoPorcentagemAluno {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 int m, h;
    	 double p, pm, ph;
    	 
    	 System.out.println("Insira o número de mulheres na sala: ");
    	 m= ler.nextInt();
    	 
    	 System.out.println("Insira o número de homens na sala: ");
    	 h= ler.nextInt();
    	 
    	 p= m+h;
    	 
    	 ph= h*100/p;
    	 
    	 pm= m*100/p;
    	 
    	 System.out.println("Total de pessoas na sala: "+p);
    	 System.out.println("Porcentagem de mulheres na sala: "+pm+"%");
    	 System.out.println("Porcentagem de homens na sala: "+ph+"%");
    	 
    	 ler.close();
     }
}
