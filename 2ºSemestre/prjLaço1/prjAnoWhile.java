package prjLa�o1;

import java.util.Scanner;

public class prjAnoWhile {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int i=1, anoNasc, anoAtual, id;
		String user;
		
		System.out.println("Digite o ano atual: ");
		anoAtual= ler.nextInt();
		
		while(i>0) {
			System.out.print("Digite o nome do usu�rio n�mero "+i+"\n");
			user= ler.next();
			
			System.out.println("Digite o ano de nascimento dele: ");
			anoNasc= ler.nextInt();
			
			id=anoAtual-anoNasc;
			
			if(id<18) {
				System.out.println("O usu�rio "+user+" � menor de idade. \n"+"Ele tem "+id+" anos.");
			}else {
				System.out.println("O usu�rio "+user+" � maior de idade. \n"+"Ele tem "+id+" anos.");
			}
			
			System.out.println("\n");
			
			i++;
		}
		ler.close();
	}
}
