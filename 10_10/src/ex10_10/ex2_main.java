package ex10_10;

public class ex2_main {

	public static void main (String args[]) {
		ex2 aviao1 = new ex2("Eurofighter EF 2000", 2338, "2 x 90", (float) 15.96, 3700);
		aviao1.getModelo();
		System.out.println(aviao1.getModelo());
		
		ex2 aviao2 = new ex2("Dassaault Rafale C", 2149, "2 x 73", (float) 15.27, 3280);
		aviao1.getModelo();
		System.out.println(aviao2.getModelo());
	}
}
