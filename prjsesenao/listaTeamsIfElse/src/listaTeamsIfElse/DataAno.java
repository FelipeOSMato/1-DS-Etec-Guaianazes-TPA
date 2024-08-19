package listaTeamsIfElse;

 import java.util.Scanner;
 
public class DataAno {
  public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int anoElec, anoNac, idade;
	
	System.out.println("Escreva o ano da próxima eleição: ");
	anoElec=ler.nextInt();
	
	System.out.println("Escreva o ano do nascimento do Usuário: ");
	anoNac = ler.nextInt();
	
	idade= anoElec-anoNac;
	
	System.out.println("Idade do Usuário: "+idade);
	
	if (idade<16) {
		System.out.println("Não poderá votar.");
		}
	else{
		System.out.println("Poderá votar.");
		}
	  ler.close();
     }
 }
