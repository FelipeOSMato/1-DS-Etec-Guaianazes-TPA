package prjListaVetores;

import java.util.*;

public class prjRotina {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], x, sim=0, i;
		a=new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A: ");
			a[i]= ler.nextInt();
		}
		System.out.println("\nDigite um valor que deseja procurar em A: ");
		x=ler.nextInt();
		
		for(i=0; i<TAM; i++) {
			if(x==a[i]) {
				sim++;
			}
		}
		if(sim==1) {
			System.out.println("O valor está armazenado em "+sim+" posição do vetor A");
		}else if(sim>1){
			System.out.println("O valor está armazenado em "+sim+" posições do vetor A");
		}else {
			System.out.println("O valor digitado não foi encontrado.");
		}
		ler.close();
	}
}
