package prjEncadeada;

import java.util.Scanner;

public class ExerSal {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal;
		
		sal= ler.nextDouble();
		System.out.println("Salário do usuário: R$"+sal);
		
		if(sal<1302) {
			System.out.println("Abaixo do salário mínimo.");
		}
		else if(sal==1302) {
			System.out.println("Igual ao salário mínimo.");
		}
		else {
			System.out.println("Acima do salário mínimo.");
		}
		ler.close();
	}
}

