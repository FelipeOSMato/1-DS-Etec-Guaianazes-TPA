package switchCase;

import java.util.Scanner;

public class PrjMencao {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int mb , b, r, i, totAl;
		double porMb, porB, porR, porI;
		String mencao;
		
		System.out.println("Digite o número de Alunos: ");
		totAl= ler.nextInt();
		
		System.out.println("Digite o número de menções MB: ");
		mb= ler.nextInt();
		
		System.out.println("Digite o número de menções B: ");
		b= ler.nextInt();
		
		System.out.println("Digite o número de menções R: ");
		r= ler.nextInt();
		
		System.out.println("Digite o número de menções I: ");
		i= ler.nextInt();
		
		if((mb+b+r+i) != totAl)
			System.out.println("Número invalido de menções.");
		
		System.out.println("Digite a Menção que você queira ver a porcentagem.");
		mencao= ler.next();
		
		switch(mencao) {
			case "MB":
			case "mb":
			case "Mb":
				porMb=(mb*100)/totAl;
				System.out.println("A porcentagem de menções MB são: "+porMb+"%");
				break;
			case "B":
			case "b":
				porB=(b*100)/totAl;
				System.out.println("A porcentagem de menções B são: "+porB+"%");
				break;
			case "R":
			case "r":
				porR=(r*100)/totAl;
				System.out.println("A porcentagem de menções R são: "+porR+"%");
				break;
			case "I":
			case "i":
				porI=(i*100)/totAl;
				System.out.println("A porcentagem de menções I são: "+porI+"%");
				break;
			default:
				System.out.println("Menção invalida.");			
		}
		ler.close();
	}
}
