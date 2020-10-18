package Atividades;

public class Administrador extends Pessoa{
	private double custoViagens;
	private int ajudaAdm;
	private float bonusAdm;
	
	
	public Administrador(String nome, String endereco, String telefone, int ajudaAdm, double custoViagens) {
	super(nome, endereco, telefone);
	this.ajudaAdm = ajudaAdm ;
	this.custoViagens = custoViagens;
	}
	
	
	public double ajudaDeCusto() {
		
		return custoViagens*0.30;
	}

	public double getCustoViagens() {
		
		return custoViagens;
	}

	public void setCustoViagens(double custoViagens) {
		this.custoViagens = custoViagens;
	}

	
	
	
	
}
