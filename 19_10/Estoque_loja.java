package Atividades;


import java.util.*;



public class Estoque_loja {
	public static void main(String args[]) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> produtos= new ArrayList();
		
		/*
		produtos.add("PROTE�NA DE SOJA");
		produtos.add("P�O DE MEL HUE");
		produtos.add("CH� VERDE");
		produtos.add("PA�OQUINHA");
		*/
		String newProduto;
		
		do {
		System.out.println("\tDigite uma op��o: ");
		System.out.println("\n(1)Deseja adicionar produto ao estoque");
		System.out.println("\n(2)Deseja remover um produto do estoque");
		System.out.println("\n(3)Atualizar algum produto do estoque");
		System.out.println("\n(4)Mostrar todos os produtos do estoque");
		System.out.println("\n(0)Encerrar programa.");
		op = leia.nextInt();
			switch(op) {
			case 1:
				System.out.println("Digite o nome do novo produto: ");
				String item = leia.next();
				produtos.add(item);
				System.out.println(produtos);
				break;
			case 2:
				System.out.println("Digite o nome do produto para remo��o:");
				System.out.println(produtos);
				String itemRem = leia.next();
				produtos.remove(itemRem);
				break;
			case 3 :
				System.out.println(produtos);
				System.out.println("Digite o nome do produto que deseja alterar");
				String verifica = leia.next();
				System.out.println("Digite o nome do produto que ir� entra no lugar de "+verifica+":");
				String itemNovo = leia.next();
					if(produtos.contains(verifica)){
						produtos.remove(verifica);
						produtos.add(itemNovo);
					}else {
						System.out.println("Produto n�o encontdao");
					}
					System.out.println(produtos);
			case 4:
				System.out.println("Produtos no estoque:");
				System.out.println(produtos);
				break;
			default:
				System.out.println("Prodgrama encerrado!");
				
			}	
		
		}while(op != 0);
	
	 }
	
}
