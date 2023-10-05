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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bas1);
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
									Produto bas2 = new Produto();
									bas2.setNome("Base tom 2");
									bas2.setMarca("Oboticario");
									bas2.setPreco(16.99);

									System.out.println("nome: " + bas2.getNome());
									System.out.println("marca: " + bas2.getMarca());
									System.out.println("preco: " + bas2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bas2);
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

								case 3: {
									Produto bas3 = new Produto();
									bas3.setNome("Base tom 3");
									bas3.setMarca("Ruby Rose");
									bas3.setPreco(16.99);

									System.out.println("nome: " + bas3.getNome());
									System.out.println("marca: " + bas3.getMarca());
									System.out.println("preco: " + bas3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(bas3);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(corr1);
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
									Produto corr2 = new Produto();
									corr2.setNome("Corretivo tom 2");
									corr2.setMarca("Oboticario");
									corr2.setPreco(15.00);

									System.out.println("nome: " + corr2.getNome());
									System.out.println("marca: " + corr2.getMarca());
									System.out.println("preco: " + corr2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(corr2);
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
									Produto corr3 = new Produto();
									corr3.setNome("Corretivo tom 3");
									corr3.setMarca("Ruby Rose");
									corr3.setPreco(15.00);

									System.out.println("nome: " + corr3.getNome());
									System.out.println("marca: " + corr3.getMarca());
									System.out.println("preco: " + corr3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(corr3);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(del1);
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
									Produto del2 = new Produto();
									del2.setNome("Delineador 2");
									del2.setMarca("Oboticario");
									del2.setPreco(25.00);

									System.out.println("nome: " + del2.getNome());
									System.out.println("marca: " + del2.getMarca());
									System.out.println("preco: " + del2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(del2);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sab1);
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
									Produto sab2 = new Produto();
									sab2.setNome("Sabonete D'Leite ");
									sab2.setMarca("Natura");
									sab2.setPreco(6.98);

									System.out.println("nome: " + sab2.getNome());
									System.out.println("marca: " + sab2.getMarca());
									System.out.println("preco: " + sab2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sab2);
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
									Produto sab3 = new Produto();
									sab3.setNome("Kit sabonete floral");
									sab3.setMarca("Oboticario");
									sab3.setPreco(19.75);

									System.out.println("nome: " + sab3.getNome());
									System.out.println("marca: " + sab3.getMarca());
									System.out.println("preco: " + sab3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sab3);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(hid1);
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
									Produto hid2 = new Produto();
									hid2.setNome("Hidratante 2");
									hid2.setMarca("Natura");
									hid2.setPreco(25.00);

									System.out.println("nome: " + hid2.getNome());
									System.out.println("marca: " + hid2.getMarca());
									System.out.println("preco: " + hid2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(hid2);
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
									Produto hid3 = new Produto();
									hid3.setNome("Hidratante 3");
									hid3.setMarca("Nivea");
									hid3.setPreco(36.99);

									System.out.println("nome: " + hid3.getNome());
									System.out.println("marca: " + hid3.getMarca());
									System.out.println("preco: " + hid3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(hid3);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(cera1);
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
									Produto cera2 = new Produto();
									cera2.setNome("Cera 2");
									cera2.setMarca("Veet");
									cera2.setPreco(9.90);

									System.out.println("nome: " + cera2.getNome());
									System.out.println("marca: " + cera2.getMarca());
									System.out.println("preco: " + cera2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(cera2);
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
									System.out.println("- OLEO DE BANHO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- OLEO 1 R$30,00");
									System.out.println("2- OLEO 2 R$50,98");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto oleo1 = new Produto();
									oleo1.setNome("Oleo 1");
									oleo1.setMarca("Natura");
									oleo1.setPreco(30.90);

									System.out.println("nome: " + oleo1.getNome());
									System.out.println("marca: " + oleo1.getMarca());
									System.out.println("preco: " + oleo1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(oleo1);
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
									Produto oleo2 = new Produto();
									oleo2.setNome("Oleo 2");
									oleo2.setMarca("Oboticario");
									oleo2.setPreco(50.98);

									System.out.println("nome: " + oleo2.getNome());
									System.out.println("marca: " + oleo2.getMarca());
									System.out.println("preco: " + oleo2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(oleo2);
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

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(mas1);
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
									Produto mas2 = new Produto();
									mas2.setNome("Máscara 2");
									mas2.setMarca("Sephora");
									mas2.setPreco(10.00);

									System.out.println("nome: " + mas2.getNome());
									System.out.println("marca: " + mas2.getMarca());
									System.out.println("preco: " + mas2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(mas2);
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
									Produto mas3 = new Produto();
									mas3.setNome("Máscara 3");
									mas3.setMarca("Neutrogena");
									mas3.setPreco(10.00);

									System.out.println("nome: " + mas3.getNome());
									System.out.println("marca: " + mas3.getMarca());
									System.out.println("preco: " + mas3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(mas3);
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
								switch (op) {
								case 1: {
									Produto luv1 = new Produto();
									luv1.setNome("Luva Rosa");
									luv1.setMarca("UniGloves");
									luv1.setPreco(18.90);

									System.out.println("nome: " + luv1.getNome());
									System.out.println("marca: " + luv1.getMarca());
									System.out.println("preco: " + luv1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(luv1);
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
									Produto luv2 = new Produto();
									luv2.setNome("Luvas Brancas");
									luv2.setMarca("Medix");
									luv2.setPreco(21.80);

									System.out.println("nome: " + luv2.getNome());
									System.out.println("marca: " + luv2.getMarca());
									System.out.println("preco: " + luv2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(luv2);
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
									Produto luv3 = new Produto();
									luv3.setNome("Luva roxa");
									luv3.setMarca("Supermax");
									luv3.setPreco(20.90);

									System.out.println("nome: " + luv3.getNome());
									System.out.println("marca: " + luv3.getMarca());
									System.out.println("preco: " + luv3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(luv3);
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
									System.out.println("- SECADOR DE CABELO -");
									System.out.println("0- VOLTAR");
									System.out.println("1- SECADOR PRETO R$238,90");
									System.out.println("2- SECADOR VERMELHO R$119,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto sec1 = new Produto();
									sec1.setNome("Secador de Cabelo Preto");
									sec1.setMarca("Taif");
									sec1.setPreco(238.90);

									System.out.println("nome: " + sec1.getNome());
									System.out.println("marca: " + sec1.getMarca());
									System.out.println("preco: " + sec1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sec1);
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
									Produto sec2 = new Produto();
									sec2.setNome("Secador de cabelo Vermelho");
									sec2.setMarca("Philco");
									sec2.setPreco(119.90);

									System.out.println("nome: " + sec2.getNome());
									System.out.println("marca: " + sec2.getMarca());
									System.out.println("preco: " + sec2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(sec2);
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
									System.out.println("- DESODORANTE -");
									System.out.println("0- VOLTAR");
									System.out.println("1- DESODORANTE DOVE R$21,90");
									System.out.println("2- DESODORANTE REXONA R$22,99");
									System.out.println("3- DESODORANTE NIVEA R$32,90");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto des1 = new Produto();
									des1.setNome("Desodorante Dove");
									des1.setMarca("Dove");
									des1.setPreco(21.90);

									System.out.println("nome: " + des1.getNome());
									System.out.println("marca: " + des1.getMarca());
									System.out.println("preco: " + des1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(des1);
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
									Produto des2 = new Produto();
									des2.setNome("Desodorante Rexona");
									des2.setMarca("Rexona");
									des2.setPreco(22.99);

									System.out.println("nome: " + des2.getNome());
									System.out.println("marca: " + des2.getMarca());
									System.out.println("preco: " + des2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(des2);
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
									Produto des3 = new Produto();
									des3.setNome("Desodorante Nivea");
									des3.setMarca("Nivea");
									des3.setPreco(32.90);

									System.out.println("nome: " + des3.getNome());
									System.out.println("marca: " + des3.getMarca());
									System.out.println("preco: " + des3.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(des3);
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
									System.out.println("- CHAPINHA -");
									System.out.println("0- VOLTAR");
									System.out.println("1- CHAPINHA PRETA R$449,00");
									System.out.println("2- CHAPINHA ROSA R$398,00");
									System.out.println("3- CHAPINHA AZUL R$170,70");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto des1 = new Produto();
									des1.setNome("Chapinha Preta");
									des1.setMarca("Lizze");
									des1.setPreco(449.00);

									System.out.println("nome: " + des1.getNome());
									System.out.println("marca: " + des1.getMarca());
									System.out.println("preco: " + des1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(des1);
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
									Produto chap1 = new Produto();
									chap1.setNome("Chapinha Rosa");
									chap1.setMarca("Salles");
									chap1.setPreco(398.00);

									System.out.println("nome: " + chap1.getNome());
									System.out.println("marca: " + chap1.getMarca());
									System.out.println("preco: " + chap1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(chap1);
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
									Produto chap2 = new Produto();
									chap2.setNome("Chapinha Azul");
									chap2.setMarca("Nano");
									chap2.setPreco(170.70);

									System.out.println("nome: " + chap2.getNome());
									System.out.println("marca: " + chap2.getMarca());
									System.out.println("preco: " + chap2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(chap2);
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
									System.out.println("- TOUCAS -");
									System.out.println("0- VOLTAR");
									System.out.println("1- TOUCA DE BANHO R$15,50");
									System.out.println("2- TOUCA DE CETIM R$25,00");

									System.out.println("Insira qual você quer: ");
									op = Integer.valueOf(leitura.nextLine());
									break;
								}
								switch (op) {
								case 1: {
									Produto touc1 = new Produto();
									touc1.setNome("Touca de banho");
									touc1.setMarca("Ricca");
									touc1.setPreco(15.50);

									System.out.println("nome: " + touc1.getNome());
									System.out.println("marca: " + touc1.getMarca());
									System.out.println("preco: " + touc1.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(touc1);
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
									Produto touc2 = new Produto();
									touc2.setNome("Touca de cetim");
									touc2.setMarca("Bemart");
									touc2.setPreco(25.00);

									System.out.println("nome: " + touc2.getNome());
									System.out.println("marca: " + touc2.getMarca());
									System.out.println("preco: " + touc2.getPreco());

									do {
										System.out.println("Voce quer adicionar esse item ao carrinho? (s/n)");
										System.out.println("Insira sua opção: ");
										String opx = leitura.nextLine();

										if (opx.equals("s")) {
											System.out.println("Produto adicionado ao carrinho");
											carrinhoProdutos.add(touc2);
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

				System.out.println("- EXIBIR PRODUTOS -  ");
				System.out.println("");
				for (Produto produto : carrinhoProdutos) {
					System.out.println("Nome: " + produto.getNome() + "   Marca: " + produto.getMarca() + "   Preco: "
							+ produto.getPreco());
				}

				do {
					System.out.println("Pressione 0 para voltar pra aba anterior: ");
					String opx = leitura.nextLine();

					if (opx.equals("0")) {
						break;
					} else {
						System.out.println("Opcao incorreta. Por favor, digite 0 para voltar: ");
					}
				} while (op != '0');
				break;
			} // aspa case2
			
			case 3: {
				System.out.println("ALTERAR PRODUTOS");
				System.out.println("Digite o codigo de barras do produto a ser alterado:");
				long codBarras = Long.valueOf(leitura.nextLine());
				
				for (Produto produto : carrinhoProdutos) {
					if(produto.getCodBarra() == codBarras) {
						System.out.println("Você ecolheu o produto: "+ produto.getNome());
						
						System.out.println("Digite o novo preco:");
						double novoPreco = Double.valueOf(leitura.nextLine());
						produto.setPreco(novoPreco);
					
					} else {
						System.out.println();
					}
				}
				
				break;
			}
			case 4:{
				System.out.println("EXCLUIR PRODUTOS");
				
				break;
			}
			case 5:{
				System.out.println("CADASTRAR NOVOS PRODUTOS");
				
				break;
			}
			case 6:{
				System.out.println("PROGRAMA FINALIZADO!");
				
				break;
			}
			}
		}
		leitura.close();

	}
}

/*
  // Leitura de dados (input) System.out.println("Nome:"); String nome = leitura.nextLine(); System.out.println("Cpf:"); String cpf = leitura.nextLine();
  Pessoa p = new Pessoa(); p.setNome(nome); p.setCpf(Long.valueOf(cpf));
  pessoas.add(p);
  } case 2: { System.out.println("Digite o cpf da pessoa que deseja alterar:");
  // finalizar codigo } 
  case 3: {
  System.out.println("Digite o cpf da pessoa que deseja excluir:"); //finalizar codigo 
  }
  case 4: { // Saida de dados (output)
  System.out.println("Listagem de pessoas cadastradas: "); 
  for (Pessoa pessoa :pessoas) { System.out.println("Cpf: " + pessoa.getCpf());
  System.out.println("Nome: " + pessoa.getNome()); } }  
  } 
  } 
 */
