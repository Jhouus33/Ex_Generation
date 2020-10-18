package Atividades;

/*

valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será
		adicionado ao vencimento base do Vendedor). 

*/

public class Vendedor extends Pessoa{
	private float comissao;
	private double valorVendas;
	private float valorComissao;
	
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, float comissao){
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		
	}
	
	public double calcComissao() {
		float valorComissao = (float) (valorVendas * comissao);
		return valorComissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	
}
