package prjLa�o1;

public class prjSomaDos100 {
	public static void main(String[] args) {
		int i=1, soma=0;
		
		while(i<101) {
			soma=i+soma;
			
			i++;
		}
		System.out.println("O resultado da soma de todos os n�meros de 1 a 100 �: "+soma);
	}
}
