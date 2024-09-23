package prjApostilaF;

import java.util.Scanner;

public class prjMary {
     public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal, irpf;
		
		System.out.println("Digite o salário do usuário: ");
		sal= ler.nextDouble();
		
	    if(sal<=1434.59) {
	  irpf=0;
	    }else if(sal<=2150.00) {
	  irpf=(sal*7.5)/100-107.59;
	    }else if(sal<=2866.70) {
	  irpf=(sal*15)/100-269.84;
	    }else if(sal<=3582.00) {
	  irpf=(sal*22.5)/100-483.84;  	
	    }else {
	  irpf=(sal*27.5)/100-662.94;
	    }
	    System.out.printf("O valor do IRPF é de: %.2f R$ \n",irpf);
	    
	    ler.close();
	}
}
