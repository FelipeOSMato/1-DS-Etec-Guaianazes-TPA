package prjAtvLaço;

import java.util.Scanner;

public class prjPrimo {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int nP, r, divC=0, div=2;
		
		System.out.println("Digite o número que você queira saber se é primo: ");
		nP= ler.nextInt();
		while(div<nP) {
			r=nP%div;
			if(r==0) {
				divC++;
			}
			div++;
		}
		if(nP<=1) {
			System.out.println("Esse número não é primo.");
		}else if(divC==0) {
		 System.out.println("Esse número é primo.");
		}else {
			System.out.println("Esse número não é primo.");
		}
		ler.close();
	}
}
