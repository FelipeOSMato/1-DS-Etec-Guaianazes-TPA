package listaTeams;

import java.util.Scanner;

public class AlgoritmoMetro {
     public static void main(String args[]) {
    	 Scanner ler = new Scanner(System.in);
    	 double m, km;
    	 
    	 System.out.println("Insira uma quantia de metros: ");
    	 m= ler.nextDouble();
    	 
    	 km= m/1000;
    	 
    	 System.out.println("Metros convertidos em Km: "+km+"KM");
    	 ler.close();
     }
}
