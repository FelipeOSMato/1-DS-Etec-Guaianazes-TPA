package prjListaVetores;

import java.util.*;

public class prjPar {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		final int TAM=20;
		int a[], b[], i, pos=0;
		a= new int[TAM];
		b= new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A: ");
			a[i]= ler.nextInt();
			
			if(a[i]%2==0) {
				b[pos]=a[i];
				pos++;
			}
		}
		for(i=0;i<TAM;i++) {
			if(a[i]%2!=0) {
				b[pos]=a[i];
				pos++;
			}
		}
		System.out.print("\nA = [");
		for(i=0; i<TAM; i++) {
			
			if(i==TAM-1) {
				System.out.print(a[i]);
			}else
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("\nB = [");
		for(i=0; i<TAM; i++) {
			
			if(i==TAM-1) {
				System.out.print(b[i]);
			}else
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		ler.close();
		
	}
}
