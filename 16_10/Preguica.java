package Atividades;

public class Preguica extends Polimorfismo_Animal {
	private String especie;

	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}



	public String getNome() { //metodo
		return "Nome:"+ super.getNome() + "\tIdade: " + super.getIdade()+"\tRa�a/Esp�cie: "+ super.getEspecie_() + "\tVocaliza��o: "+super.getSom()+"\tLocomo��o: "+super.getLocomocao(); 
	}
}
