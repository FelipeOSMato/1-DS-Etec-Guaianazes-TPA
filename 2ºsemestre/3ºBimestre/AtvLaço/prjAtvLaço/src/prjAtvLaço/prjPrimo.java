package prjAtvLa�o;

import java.util.Scanner;

public class prjPrimo {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int nP, r, divC=0, div=2;
		
		System.out.println("Digite o n�mero que voc� queira saber se � primo: ");
		nP= ler.nextInt();
		while(div<nP) {
			r=nP%div;
			if(r==0) {
				divC++;
			}
			div++;
		}
		if(nP<=1) {
			System.out.println("Esse n�mero n�o � primo.");
		}else if(divC==0) {
		 System.out.println("Esse n�mero � primo.");
		}else {
			System.out.println("Esse n�mero n�o � primo.");
		}
		ler.close();
	}
}
