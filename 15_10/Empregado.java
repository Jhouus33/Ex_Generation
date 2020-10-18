package Atividades;



public class Empregado extends Pessoa {
	private int codigoSetor;
	private int salarioBase;
	private float imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, float imposto) {
		
	super(nome, endereco, telefone)	;
	this.codigoSetor = codigoSetor;
	this.salarioBase = salarioBase;
	this.imposto = imposto;
	}
	
	public double calcularSalario() {
		double salarioMensal = salarioBase - (salarioBase * imposto);
		return salarioMensal;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}


}