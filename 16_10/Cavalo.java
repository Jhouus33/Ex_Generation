package Atividades;

public class Cavalo extends Polimorfismo_Animal {
	private String raca;
	
	public Cavalo() {
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}



	public String getNome() { //metodo
		return "Nome:"+ super.getNome() + "\tIdade: " + super.getIdade()+"\tRaça/Espécie: " + super.getRaca_() + "\tVocalização: "+super.getSom()+"\tLocomoção: "+super.getLocomocao(); 
	}

}
