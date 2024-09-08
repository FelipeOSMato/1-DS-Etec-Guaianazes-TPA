package lista1;

import java.util.Scanner;

public class AlgoritmoMediaAluno {
     public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double ny, nx, m;
        
        System.out.println("Insira a Primeira nota do aluno: ");
        nx = ler.nextDouble();
        
        System.out.println("Insira a Segunda nota do aluno: ");
        ny = ler.nextDouble();
        
        m = (nx+ny)/2;
        
        System.out.println("Media do aluno: "+ m);
        ler.close();
     }
}
