package Atividades;

public class testePessoa {
	public static void main (String args[]) {
		Fornecedor fornecedor1 = new Fornecedor("Suzano Papel e Celulose","Rua Prudente de Moraes, 4006 - Suzano/SP", "(11) 3636-5030", 1500000, 375000);
		fornecedor1.obterSaldo();
		System.out.println("Saldo disponivel para "+fornecedor1.getNome()+": R$ "+fornecedor1.obterSaldo());
		
		
		Empregado empregado1 = new Empregado("Joao da Silva", "Rua dos Bobos, nº0", "(11)97070-7070", 420, 1500,(float)0.20);
		empregado1.calcularSalario();
		System.out.println("ATENÇÃO sr(a) "+empregado1.getNome()+", seu salário no mês em questão R$ "+empregado1.calcularSalario());  
		
		
		Administrador administrador1 = new Administrador("Eike", "Estr. Gen. Emílio Maurell Filho, 1100 - Gericinó, Rio de Janeiro - RJ", "(21) 2333-4817", 1000, 37500);
		administrador1.ajudaDeCusto();
		System.out.println("Sr(a) "+administrador1.getNome()+" de acordo com o previsto gastos de R$ "+administrador1.getCustoViagens()+" iremos realizar um depósito de R$ "+administrador1.ajudaDeCusto()+" para colaboração com custo.");
		
		Operario operario1 = new Operario("Luiz Inácio Lula da Silva", "Av. Gen. Monteiro de Barros, 638 - Vila Luis Antonio, Guarujá - SP", "(13) 3395-6701", 14000, 57000, 0.05);
		operario1.calcularPorcentagem();
		System.out.println("Valor de produção: R$"+operario1.getValorProducao()+", valor total de vencimentos + comissão: R$ "+operario1.calcularPorcentagem());
		
		Vendedor vendedor1 = new Vendedor("Luiza Helena Trajano", "Estrada Vereador Benedito Adelino, 8413 Fazenda - Tanguá, Angra dos Reis - RJ, 23909-901", "(21)99999-9999", 2000000, (float)0.15);
		vendedor1.calcComissao();
		System.out.println("Sr(a). conforme vendas totais no valor de R$"+vendedor1.getValorVendas()+", sua comissão é o momento R$"+vendedor1.calcComissao());
	}
}
