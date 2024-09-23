package doWhileExerc;

import java.util.*;

public class exerIdade {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		String nome, nomeV, nomeN;
		int idade, idadeV, idadeN, anoA, anoN, i;
	
		System.out.println("Digite o ano atual: ");
		anoA= ler.nextInt();
		
		System.out.println("Digite o nome do Usuário número 1: ");
		nome=ler.next();
		
		System.out.println("Digite o ano do nascimento do usuário: ");
		anoN=ler.nextInt();
		
		idade=anoA-anoN;
		
		nomeV=nome;
		idadeV=idade;
		
		nomeN=nome;
		idadeN=idade;
		
		for(i=2;i<11;i++) {
			System.out.println("Digite o nome do usuário "+i+": ");
			nome=ler.next();
			
			System.out.println("leia o ano de Nascimento do usuário: ");
			anoN=ler.nextInt();
			
			idade=anoA-anoN;
			
			if(idade>idadeV) {
				nomeV=nome;
				idadeV=idade;
			}else if(idade<idadeN){
				nomeN=nome;
				idadeN=idade;
			}
		}
		System.out.println("\nO usuário mais velho é: "+nomeV);
		System.out.println("E ele possui: "+idadeV+" anos.");
		
		System.out.println("\nO Usuário mais novo é: "+nomeN);
		System.out.println("E ele possui: "+idadeN+" anos.");
		
		ler.close();
	}
}
