package scanbeauty;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {

		Integer op = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();

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

					switch (op) {
					case 1: {
						while (op != 6) {
							System.out.println("- MAQUIAGEM -");
							System.out.println("1- BATOM");
							System.out.println("2- RÍMEL");
							System.out.println("3- BASE");
							System.out.println("4- CORRETIVO");
							System.out.println("5- DELINEADOR");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");

							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());

							switch (op) {
							case 1: {
								while (op != 0) {
									System.out.println("- BATOM -");
									System.out.println("0- VOLTAR");
									System.out.println("1- BATOM ROSA R$24,98");
									System.out.println("2- BATOM VERMELHO R$24,98");
									System.out.println("3- BATOM ROXO R$24,98");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto bat1 = new Produto();
									bat1.setNome("Batom Rosa");
									bat1.setMarca("Avon");
									bat1.setPreco(24.98);

									System.out.println("nome: " + bat1.getNome());
									System.out.println("marca: " + bat1.getMarca());
									System.out.println("preco: " + bat1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										produtos.add(bat1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto bat2 = new Produto();
									bat2.setNome("Batom Vermelho");
									bat2.setMarca("Oboticario");
									bat2.setPreco(24.98);

									System.out.println("nome: " + bat2.getNome());
									System.out.println("marca: " + bat2.getMarca());
									System.out.println("preco: " + bat2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										produtos.add(bat2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto bat3 = new Produto();
									bat3.setNome("Batom Roxo");
									bat3.setMarca("Mary Kay");
									bat3.setPreco(24.98);
									// produtos.add(bat3);

									System.out.println("nome: " + bat3.getNome());
									System.out.println("marca: " + bat3.getMarca());
									System.out.println("preco: " + bat3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho!!");
										produtos.add(bat3);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								}
								break;
							}

							case 2: {
								while (op != 0) {
									System.out.println("- RÍMEL -");
									System.out.println("0- VOLTAR");
									System.out.println("1- RÍMEL 1 R$23,99");
									System.out.println("2- RÍMEL 2 R$20,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto rim1 = new Produto();
									rim1.setNome("Rímel 1");
									rim1.setMarca("Avon");
									rim1.setPreco(23.99);

									System.out.println("nome: " + rim1.getNome());
									System.out.println("marca: " + rim1.getMarca());
									System.out.println("preco: " + rim1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										produtos.add(rim1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto rim2 = new Produto();
									rim2.setNome("Rímel 2");
									rim2.setMarca("Oboticario");
									rim2.setPreco(20.90);

									System.out.println("nome: " + rim2.getNome());
									System.out.println("marca: " + rim2.getMarca());
									System.out.println("preco: " + rim2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										produtos.add(rim2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								}
								break;
							}
							case 3: {
								while (op != 0) {
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
							case 4: {
								while (op != 0) {
									System.out.println("- CORRETIVO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CORRETIVO TOM 1 R$15,00");
									System.out.println("2- CORRETIVO TOM 2 R$15,00");
									System.out.println("3- CORRETIVO TOM 3 R$15,00");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 5: {
								while (op != 0) {
									System.out.println("- DELINEADOR -");
									System.out.println("0- VOLTAR");
									System.out.println("1- DELINEADOR 1 R$19,90");
									System.out.println("2- DELINEADOR 2 R$25,00");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}

							}
						}

					}
					case 2: {
						while (op != 6) {
							System.out.println("- PELE -");
							System.out.println("1- SABONETE");
							System.out.println("2- HIDRATANTE");
							System.out.println("3- CERA DE DEPILÇÃO");
							System.out.println("4- ÓLEO DE BANHO");
							System.out.println("5- MÁSCARAS PARA O ROSTO");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");

							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());

							switch (op) {
							case 1: {
								while (op != 0) {
									System.out.println("- SABONETE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- SABONETE SUAVE R$4,90");
									System.out.println("2- SABONETE D'LEITE R$4,90");
									System.out.println("3- KIT SABONETE FLORAL R$19,75");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 2: {
								while (op != 0) {
									System.out.println("- HIDRATANTE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- HIDRATANTE 1 R$23,98");
									System.out.println("2- HIDRATANTE 2 R$25,00");
									System.out.println("2- HIDRATANTE 3 R$36,99");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 3: {
								while (op != 0) {
									System.out.println("- CERA DE DEPILAÇÃO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CERA 1 R$9,90");
									System.out.println("2- CERA 2 R$9,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 4: {
								while (op != 0) {
									System.out.println("- ÓLEO DE BANHO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- ÓLEO 1 R$30,00");
									System.out.println("2- ÓLEO 2 R$50,98");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 5: {
								while (op != 0) {
									System.out.println("- MÁSCARA PARA O ROSTO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- MÁSCARA 1 R$10,00");
									System.out.println("2- MÁSCARA 2 R$10,00");
									System.out.println("3- MÁSCARA 3 R$10,00");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							}
						}
					}
					case 3: {
						while (op != 6) {
							System.out.println("- PRODUTO DE CABELO -");
							System.out.println("1- SHAMPOO");
							System.out.println("2- CONDICIONADOR");
							System.out.println("3- MÁSCARAS");
							System.out.println("4- TINTURAS");
							System.out.println("5- CREME PARA PENTEAR");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");

							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());

							switch (op) {
							case 1: {
								while (op != 0) {
									System.out.println("- SHAMPOO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- SHAMPOO SEDA R$11,99");
									System.out.println("2- SHAMPOO DOVE R$21,90");
									System.out.println("3- SHAMPOO ELSEVE R$29,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 2: {
								while (op != 0) {
									System.out.println("- CONDICIONADOR -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CONDICIONADOR SEDA R$11,90");
									System.out.println("2- CONDICIONADOR DOVE R$14,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 3: {
								while (op != 0) {
									System.out.println("- MÁSCARAS -");
									System.out.println("0- VOLTAR");
									System.out.println("1- MÁSCARA DOVE R$26,89");
									System.out.println("2- MÁSCARA SALON LINE R$21,18");
									System.out.println("3- MÁSCARA WELLA R$145,30");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 4: {
								while (op != 0) {
									System.out.println("- TINTURAS -");
									System.out.println("0- VOLTAR");
									System.out.println("1- KOLESTON PRETO R$20,99");
									System.out.println("2- KOLESTON VERMELHO R$22,99");
									System.out.println("3- KOLESTON ROXO R$23,60");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 5: {
								while (op != 0) {
									System.out.println("- CREME PARA PENTEAR -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CREME PARA PENTEAR SALON LINE R$25,00");
									System.out.println("2- CREME PARA PENTEAR SEDA R$10,99");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							}
						}
					}
					case 4: {
						while (op != 6) {
							System.out.println("- OUTROS ITENS -");
							System.out.println("1- LUVAS");
							System.out.println("2- SECADOR DE CABELO");
							System.out.println("3- DESODORANTE");
							System.out.println("4- CHAPINHA");
							System.out.println("5- TOUCAS");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");

							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());

							switch (op) {
							case 1: {
								while (op != 0) {
									System.out.println("- LUVAS -");
									System.out.println("0- VOLTAR");
									System.out.println("1- LUVAS ROSA R$18,90");
									System.out.println("2- LUVAS BRANCA R$21,80");
									System.out.println("3- LUVAS ROXO R$20,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							case 2: {
								while (op != 0) {
									System.out.println("- SECADOR DE CABELO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- SECADOR PRETO R$238,90");
									System.out.println("2- SECADOR VERMELHO R$119,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 3: {
								while (op != 0) {
									System.out.println("- DESODORANTE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- DESODORANTE DOVE R$21,90");
									System.out.println("2- DESODORANTE REXONA R$22,99");
									System.out.println("3- DESODORANTE NIVEA R$32,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 4: {
								while (op != 0) {
									System.out.println("- CHAPINHA -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CHAPINHA PRETA R$449,00");
									System.out.println("2- CHAPINHA ROSA R$398,00");
									System.out.println("3- CHAPINHA AZUL R$170,70");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}

							}
							case 5: {
								while (op != 0) {
									System.out.println("- TOUCAS -");
									System.out.println("0- VOLTAR");
									System.out.println("1- TOUCA DE BANHO R$15,50");
									System.out.println("2- TOUCA DE CETIM R$25,00");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
							}
							}
							switch (op) {
							case 6: {
								// Fecha sistema
								break;
							}
							}
						}
					}
					}
				}
			}
			}
		}
		leitura.close();
	}
}

/*
 * // Leitura de dados (input) System.out.println("Nome:"); String nome =
 * leitura.nextLine(); System.out.println("Cpf:"); String cpf =
 * leitura.nextLine();
 * 
 * Pessoa p = new Pessoa(); p.setNome(nome); p.setCpf(Long.valueOf(cpf));
 * 
 * pessoas.add(p);
 * 
 * } case 2: { System.out.println("Digite o cpf da pessoa que deseja alterar:");
 * // finalizar codigo } case 3: {
 * System.out.println("Digite o cpf da pessoa que deseja excluir:"); //
 * finalizar codigo } case 4: { // Saida de dados (output)
 * System.out.println("Listagem de pessoas cadastradas: "); for (Pessoa pessoa :
 * pessoas) { System.out.println("Cpf: " + pessoa.getCpf());
 * System.out.println("Nome: " + pessoa.getNome()); } }
 * 
 * }
 * 
 * }
 * 
 * leitura.close(); } }
 */
