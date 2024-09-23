package prjApostilaF;

import java.util.Scanner;

public class prjUsuarios {
    public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		String nome, nomeV, nomeN;
		int id, idV, idN;
		
		System.out.println("Digite o nome do primeiro usuário: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do primeiro usuário: ");
		id= ler.nextInt();
		
		nomeV= nome;
		idV= id;
		
		nomeN= nome;
		idN= id;
		
		System.out.println("Digite o nome do segundo usuário: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do segundo usuário: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do terceiro usuário: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do terceiro usuário: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do quarto usuário: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do quarto usuário: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do quinto usuário: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do quinto usuário: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("O usuário mais velho é: "+nomeV+".");
		System.out.println("Sua idade é de: "+idV+" Anos.");
		
		System.out.println("O usuário mais novo é: "+nomeN+".");
		System.out.println("Sua idade é de: "+idN+" Anos.");
		
		ler.close();
	}
}
