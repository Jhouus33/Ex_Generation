package Atividades;

public class Operario extends Pessoa {
	private int valorProducao;
	private double comissao;
	private double vencimentoBase;
	private double vencimentoAtualizado;
	
	public Operario(String nome, String endereco, String telefone, int vencimentoBase, int valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.vencimentoBase = vencimentoBase;
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public float calcularPorcentagem() {
		
		if(valorProducao < 1000) {
			float comissao = (float) 1.05;
			return (float) (vencimentoAtualizado = vencimentoBase *comissao);	
		}
		else if(valorProducao >= 10000 && valorProducao <20000) {
			float comissao = (float) 1.10;
			return (float) (vencimentoAtualizado = vencimentoBase*comissao);			
		}
		else if(valorProducao >= 20000 && valorProducao <100000){
			float comissao = (float) 1.15;
			return (float) (vencimentoAtualizado = vencimentoBase*comissao);
		}
		return (float) vencimentoAtualizado;
	}
	public float getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public float getComissao() {
		return (float) comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public double getVencimentoBase() {
		return vencimentoBase;
	}
	public void setVencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}
	public double getVencimentoAtualizado() {
		return vencimentoAtualizado;
	}
	public void setVencimentoAtualizado(double vencimentoAtualizado) {
		this.vencimentoAtualizado = vencimentoAtualizado;
	}
	
}
