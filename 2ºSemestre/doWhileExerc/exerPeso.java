package doWhileExerc;

import java.util.*;

public class exerPeso {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double a, p;
		String s, i;
	
		do {
			System.out.println("Digite o sexo do usuário: ");
			s=ler.next();
			
			System.out.println("Digite a altura do usuário em centímetros: ");
			a=ler.nextDouble();
			
			if(s.equalsIgnoreCase("f") || s.equalsIgnoreCase("feminino")) {
				p=52+(0.67*(a-152.4));
				System.out.printf("Seu peso ideal é de:\n%.2f",p);
			}else if(s.equalsIgnoreCase("m") || s.equalsIgnoreCase("masculino")) {
				p=52+(0.75*(a-152.4));
				System.out.printf("Seu peso ideal é de:\n%.2f",p);
			}else {
				System.out.println("Sexo invalido.");
				break;
			}
			System.out.println("\n");
			System.out.println("Deseja continuar? S para sim, N para não.");
			i=ler.next();
		}while(i.equalsIgnoreCase("s"));
		ler.close();
	}
}
