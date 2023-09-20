package scanbeauty;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {

		Integer op = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<Produto> pessoas = new ArrayList<>();

		while (op != 6) {

			System.out.println("- MENU -");
			System.out.println("1- ADICIONAR PRODUTO");
			System.out.println("2- EXIBIR PRODUTO");
			System.out.println("3- ALTERAR PRODUTO");
			System.out.println("4- EXCLUIR PRODUTO");
			System.out.println("5- CADASTRAR NOVOS PRODUTOS");
			System.out.println("6- SAIR DO PROGRAMA");

			op = Integer.valueOf(leitura.nextLine());

			switch (op) {
			case 6: {
				// Fecha sistema
				break;
			}
			case 1: {
				
				while (op != 5) {
					System.out.println("- ADICIONAR PRODUTOS -");
					System.out.println("1- MAQUIAGEM");
					System.out.println("2- PELE");
					System.out.println("3- PRODUTO DE CABELO");
					System.out.println("4- OUTROS ITENS");
					System.out.println("5- RETORNAR PARA O MENU");
				
					System.out.println("Digite sua opção: ");
					op = Integer.valueOf(leitura.nextLine());
					
					switch(op) {
					case 1: {
						while(op !=6) {
							System.out.println("- MAQUIAGEM -");
							System.out.println("1- BATOM");
							System.out.println("2- RÍMEL");
							System.out.println("3- BASE");
							System.out.println("4- CORRETIVO");
							System.out.println("5- DELINEADOR");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");
							
							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());
							
							switch(op) {
							case 1:{
								while(op !=0) {
									System.out.println("- BATOM -");
									System.out.println("0- VOLTAR");
									System.out.println("1- BATOM ROSA R$24,98");
									System.out.println("2- BATOM VERMELHO R$24,98");
									System.out.println("3- BATOM ROXO R$24,98");
									
									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;	
							       }
				               }
							case 2: {
								while(op !=0) {
									System.out.println("- RÍMEL -");
									System.out.println("0- VOLTAR");
									System.out.println("1- RÍMEL 1 R$23,99");
									System.out.println("2- RÍMEL 2 R$20,90");
									
									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 3: {
								while(op!=0) {
									System.out.println("- BASE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- BASE TOM 1 R$16,99");
									System.out.println("2- BASE TOM 2 R$16,99");
									System.out.println("3- BASE TOM 3 R$16,99");
									
									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
									
								}
							}
							
							}
						}
						
					}
					
					}
				
				}
				
				
				
				/*// Leitura de dados (input)
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();

				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Long.valueOf(cpf));

				pessoas.add(p);
				*/
			}
			case 2: {
				System.out.println("Digite o cpf da pessoa que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o cpf da pessoa que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				// Saida de dados (output)
				System.out.println("Listagem de pessoas cadastradas: ");
				for (Pessoa pessoa : pessoas) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
			}

			}

		}

		leitura.close();
	}
}
