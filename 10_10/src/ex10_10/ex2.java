package ex10_10;

//	Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
//	em seguida crie um objeto avião, defina as instancias deste objeto e apresente
//	as informações deste objeto no console.

public class ex2 {
	
	private String nome;
	private String aeronave;
	private String numeroVoo;
	private String localizador;
	private String horario;
	private String from;
	private String to;
	private String classeAviao;
	private String fileira;
	private String poltrona;
	
	
	public String getPassagem() {
		String passagem = "VOO: "+numeroVoo+"EMPBARQUE: "+horario+"\nNOME/NAME: "+nome+"\nLOCALIZADOR: "+localizador+"\nDE/FROM: "+from+"\nPARA/TO: "+to+"\n CLASSE: "+classeAviao+"ASSENTO: "+poltrona+"FILEIRA: "+fileira;
		return passagem;
	}
}
