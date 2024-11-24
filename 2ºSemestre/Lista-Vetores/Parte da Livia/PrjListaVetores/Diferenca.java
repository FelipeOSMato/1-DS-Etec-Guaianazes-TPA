import java.util.Scanner;
public class Diferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
	    int a[], b[], c[], i=0, j=0, k=0, cont=0;
	    a = new int[TAM];
	    b = new int[TAM];
	    c = new int[TAM];
		
	    for (i=0; i<TAM; i++) {
	    	System.out.print("Digite a " + (i+1) + "º posição do vetor A: ");
	        a[i] = in.nextInt();
	    }
	        
	    for (i=0; i<TAM; i++) {
	    	System.out.print("Digite a " + (i+1) + "º posição do vetor B: ");
	        b[i] = in.nextInt();
	      }
		
	    for (i=0; i<TAM; i++) {
	    	k=0;
	    	for (j=0; j<TAM; j++) {
	    		if (a[i] == b[j]) {
	    			k++; 
	            }
	        }
	    	if (k==0) {
	    		c[cont] = a[i];
	            cont++;
	        }
	    }
	    
	    System.out.print("C[ ");
	    for (i=0; i<cont; i++) {
	    	System.out.print(c[i] + " ");
	    }
	    System.out.print("]");
		
			in.close();
	}
}
