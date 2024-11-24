import java.util.Scanner; 

public class Tabuada {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			final int TAM=5;
			int a[], i, resul, k, j=0;
			a = new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
				a[i] = in.nextInt();
			}
			
			
			while(j<TAM) {
				for(k=1; k<11; k++) {
					resul=a[j]*k;
					System.out.println(a[j] + "x" + k + "=" + resul);
				}
				System.out.println(" ");
				j++;
			} 
			
			in.close();

		}
}
