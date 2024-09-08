package switchCase;

import java.util.Scanner;

public class PrjData {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int d, m;
				
		System.out.println("Digite o seu dia de nascimento: ");
		d= ler.nextInt();
		
		System.out.println("Digite o seu mês de nascimento: ");
		m= ler.nextInt();
		
		switch(m) {
		case 1:
			if(d<=20) {
				System.out.println("Seu signo é capricórnio.");
			}else 
			System.out.println("Seu signo é aquário");
			break;
		case 2:
			if(d<=19) {
				System.out.println("Seu signo é aquário.");
			}else 
			System.out.println("Seu signo é peixes");
			break;
		case 3:
			if(d<=20) {
				System.out.println("Seu signo é peixes.");
			}else 
			System.out.println("Seu signo é áries");
			break;
		case 4:
			if(d<=20) {
				System.out.println("Seu signo é áries.");
			}else 
			System.out.println("Seu signo é touro");
			break;
		case 5:
			if(d<=20) {
				System.out.println("Seu signo é touro.");
			}else 
			System.out.println("Seu signo é gêmeos");
			break;
		case 6:
			if(d<=20) {
				System.out.println("Seu signo é gêmeos.");
			}else 
			System.out.println("Seu signo é câncer");
			break;
		case 7:
			if(d<=21) {
				System.out.println("Seu signo é câncer.");
			}else 
			System.out.println("Seu signo é leão");
			break;
		case 8:
			if(d<=22) {
				System.out.println("Seu signo é leão.");
			}else 
			System.out.println("Seu signo é virgem");
			break;
		case 9:
			if(d<=22) {
				System.out.println("Seu signo é virgem.");
			}else 
			System.out.println("Seu signo é libra");
			break;
		case 10:
			if(d<=22) {
				System.out.println("Seu signo é libra.");
			}else 
			System.out.println("Seu signo é escorpião");
			break;
		case 11:
			if(d<=21) {
				System.out.println("Seu signo é escorpião.");
			}else 
			System.out.println("Seu signo é sagitário");
			break;
		case 12:
			if(d<=21) {
				System.out.println("Seu signo é sagitário.");
			}else 
			System.out.println("Seu signo é capricórnio");
			break;
		default:
			System.out.println("Mês invalido.");
		}
		ler.close();
	}
}
