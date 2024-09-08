package prjPlacaCarro;

import java.util.Scanner;

public class prjMes {
	public static void main(String[] args) {
		int m;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite o valor de 1 mês: ");
		m= ler.nextInt();
		
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Há 31 dias.");
				break;
			case 2:
				System.out.println("Há 28 dias.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Há 30 dias.");
				break;
			default:
				System.out.println("Mês invalido.");	
		}
		ler.close();
	}
}
