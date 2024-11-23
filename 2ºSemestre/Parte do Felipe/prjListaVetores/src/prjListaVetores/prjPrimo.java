package prjListaVetores;

import java.util.*;

public class prjPrimo {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], primo=0, i, j;
		a= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º digito de A: ");
			a[i]=ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			for(j=1; j<=a[i]; j++) {
				if(a[i]%j==0) {
					primo++;
				}
			}
			if(a[i]<=1) {
				System.out.println(a[i]+" Não é primo. \n");
			}else if(primo==2) {
				System.out.println(a[i]+" É primo. \n");
			}else {
				System.out.println(a[i]+" Não é primo. \n");
			}
			primo=0;
		}
		ler.close();
	}
}
