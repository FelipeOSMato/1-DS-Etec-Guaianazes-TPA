package listaTeamsIfElse;

  import java.util.Scanner;

public class Salário {
   public static void main(String Args[]) {
	   Scanner ler = new Scanner(System.in);
	   double s, d, v;
	   
	   System.out.println("Escreva o salário: ");
	   s= ler.nextDouble();
	   
	   System.out.println("Escreva o total de dívidas: ");
	   d= ler.nextDouble();
	   
	   v= s-d;
	   
	   if(v<0) {
		   System.out.println("Faltará: ");
	   }
	   else {
		   System.out.println("Sobrará: ");
	   }
	   System.out.println(v);
	   ler.close();
   }
}
