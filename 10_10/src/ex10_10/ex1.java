package ex10_10;


import java.util.*;

//	Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida
//  crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto
//  no console.
public class ex1 {
	
	//DECLARAÇÃO dos atributos da classe
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
		
	//METODO CONSTRUTOR
		public ex1(String name, String lastName, String middleName, String email, String login, String senha, String rua, String cidade, String estado) {
			this.name = name;
			this.lastName = lastName;
			this.middleName = middleName;
			this.email = email;
			this.login = login;
			this.senha = senha;
			this.rua = rua;
			this.cidade = cidade;
			this.estado = estado;
			
			
		}
	// DECLARAÇÃO dos demais métodos da classe ex1	
		public String getNomeCompleto(){
			String nomeCompleto = name+" "+middleName+" "+lastName;
			return nomeCompleto;
		}
				
	/*	public int getIdade(Date data) {
		Calendar cData = Calendar.getInstance();
		Calendar cHoje= Calendar.getInstance();
		cData.setTime(data);
		cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
		int idade = cData.after(cHoje) ? -1 : 0;
		cData.setTime(data);
		idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
		return idade;
		}
	*/
		
		public String getLogin() {
			String cadastro = "Email= "+email+"\tLogin = "+login+"\tSenha= "+senha;
			return cadastro; 
		
		}
		
		public String getEndereco() {
			String enderecoCompleto = rua+", "+cidade+", "+estado;
			return enderecoCompleto;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public void imprimirInfo() {
			// TODO Auto-generated method stub
			
		}
		
		
	
}
