package listaTeams;

import java.util.Scanner;

public class AlgoritmoIPVA {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double pv, ipva;
    	 int d;
    	 
    	 System.out.println("Insira o preço do veículo: ");
    	 pv = ler.nextDouble();
    	 
    	 d = 4;
    	 
    	 ipva=(d*pv/100);
    	 
    	 System.out.println("Valor do ipva do veículo: R$"+ipva);
    	 ler.close();
    	 }
}
