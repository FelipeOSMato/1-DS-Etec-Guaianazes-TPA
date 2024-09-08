package prjApostilaF;

import java.util.Scanner;

public class prjIrpf {
     public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal, ali, parc, irpf;
		
		System.out.println("Digite o salário do usuário: ");
		sal= ler.nextDouble();
		
	    if(sal<=1434.59) {
	    	ali=0;
	    	parc=0;
	    }else if(sal<=2150.00) {
	    	ali=7.5;
	    	parc=107.59;
	    }else if(sal<=2866.70) {
	    	ali=15.00;
	    	parc=268.84;
	    }else if(sal<=3582.00) {
	    	ali=22.5;
	    	parc=483.84;
	    }else {
	    	ali=27.5;
	    	parc=662.94;
	    }
	    irpf=(sal*ali)/100-parc;
	    System.out.printf("O valor do IRPF é de: %.2f R$ \n",irpf);
	    
	    ler.close();
	}
}
