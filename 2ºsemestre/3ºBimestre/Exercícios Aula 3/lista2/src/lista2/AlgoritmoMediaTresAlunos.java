package lista2;

import java.util.Scanner;

public class AlgoritmoMediaTresAlunos {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double na, nb, nc, m;
    	 
    	 System.out.println("Insira a nota do aluno 1: ");
    	 na= ler.nextDouble();
    	 
    	 System.out.println("Insira a nota do aluno 2: ");
    	 nb= ler.nextDouble();
    	 
    	 System.out.println("Insira a nota do aluno3: ");
    	 nc= ler.nextDouble();
    	 
    	 m= (na+nb+nc)/3;
    	 
    	 System.out.println("Média dos 3 Alunos: "+m);
    	 
    	 ler.close();
     }
}
