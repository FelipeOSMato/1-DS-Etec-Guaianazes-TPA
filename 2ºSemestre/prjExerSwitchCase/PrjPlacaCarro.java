package prjPlacaCarro;

import java.util.Scanner;

public class PrjPlacaCarro {
	public static void main(String[] args) {
		int np;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite o último digito de sua Placa de carro: ");
		np= ler.nextInt();
				
		switch(np) {
			case 1:
			case 2:
				System.out.println("Não poderá circular segunda.");
				break;
			case 3:
			case 4:
				System.out.println("Não poderá circular terça.");
				break;
			case 5:
			case 6:
				System.out.println("Não poderá circular quarta.");
				break;
			case 7:
			case 8:
				System.out.println("Não poderá circular quinta.");
				break;
			case 9:
			case 0:
				System.out.println("Não poderá circular sexta.");
				break;
			default:
				System.out.println("Número invalido.");
		}
	ler.close();
	}
}
