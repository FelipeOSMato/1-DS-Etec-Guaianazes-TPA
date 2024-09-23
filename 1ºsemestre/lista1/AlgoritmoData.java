package lista1;
 import java.util.Scanner;
 
public class AlgoritmoData {
    public static void main(String args[]){
    	Scanner ler = new Scanner(System.in);
    	int anoNascimento, anoAtual, idade;
    	
    	System.out.println("Digite o Ano de nascimento do Usuário.");
    	anoNascimento= ler.nextInt();
    	
    	System.out.println("Digite o Ano Atual.");
    	anoAtual= ler.nextInt();
    	
    	idade=anoAtual-anoNascimento;
        System.out.println("Idade do Usuário:"+idade);
    	ler.close();
    
    	}
}
