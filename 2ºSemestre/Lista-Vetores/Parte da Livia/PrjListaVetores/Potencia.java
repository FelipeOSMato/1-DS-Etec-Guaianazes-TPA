
public class Potencia {
	public static void main(String[] args) {
		
		final int TAM=11;
		int a[], i, poten=1;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			a[i]=poten;
			poten*=2;
			if (i==0) {
				System.out.println("A[" + (i+1) + "]=1");
			}else {
				System.out.println("A[" + (i+1) + "]=" + a[i]);
			}
		}
	}
}
