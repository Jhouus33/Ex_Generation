package ex10_10;


import java.util.*;

//	Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida
//  crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto
//  no console.
public class ex1 {
	
	
		String nomeCompleto;
		private String name;
		private String lastName;
		private String middleName;
		private String email;
		private String login;
		private String senha;
		private String rua;
		private String cidade;
		private String estado;
		
		public ex1(String nome, String meio, String ultimo) {
			name = nome;
			lastName = ultimo;
			middleName = meio;
		}
		
		public String getNomeCompleto(){
			String nomeCompleto = name+" "+middleName+" "+lastName;
			return nomeCompleto;
		}
				
		public int getIdade(Date data) {
		Calendar cData = Calendar.getInstance();
		Calendar cHoje= Calendar.getInstance();
		cData.setTime(data);
		cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
		int idade = cData.after(cHoje) ? -1 : 0;
		cData.setTime(data);
		idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
		return idade;
		}
		
		public String[] getLogin() {
			String[] usuario = { login, senha };
			return usuario;
		}
		
		public String getEndereco() {
			String enderecoCompleto = rua+", "+cidade+", "+estado;
			return enderecoCompleto;
			
		}
	
	
}
