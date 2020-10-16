package ex10_10;

public class main_geral {
	
	public static void main (String args[]) {
		ex1 pessoa1 = new ex1("Jonathan", "Pai da Flor", "Ferreira", "j@j", "@Jhouus", "1234", "Rua dos Bobos","Diadema", "SP");
		pessoa1.getEndereco();
		pessoa1.getLogin();
		
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa1.getLogin());
		System.out.println(pessoa1.getEndereco());

	
	}
		
	/*	
		ex1[] lista = new ex1[3];
		
		lista[0] = new ex1("jhouus1", 123456);
		lista[1] = new ex1("Jhouus2", 456789);
		lista[1] = new ex1("Jhouus3", 912345);
		
		for(ex1 roda:lista) {
			roda.imprimirInfo();
		}
		
	
		ex2 passagemAerea = new ex2("123456", "15:10", "Jonathan Ferreira", "ABCDEF", "GRU", "SYD", "EXECUTIVA", "7", "A");
		System.out.println(passagemAerea.getPassagem());
	*/
	
	
}
