package prjDecisaoEncadeada;

import java.util.Scanner;

public class ExerSalario {
     public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal, salMin;
		
		System.out.println("Escreva o salário do usuário: R$");
		sal= ler.nextDouble();
		
		System.out.println("Escreva o valor atual do salário minímo: R$");
		salMin= ler.nextDouble();
		
		System.out.println("Salário do usuário: R$"+sal);
		
		if(sal<salMin) {
			System.out.println("Salário Insuficiente.");
		}
		else {
			System.out.println("Salário Suficiente.");
		}
		ler.close();
	}
}
