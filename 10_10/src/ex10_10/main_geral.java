package ex10_10;

public class main_geral {
	
	public static void main (String args[]) {
		ex1 pessoa1 = new ex1("Jonathan", "Pai da Flor", "Ferreira");
		System.out.println(pessoa1.getNomeCompleto());
		
		ex1 endereco = new ex1("Rua dos Bobos","São Paulo", "SP");
		System.out.println(endereco.getEndereco());
	}
	
	
}
