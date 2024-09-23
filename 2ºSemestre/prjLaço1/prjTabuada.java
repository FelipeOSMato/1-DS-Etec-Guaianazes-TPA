package prjLaço1;

import java.util.Scanner;

public class prjTabuada {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i=1, num, r;
		
		
		System.out.println("Escolha um número para ver a tabuada: ");
		num= ler.nextInt();
		
		while(i<11) {
			r=num*i;
			System.out.println(num+"x"+i+"="+r);
			i++;
		}
		ler.close();
	}
}