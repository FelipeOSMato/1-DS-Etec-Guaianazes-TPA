package prjDecisaoEncadeada;

import java.util.Scanner;

public class ExerNumero {
   public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	double num;
	
	System.out.println("Digite um número: ");
	num=ler.nextDouble();
	
	if(num>0){
		System.out.println("Positivo.");
	}
	else if(num==0) {
		System.out.println("Neutro.");
	}
	else {
		System.out.println("Negativo.");
	}
	ler.close();
  }
}
