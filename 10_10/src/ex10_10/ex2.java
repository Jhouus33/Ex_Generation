package ex10_10;

//	Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
//	em seguida crie um objeto avião, defina as instancias deste objeto e apresente
//	as informações deste objeto no console.

public class ex2 {
	
	private String modelo;
	private int velocidadeMax_km_h;
	private String motoresEmpuxo;
	private float comprimento_m;
	private double autonomia_km;
	
	public ex2(String modelo, int velocidadeMax_km_h, String motoresEmpuxo, float comprimento_m, double autonomia_km){
		this.modelo = modelo;
		this.velocidadeMax_km_h = velocidadeMax_km_h;
		this.motoresEmpuxo = motoresEmpuxo;
		this.comprimento_m = comprimento_m;
		this.autonomia_km = autonomia_km;
		
	}
	
	
	public String getModelo() {
		String modeloAviao = "NOME: "+modelo+"\t VELOCIDADE MAX.: "+velocidadeMax_km_h+"\t Motor/Empuxo: "+motoresEmpuxo+"\nCOMPRIMENTO: "+comprimento_m+"\t AUTONOMIA: "+autonomia_km;
		return modeloAviao;
	}
	public void getComparacao() {
		
	}
}
