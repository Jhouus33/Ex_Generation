package Atividades;

public class Cachorro extends Polimorfismo_Animal {
	private String raca;
	
	public Cachorro() {
		
	}
	
	public String getRaca(String raca) {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}





	public String getNome() {
		return "Nome:"+ super.getNome() + "\tidade: " + super.getIdade()+"\tRaça/Espécie: " + super.getRaca_() + "\tVocalização: "+super.getSom()+"\tLocomoção: "+super.getLocomocao(); 
	}
	

}
