package lista1;

import java.util.Scanner;

public class AlgoritmoMesAno {
    public static void main (String args[]) {
    	Scanner ler = new Scanner(System.in);
    	int d, mes, ano;
    	
    	System.out.println("Insira a quantia de dias:");
    	d = ler.nextInt();
    	
    	mes = d/30;
    	ano = d/365;
    			
    	System.out.println("Dias convertidos em meses: "+ mes);
    	System.out.println("Dias convertidos em anos: "+ ano);
    	
    	ler.close();
    }
}
