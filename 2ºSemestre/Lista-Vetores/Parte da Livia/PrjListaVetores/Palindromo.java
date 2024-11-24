import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i;
		a= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
			a[i] = in.nextInt();
		}
		
		if(a[0]==a[9]) {
			if(a[1]==a[8]) {
				if(a[2]==a[7]) {
					if(a[3]==a[6]) {
						if(a[4]==a[5]) {
							System.out.println("O vetor é um palíndromo");
						}else {
							System.out.println("O vetor não é um palíndromo");
						}
					}
				}else {
					System.out.println("O vetor não é um palíndromo");
				}
			}else {
				System.out.println("O vetor não é um palíndromo");
			}
		}else {
			System.out.println("O vetor não é um palíndromo");
		}in.close();
	}
}
