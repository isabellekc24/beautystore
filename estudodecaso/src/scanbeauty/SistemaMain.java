package scanbeauty;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {

		Integer op = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<Produto> carrinhoProdutos = new ArrayList<>();

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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bat1);
											System.out.println("");

											break; // para sair do loop qndo 's' for digitado

										} else if (opx.equals("n")) {
											break; // sai do loop quando 'n' for digitado
										} else {
											System.out.println("Opçao incorreta. Porfavor, digite 's' ou 'n'");
										}
									} while (op != 's' && op != 'n');
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bat2);
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
									Produto bat3 = new Produto();
									bat3.setNome("Batom Roxo");
									bat3.setMarca("Mary Kay");
									bat3.setPreco(24.98);
									// produtos.add(bat3);

									System.out.println("nome: " + bat3.getNome());
									System.out.println("marca: " + bat3.getMarca());
									System.out.println("preco: " + bat3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bat3);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(rim1);
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
									Produto rim2 = new Produto();
									rim2.setNome("Rímel 2");
									rim2.setMarca("Oboticario");
									rim2.setPreco(20.90);

									System.out.println("nome: " + rim2.getNome());
									System.out.println("marca: " + rim2.getMarca());
									System.out.println("preco: " + rim2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(rim2);
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
									System.out.println("- BASE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- BASE TOM 1 R$16,99");
									System.out.println("2- BASE TOM 2 R$16,99");
									System.out.println("3- BASE TOM 3 R$16,99");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto bas1 = new Produto();
									bas1.setNome("Base tom 1");
									bas1.setMarca("Avon");
									bas1.setPreco(16.99);

									System.out.println("nome: " + bas1.getNome());
									System.out.println("marca: " + bas1.getMarca());
									System.out.println("preco: " + bas1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(bas1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto bas2 = new Produto();
									bas2.setNome("Base tom 2");
									bas2.setMarca("Oboticario");
									bas2.setPreco(16.99);

									System.out.println("nome: " + bas2.getNome());
									System.out.println("marca: " + bas2.getMarca());
									System.out.println("preco: " + bas2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(bas2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto bas3 = new Produto();
									bas3.setNome("Base tom 3");
									bas3.setMarca("Ruby Rose");
									bas3.setPreco(16.99);

									System.out.println("nome: " + bas3.getNome());
									System.out.println("marca: " + bas3.getMarca());
									System.out.println("preco: " + bas3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(bas3);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								}
								break;
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
								switch (op) {
								case 1: {
									Produto corr1 = new Produto();
									corr1.setNome("Corretivo tom 1");
									corr1.setMarca("Avon");
									corr1.setPreco(15.00);

									System.out.println("nome: " + corr1.getNome());
									System.out.println("marca: " + corr1.getMarca());
									System.out.println("preco: " + corr1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(corr1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto corr2 = new Produto();
									corr2.setNome("Corretivo tom 2");
									corr2.setMarca("Oboticario");
									corr2.setPreco(15.00);

									System.out.println("nome: " + corr2.getNome());
									System.out.println("marca: " + corr2.getMarca());
									System.out.println("preco: " + corr2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(corr2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto corr3 = new Produto();
									corr3.setNome("Corretivo tom 3");
									corr3.setMarca("Ruby Rose");
									corr3.setPreco(15.00);

									System.out.println("nome: " + corr3.getNome());
									System.out.println("marca: " + corr3.getMarca());
									System.out.println("preco: " + corr3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(corr3);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								}
								break;
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
								switch (op) {
								case 1: {
									Produto del1 = new Produto();
									del1.setNome("Delineador 1");
									del1.setMarca("Avon");
									del1.setPreco(19.90);

									System.out.println("nome: " + del1.getNome());
									System.out.println("marca: " + del1.getMarca());
									System.out.println("preco: " + del1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(del1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto del2 = new Produto();
									del2.setNome("Delineador 2");
									del2.setMarca("Oboticario");
									del2.setPreco(25.00);

									System.out.println("nome: " + del2.getNome());
									System.out.println("marca: " + del2.getMarca());
									System.out.println("preco: " + del2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(del2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
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
								switch (op) {
								case 1: {
									Produto sab1 = new Produto();
									sab1.setNome("Sabonete Suave");
									sab1.setMarca("Dove");
									sab1.setPreco(4.90);

									System.out.println("nome: " + sab1.getNome());
									System.out.println("marca: " + sab1.getMarca());
									System.out.println("preco: " + sab1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(sab1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto sab2 = new Produto();
									sab2.setNome("Sabonete D'Leite ");
									sab2.setMarca("Natura");
									sab2.setPreco(6.98);

									System.out.println("nome: " + sab2.getNome());
									System.out.println("marca: " + sab2.getMarca());
									System.out.println("preco: " + sab2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(sab2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto sab3 = new Produto();
									sab3.setNome("Kit sabonete floral");
									sab3.setMarca("Oboticario");
									sab3.setPreco(19.75);

									System.out.println("nome: " + sab3.getNome());
									System.out.println("marca: " + sab3.getMarca());
									System.out.println("preco: " + sab3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(sab3);
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
									System.out.println("- HIDRATANTE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- HIDRATANTE 1 R$23,98");
									System.out.println("2- HIDRATANTE 2 R$25,00");
									System.out.println("2- HIDRATANTE 3 R$36,99");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto hid1 = new Produto();
									hid1.setNome("Hidratante 1");
									hid1.setMarca("Oboticario");
									hid1.setPreco(23.98);

									System.out.println("nome: " + hid1.getNome());
									System.out.println("marca: " + hid1.getMarca());
									System.out.println("preco: " + hid1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(hid1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto hid2 = new Produto();
									hid2.setNome("Hidratante 2");
									hid2.setMarca("Natura");
									hid2.setPreco(25.00);

									System.out.println("nome: " + hid2.getNome());
									System.out.println("marca: " + hid2.getMarca());
									System.out.println("preco: " + hid2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(hid2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto hid3 = new Produto();
									hid3.setNome("Hidratante 3");
									hid3.setMarca("Nivea");
									hid3.setPreco(36.99);

									System.out.println("nome: " + hid3.getNome());
									System.out.println("marca: " + hid3.getMarca());
									System.out.println("preco: " + hid3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(hid3);
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
									System.out.println("- CERA DE DEPILAÇÃO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CERA 1 R$9,90");
									System.out.println("2- CERA 2 R$9,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto cera1 = new Produto();
									cera1.setNome("Cera 1");
									cera1.setMarca("Depi Roll");
									cera1.setPreco(9.90);

									System.out.println("nome: " + cera1.getNome());
									System.out.println("marca: " + cera1.getMarca());
									System.out.println("preco: " + cera1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(cera1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto cera2 = new Produto();
									cera2.setNome("Cera 2");
									cera2.setMarca("Veet");
									cera2.setPreco(9.90);

									System.out.println("nome: " + cera2.getNome());
									System.out.println("marca: " + cera2.getMarca());
									System.out.println("preco: " + cera2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(cera2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								}
								break;
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
								switch (op) {
								case 1: {
									Produto mas1 = new Produto();
									mas1.setNome("Máscara 1");
									mas1.setMarca("Ruby Rose");
									mas1.setPreco(10.00);

									System.out.println("nome: " + mas1.getNome());
									System.out.println("marca: " + mas1.getMarca());
									System.out.println("preco: " + mas1.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(mas1);
										System.out.println("");

									} else {
										break;
									}
									break;
								}
								case 2: {
									Produto mas2 = new Produto();
									mas2.setNome("Máscara 2");
									mas2.setMarca("Sephora");
									mas2.setPreco(10.00);

									System.out.println("nome: " + mas2.getNome());
									System.out.println("marca: " + mas2.getMarca());
									System.out.println("preco: " + mas2.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(mas2);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
								case 3: {
									Produto mas3 = new Produto();
									mas3.setNome("Máscara 3");
									mas3.setMarca("Neutrogena");
									mas3.setPreco(10.00);

									System.out.println("nome: " + mas3.getNome());
									System.out.println("marca: " + mas3.getMarca());
									System.out.println("preco: " + mas3.getPreco());

									System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
									System.out.println("Insira sua opção: ");
									String opx = leitura.nextLine();

									if (opx.equals("s")) {
										System.out.println("Produto adicionado ao carrinho");
										carrinhoProdutos.add(mas3);
										System.out.println("");
									} else {
										break;
									}
									break;
								}
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
