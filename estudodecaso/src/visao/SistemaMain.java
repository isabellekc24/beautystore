package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Produto;

public class SistemaMain {
	private static ArrayList<Produto> carrinhoProdutos = new ArrayList<>();

	public static void main(String[] args) {

		Integer op = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);

		ProdutoDAO produtoDAO = ProdutoDAO.getInstancia();
		ArrayList<Produto> estoque = produtoDAO.listarProdutos();

		while (op != 5) { // enquanto op for diferente de 5 o programa continua

			System.out.println("- MENU -");
			System.out.println("1- ADICIONAR PRODUTO");
			System.out.println("2- EXIBIR PRODUTOS ADICIONADOS AO CARRINHO");
			System.out.println("3- ALTERAR PRODUTO");
			System.out.println("4- EXCLUIR PRODUTOS ADICIONADOS AO CARRINHO");
			System.out.println("5- SAIR DO PROGRAMA" + "\n");

			System.out.println("Digite sua opção: ");
			op = Integer.valueOf(leitura.nextLine());

			switch (op) {
			case 1: {
				while (op != 4) {
					System.out.println("- ADICIONAR PRODUTOS -");
					System.out.println("1- MAQUIAGEM");
					System.out.println("2- PELE");
					System.out.println("3- PRODUTOS DE CABELO");
					System.out.println("4- RETORNAR PARA O MENU");

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
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Batom")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) { // O código verifica se o código inserido
																		// corresponde a um produto no estoque
											if (op == 1) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break; // para sair do loop qndo 's' for digitado

													} else if (opx.equals("n")) {
														break; // sai do loop quando 'n' for digitado
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n'); // é usado para garantir que o usuário
												// tenha apenas duas opções 's' para adicionar o item ao
												// carrinho ou 'n' para não adicionar. O loop continua até
												// que faça uma dessas escolhas.
											} else if (op == 2) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) { // se digitar 's'
														carrinhoProdutos.add(prod); // o o produto e add ao carrinho
														System.out.println("Produto adicionado ao carrinho");
														System.out.println("");

														break;
													} else if (opx.equals("n")) { // sair do loop quando 'n' for
																					// digitado
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											} else if (op == 3) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 2: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Rímel")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 4) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 5) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							case 3: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Base ")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 6) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break; // para sair do loop qndo 's' for digitado

													} else if (opx.equals("n")) {
														break; // sai do loop quando 'n' for digitado
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 7) {

												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break; // para sair do loop qndo 's' for digitado

													} else if (opx.equals("n")) {
														break; // sai do loop quando 'n' for digitado
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 8) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							case 4: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Corretivo")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 9) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 10) {

												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 11) {

												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							case 5: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Delineador")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 12) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 13) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
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
							System.out.println("5- ESFOLIANTE");
							System.out.println("6- RETORNAR PARA ABA ANTERIOR");

							System.out.println("Digite sua opção: ");
							op = Integer.valueOf(leitura.nextLine());

							switch (op) {
							case 1: {
								while (op != 0) {
									System.out.println("0- VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Sabonete")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}

									}

									System.out.println("Insira qual voce quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {

											if (op == 14) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											}
											if (op == 15) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											}
											if (op == 16) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							case 2: {
								while (op != 0) {
									System.out.println("0- VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Hidratante")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									// break;

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 17) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											}
											if (op == 18) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											}
											if (op == 19) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 3: {
								while (op != 0) {
									System.out.println("0- VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Cera")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 20) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 21) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 4: {
								while (op != 0) {
									System.out.println("0- VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Oleo")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 22) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 23) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 5: {
								while (op != 0) {
									System.out.println("0- VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Esfoliante")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}

									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 24) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											} else if (op == 25) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
											} else if (op == 26) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
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
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Shampoo")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 27) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 28) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 29) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 2: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Condicionador")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 30) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
											if (op == 31) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}

							case 3: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Mascara")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 32) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
											if (op == 33) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
											if (op == 34) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;

							}
							case 4: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Tintura")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 35) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 36) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 37) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							case 5: {
								while (op != 0) {
									System.out.println("0 - VOLTAR");
									for (Produto prod : estoque) {
										if (prod.getNome().contains("Creme")) {
											System.out.println(prod.getCodBarra() + " - " + prod.getNome() + " R$ "
													+ prod.getPreco());
										}
									}

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());

									for (Produto prod : estoque) {
										if (op == prod.getCodBarra()) {
											if (op == 38) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;

													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											} else if (op == 39) {
												do {
													System.out.println(
															"Voce quer adicionar esse item ao carrinho? (s/n)");
													System.out.println("Insira sua opção: ");
													String opx = leitura.nextLine();

													if (opx.equals("s")) {
														System.out.println("Produto adicionado ao carrinho");
														carrinhoProdutos.add(prod);
														System.out.println("");

														break;
													} else if (opx.equals("n")) {
														break;
													} else {
														System.out.println(
																"Opçao incorreta. Porfavor, digite 's' ou 'n'");
													}
												} while (op != 's' && op != 'n');
												break;
											}
										}
									}
									break;
								}
								break;
							}
							}
						}
					}
					}
				}
				break;
			}
			case 2: {

				System.out.println("");
				System.out.println("- EXIBIR PRODUTOS -  ");
				System.out.println("");
				for (Produto produto : carrinhoProdutos) {
					System.out.println("Nome: " + produto.getNome() + "   Marca: " + produto.getMarca() + "   Preco: "
							+ produto.getPreco());
				}
				do {
					System.out.println("Pressione x para voltar pra aba anterior: ");
					String opx = leitura.nextLine();

					if (opx.equals("x")) {
						break;
					} else {
						System.out.println("Opcao incorreta. Por favor, digite x para voltar: ");
					}
				} while (op != 'x');
				break;
			} // aspa case2

			case 3: {
				while (op != 0) {
					System.out.println("");
					System.out.println("-ALTERAR PRODUTO-");
					System.out.println("0- VOLTAR");
					System.out.println("1- ALTERAR NOME DO PRODUTO");
					System.out.println("2- ALTERAR MARCA");
					System.out.println("3- ALTERAR PREÇO");

					System.out.println("Insira qual você quer: ");
					op = Integer.valueOf(leitura.nextLine());
					break;
				}

				switch (op) {
				case 1: {
					System.out.println("- ALTERAR NOME DO PRODUTO -");
					System.out.println("Digite o código de barras do produto a ser alterado:");
					long codBarras = Long.valueOf(leitura.nextLine());

					ProdutoDAO dao = new ProdutoDAO();

					// Percorra a lista de produtos no estoque
					Produto produto = dao.buscaProdutoPorCodBarras(codBarras);

					System.out.println("\nVocê escolheu o produto: " + produto.getNome());
					System.out.println("Digite o novo nome:");
					String novoNome = leitura.nextLine();
					produto.setNome(novoNome);
					
					boolean validacao = dao.alterar(produto);
					if (validacao == true) {
						System.out.println("Nome alterado com sucesso!\n");
					} else {
						System.out.println("Erro ao alterar o nome");
					}

					break;
				}

				case 2: {
					System.out.println("- ALTERAR MARCA DO PRODUTO -");
					System.out.println("Digite o codigo de barras do produto a ser alterado:");
					long codBarras = Long.valueOf(leitura.nextLine());

					for (Produto produto : estoque) {
						if (produto.getCodBarra() == codBarras) {
							System.out.println("\nVocê ecolheu o produto: " + produto.getNome());
							System.out.println("Digite a nova marca:");
							String novaMarca = String.valueOf(leitura.nextLine());
							produto.setMarca(novaMarca);
							System.out.println("Marca alterada com sucesso!");
							break;
						} else {
							System.out.println("Produto não encontrado no estoque.");
						}
					}
					break;
				}

				case 3: {
					System.out.println("- ALTERAR PRECO DO PRODUTO -" + "\n");
					System.out.println("Digite o codigo de barras do produto a ser alterado:");
					long codBarras = Long.valueOf(leitura.nextLine());
					for (Produto produto : carrinhoProdutos) {
						if (produto.getCodBarra() == codBarras) {
							System.out.println("Você ecolheu o produto: " + produto.getNome());
							System.out.println("Digite o novo preco:");
							double novoPreco = Double.valueOf(leitura.nextLine());
							produto.setPreco(novoPreco);
						} else {
							System.out.println();
						}
					}
					break;
				}
				}
				break;
			}

			case 4: {
				System.out.println("");
				System.out.println("EXCLUIR PRODUTOS");
				System.out.println("");

				// exibe a lista de produtos enumerada
				for (int i = 0; i < carrinhoProdutos.size(); i++) { // .size, meio que diz o tamanho da lista que esta
																	// no carrinho
					Produto produto = carrinhoProdutos.get(i);
					System.out.println(i + "- Nome: " + produto.getNome() + "   Marca: " + produto.getMarca()
							+ "   Preco: " + produto.getPreco());
				}

				// essa parte verifica se o carrinhoProdutos estiver vazio exibe uma msg
				if (carrinhoProdutos.isEmpty()) { // .isEmpty, ve se o carrinho esta vazio ou == a 0
					System.out.println("O carrinho esta vazio");
					System.out.println("");
				} else { // se nao, pede ao usuario qual ele quer excluir
					System.out.println("Insira o numero de qual voce quer excluir: ");
					int exc = Integer.valueOf(leitura.nextLine());

					// esse if ve se o numero digitado pelo usuario correponde a algum produto da
					// lista
					// SE estiver na lista, pede para que o usuario confirme ou nao a exclusao.
					// SE NAO estiver na lista diz que o produto e invalido, porque ele nao esta na
					// lista
					if (exc >= 0 && exc < carrinhoProdutos.size()) {
						do {
							System.out.println("Voce tem certeza que quer excluir esse produto? (s/n)");
							System.out.println("Insira sua opção: ");
							String opx = leitura.nextLine();

							if (opx.equals("s")) {
								// produtoExc recebe o produto excluido para remover do carrinhoProdutos
								Produto produtoExc = carrinhoProdutos.remove(exc);
								System.out.println("Produto removido: " + produtoExc.getNome());
								System.out.println("");

								break;
							} else if (opx.equals("n")) {
								break;
							} else {
								System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
							}
						} while (op != 's' && op != 'n');
					} else {
						System.out.println("Produto invalido. Nao removido");
					}
				}
				break;
			}
			case 5: {
				System.out.println("PROGRAMA FINALIZADO!");

				break;
			}
			default:
				System.out.println("opcao invalida!");
				break;
			}
		}
		leitura.close();

	}

}