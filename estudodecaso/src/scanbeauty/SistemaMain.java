package scanbeauty;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {
	private static ArrayList<Produto> carrinhoProdutos = new ArrayList<>();
	private static ArrayList<Produto> estoque = new ArrayList<>();

	public static void main(String[] args) {

		Integer op = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);

		preencheEstoqueFicticio();

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
									System.out.println("- SHAMPOO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- SHAMPOO SEDA R$11,99");
									System.out.println("2- SHAMPOO DOVE R$21,90");
									System.out.println("3- SHAMPOO ELSEVE R$29,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto sh1 = new Produto();
									sh1.setNome("Shampoo Seda");
									sh1.setMarca("Dove");
									sh1.setPreco(11.99);

									System.out.println("nome: " + sh1.getNome());
									System.out.println("marca: " + sh1.getMarca());
									System.out.println("preco: " + sh1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sh1);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								case 2: {
									Produto sh2 = new Produto();
									sh2.setNome("Shampoo Dove");
									sh2.setMarca("Dove");
									sh2.setPreco(21.90);

									System.out.println("nome: " + sh2.getNome());
									System.out.println("marca: " + sh2.getMarca());
									System.out.println("preco: " + sh2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sh2);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}

								case 3: {
									Produto sh3 = new Produto();
									sh3.setNome("Shampoo Elseve");
									sh3.setMarca("Elseve");
									sh3.setPreco(29.90);

									System.out.println("nome: " + sh3.getNome());
									System.out.println("marca: " + sh3.getMarca());
									System.out.println("preco: " + sh3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sh3);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								}
								break;
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
								switch (op) {
								case 1: {
									Produto cond1 = new Produto();
									cond1.setNome("Condicionador Seda");
									cond1.setMarca("Seda");
									cond1.setPreco(11.90);

									System.out.println("nome: " + cond1.getNome());
									System.out.println("marca: " + cond1.getMarca());
									System.out.println("preco: " + cond1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(cond1);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								case 2: {
									Produto cond2 = new Produto();
									cond2.setNome("Condicionador Dove");
									cond2.setMarca("Dove");
									cond2.setPreco(14.90);

									System.out.println("nome: " + cond2.getNome());
									System.out.println("marca: " + cond2.getMarca());
									System.out.println("preco: " + cond2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(cond2);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								}
								break;
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
								switch (op) {
								case 1: {
									Produto masc1 = new Produto();
									masc1.setNome("Mascara Dove");
									masc1.setMarca("Dove");
									masc1.setPreco(26.89);

									System.out.println("nome: " + masc1.getNome());
									System.out.println("marca: " + masc1.getMarca());
									System.out.println("preco: " + masc1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(masc1);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}

								case 2: {
									Produto masc2 = new Produto();
									masc2.setNome("Mascara Salon Line");
									masc2.setMarca("Salon Line");
									masc2.setPreco(21.90);

									System.out.println("nome: " + masc2.getNome());
									System.out.println("marca: " + masc2.getMarca());
									System.out.println("preco: " + masc2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(masc2);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}

								case 3: {
									Produto masc3 = new Produto();
									masc3.setNome("Mascara Wella");
									masc3.setMarca("Wella");
									masc3.setPreco(145.30);

									System.out.println("nome: " + masc3.getNome());
									System.out.println("marca: " + masc3.getMarca());
									System.out.println("preco: " + masc3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(masc3);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								}
								break;

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

								switch (op) {
								case 1: {
									Produto tin1 = new Produto();
									tin1.setNome("Koleston preto");
									tin1.setMarca("Wella");
									tin1.setPreco(20.99);

									System.out.println("nome: " + tin1.getNome());
									System.out.println("marca: " + tin1.getMarca());
									System.out.println("preco: " + tin1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(tin1);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}

								case 2: {
									Produto tin2 = new Produto();
									tin2.setNome("Koleston Vermelho");
									tin2.setMarca("Wella");
									tin2.setPreco(22.99);

									System.out.println("nome: " + tin2.getNome());
									System.out.println("marca: " + tin2.getMarca());
									System.out.println("preco: " + tin2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(tin2);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}

								case 3: {
									Produto tin3 = new Produto();
									tin3.setNome("Koleston Roxo");
									tin3.setMarca("Wella");
									tin3.setPreco(23.90);

									System.out.println("nome: " + tin3.getNome());
									System.out.println("marca: " + tin3.getMarca());
									System.out.println("preco: " + tin3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(tin3);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								}
								break;
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

								switch (op) {
								case 1: {
									Produto crem1 = new Produto();
									crem1.setNome("Creme para pentear");
									crem1.setMarca("SalonLine");
									crem1.setPreco(25.00);

									System.out.println("nome: " + crem1.getNome());
									System.out.println("marca: " + crem1.getMarca());
									System.out.println("preco: " + crem1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(crem1);
											System.out.println("");

											break;

										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
								case 2: {
									Produto crem2 = new Produto();
									crem2.setNome("Creme para pentear Seda");
									crem2.setMarca("Seda");
									crem2.setPreco(25.00);

									System.out.println("nome: " + crem2.getNome());
									System.out.println("marca: " + crem2.getMarca());
									System.out.println("preco: " + crem2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(crem2);
											System.out.println("");

											break;
										} else if (opx.equals("n")) {
											break;
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
									break;
								}
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

					// Percorra a lista de produtos no estoque
					for (Produto produto : estoque) {
						if (produto.getCodBarra() == codBarras) {
							System.out.println("\nVocê escolheu o produto: " + produto.getNome());
							System.out.println("Digite o novo nome:");
							String novoNome = leitura.nextLine();
							produto.setNome(novoNome);
							System.out.println("Nome alterado com sucesso!\n");
							break; // Isso encerrará, saindo do loop
						}
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

	public static void preencheEstoqueFicticio() {

		// produtos de maquiagem

		Produto bat1 = new Produto();
		bat1.setNome("Batom Rosa");
		bat1.setMarca("Avon");
		bat1.setPreco(24.98);
		bat1.setCodBarra(1);
		estoque.add(bat1);

		Produto bat2 = new Produto();
		bat2.setNome("Batom Vermelho");
		bat2.setMarca("Oboticario");
		bat2.setPreco(24.98);
		bat2.setCodBarra(2);
		estoque.add(bat2);

		Produto bat3 = new Produto();
		bat3.setNome("Batom Roxo");
		bat3.setMarca("Mary Kay");
		bat3.setPreco(24.98);
		bat3.setCodBarra(3);
		estoque.add(bat3);

		Produto rim1 = new Produto();
		rim1.setNome("Rímel 1");
		rim1.setMarca("Avon");
		rim1.setPreco(23.99);
		rim1.setCodBarra(4);
		estoque.add(rim1);

		Produto rim2 = new Produto();
		rim2.setNome("Rímel 2");
		rim2.setMarca("Oboticario");
		rim2.setPreco(20.90);
		rim2.setCodBarra(5);
		estoque.add(rim2);

		Produto bas1 = new Produto();
		bas1.setNome("Base tom 1");
		bas1.setMarca("Avon");
		bas1.setPreco(16.99);
		bas1.setCodBarra(6);
		estoque.add(bas1);

		Produto bas2 = new Produto();
		bas2.setNome("Base tom 2");
		bas2.setMarca("Oboticario");
		bas2.setPreco(16.99);
		bas2.setCodBarra(7);
		estoque.add(bas2);

		Produto bas3 = new Produto();
		bas3.setNome("Base tom 3");
		bas3.setMarca("Ruby Rose");
		bas3.setPreco(16.99);
		bas3.setCodBarra(8);
		estoque.add(bas3);

		Produto corr1 = new Produto();
		corr1.setNome("Corretivo tom 1");
		corr1.setMarca("Ruby Rose");
		corr1.setPreco(15.00);
		corr1.setCodBarra(9);
		estoque.add(corr1);

		Produto corr2 = new Produto();
		corr2.setNome("Corretivo tom 2");
		corr2.setMarca("Oboticario");
		corr2.setPreco(15.00);
		corr2.setCodBarra(10);
		estoque.add(corr2);

		Produto corr3 = new Produto();
		corr3.setNome("Corretivo tom 3");
		corr3.setMarca("Ruby Rose");
		corr3.setPreco(15.00);
		corr3.setCodBarra(11);
		estoque.add(corr3);

		Produto del1 = new Produto();
		del1.setNome("Delineador 1");
		del1.setMarca("Avon");
		del1.setPreco(19.90);
		del1.setCodBarra(12);
		estoque.add(del1);

		Produto del2 = new Produto();
		del2.setNome("Delineador 2");
		del2.setMarca("Oboticario");
		del2.setPreco(25.00);
		del2.setCodBarra(13);
		estoque.add(del2);

		// produtos de pele

		Produto sab1 = new Produto();
		sab1.setNome("Sabonete Suave");
		sab1.setMarca("Dove");
		sab1.setPreco(4.90);
		sab1.setCodBarra(14);
		estoque.add(sab1);

		Produto sab2 = new Produto();
		sab2.setNome("Sabonete D'Leite ");
		sab2.setMarca("Natura");
		sab2.setPreco(6.98);
		sab2.setCodBarra(15);
		estoque.add(sab2);

		Produto sab3 = new Produto();
		sab3.setNome("Kit sabonete floral");
		sab3.setMarca("Oboticario");
		sab3.setPreco(19.75);
		sab3.setCodBarra(16);
		estoque.add(sab3);

		Produto hid1 = new Produto();
		hid1.setNome("Hidratante 1");
		hid1.setMarca("Oboticario");
		hid1.setPreco(23.98);
		hid1.setCodBarra(17);
		estoque.add(hid1);

		Produto hid2 = new Produto();
		hid2.setNome("Hidratante 2");
		hid2.setMarca("Natura");
		hid2.setPreco(25.00);
		hid2.setCodBarra(18);
		estoque.add(hid2);

		Produto hid3 = new Produto();
		hid3.setNome("Hidratante 3");
		hid3.setMarca("Nivea");
		hid3.setPreco(36.99);
		hid3.setCodBarra(19);
		estoque.add(hid3);

		Produto cera1 = new Produto();
		cera1.setNome("Cera 1");
		cera1.setMarca("Depi Roll");
		cera1.setPreco(9.90);
		cera1.setCodBarra(20);
		estoque.add(cera1);

		Produto cera2 = new Produto();
		cera2.setNome("Cera 2");
		cera2.setMarca("Veet");
		cera2.setPreco(9.90);
		cera2.setCodBarra(21);
		estoque.add(cera2);

		Produto oleo1 = new Produto();
		oleo1.setNome("Oleo 1");
		oleo1.setMarca("Natura");
		oleo1.setPreco(30.90);
		oleo1.setCodBarra(22);
		estoque.add(oleo1);

		Produto oleo2 = new Produto();
		oleo2.setNome("Oleo 2");
		oleo2.setMarca("Oboticario");
		oleo2.setPreco(50.98);
		oleo2.setCodBarra(23);
		estoque.add(oleo2);

		Produto esf1 = new Produto();
		esf1.setNome("Esfoliante 1");
		esf1.setMarca("Nivea");
		esf1.setPreco(24.98);
		esf1.setCodBarra(24);
		estoque.add(esf1);

		Produto esf2 = new Produto();
		esf2.setNome("Esfoliante 2");
		esf2.setMarca("Sephora");
		esf2.setPreco(32.50);
		esf2.setCodBarra(25);
		estoque.add(esf2);

		Produto esf3 = new Produto();
		esf3.setNome("Esfoliante 3");
		esf3.setMarca("Oboticario");
		esf3.setPreco(19.98);
		esf3.setCodBarra(26);
		estoque.add(esf3);

		// produtos de cabelo

	}
}

/*
 * // Leitura de dados (input) System.out.println("Nome:"); String nome =
 * leitura.nextLine(); System.out.println("Cpf:"); String cpf =
 * leitura.nextLine(); Pessoa p = new Pessoa(); p.setNome(nome);
 * p.setCpf(Long.valueOf(cpf)); pessoas.add(p); } case 2: {
 * System.out.println("Digite o cpf da pessoa que deseja alterar:"); //
 * finalizar codigo } case 3: {
 * System.out.println("Digite o cpf da pessoa que deseja excluir:"); //finalizar
 * codigo } case 4: { // Saida de dados (output)
 * System.out.println("Listagem de pessoas cadastradas: "); for (Pessoa pessoa
 * :pessoas) { System.out.println("Cpf: " + pessoa.getCpf());
 * System.out.println("Nome: " + pessoa.getNome()); } } } }
 */
