package prjListaVetores;

import java.util.*;

public class prjDivisor {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		final int TAM=10;
		int a[], i, j;
		a= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Escreva o "+(i+1)+"º quantia de A: ");
			a[i]=ler.nextInt();
			
			for(j=1; j<=a[i]; j++) {
				if(j%(i+1)==0) {
					System.out.print(j+" ");
				}
			}
			if(a[i]==i+1) {
				System.out.print("É divisível por "+(i+1)+".\n");
			}else {
				System.out.print("São divisíveis por "+(i+1)+".\n");
			}
		}
		ler.close();
	}
}
