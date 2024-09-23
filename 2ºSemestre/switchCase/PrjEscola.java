package switchCase;

import java.util.Scanner;

public class PrjEscola {
    public static void main(String[] args) {
    	Scanner ler= new Scanner(System.in);
    	int idade;
    	
    	System.out.println("Digite a idade do Usuário: ");
    	idade= ler.nextInt();
    	
    	switch(idade) {
    		case 6:
    		    System.out.println("Dente de leite.");
    		    break;
    		case 7:
    			System.out.println("Júnior.");
    			break;
    		case 8:
    			System.out.println("Júnior Max.");
    			break;
    		case 9:
    			System.out.println("Júnior Master.");
    			break;
    		case 10:
    			System.out.println("Master.");
    			break;
    		default:
    			System.out.println("Idade não aceita.");
    	}
	ler.close();
    }
}
