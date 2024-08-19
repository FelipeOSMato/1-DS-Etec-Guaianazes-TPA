package prjDecisaoEncadeada;

import java.util.Scanner;

public class ExerTemp {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double f,c;
	
     System.out.println("Digite a temperatura em Fahrenheits: ");
     f=ler.nextDouble();
     
     c=(f-32)/1.8;
     System.out.println("Temperatura em Celsius: "+c+"º");
     
     if(c>=22) {
       System.out.println("Está calor.");
     }
     else if(c>=15) {
    	 System.out.println("Está ameno.");
     }
     else {
    	 System.out.println("está frio.");
     }
     ler.close();
   }
}
