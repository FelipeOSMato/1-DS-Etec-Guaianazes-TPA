package prjAtvLa�o;

import java.util.Scanner;

public class prjFatorial {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int fato, i;
		
		System.out.println("Escreva o n�mero que voc� queira saber o fatorial: ");
		fato= ler.nextInt();
		i=fato-1;
		
		while(i>0) {
			fato=fato*i;
			i--;
		}
		System.out.println("o fatorial do numero escolhido �: "+fato);
		ler.close();
	}
}
