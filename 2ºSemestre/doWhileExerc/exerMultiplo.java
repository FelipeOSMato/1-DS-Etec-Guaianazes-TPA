package doWhileExerc;

public class exerMultiplo {
	public static void main(String[] args) {
		int i;
		double m;
		
		for(i=1;i<101;i++) {
			m=i%10;
			if(m==0) {
				System.out.println(i+" É múltiplo de 10.");
			}else {
				System.out.println(i);
			}
		}
	}
}
