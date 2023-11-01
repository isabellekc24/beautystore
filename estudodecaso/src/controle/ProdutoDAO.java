package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {

	private static ArrayList<Produto> tabelaProdutos;
	private static ProdutoDAO instancia;

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			tabelaProdutos = new ArrayList<>();

			popularTabelaProdutos();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Produto p) {
		return tabelaProdutos.add(p);
	}

	@Override
	public boolean alterar(Produto p, long codBarra) {
		for (int i = 0; i < tabelaProdutos.size(); i++) {
			Produto produto = tabelaProdutos.get(i);

			if (produto.getCodBarra() == p.getCodBarra()) {
				return tabelaProdutos.set(i, p) != null;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Produto p) {
		return tabelaProdutos.remove(p);
	}

	@Override
	public ArrayList<Produto> listarProdutos() {
		return tabelaProdutos;
	}

	public static void popularTabelaProdutos() {

		// produtos maquiagem

		Produto bat1 = new Produto();
		bat1.setNome("Batom Rosa");
		bat1.setMarca("Avon");
		bat1.setPreco(24.98);
		bat1.setCodBarra(1);
		tabelaProdutos.add(bat1);

		Produto bat2 = new Produto();
		bat2.setNome("Batom Vermelho");
		bat2.setMarca("Oboticario");
		bat2.setPreco(24.98);
		bat2.setCodBarra(2);
		tabelaProdutos.add(bat2);

		Produto bat3 = new Produto();
		bat3.setNome("Batom Roxo");
		bat3.setMarca("Mary Kay");
		bat3.setPreco(24.98);
		bat3.setCodBarra(3);
		tabelaProdutos.add(bat3);

		Produto rim1 = new Produto();
		rim1.setNome("Rímel 1");
		rim1.setMarca("Avon");
		rim1.setPreco(23.99);
		rim1.setCodBarra(4);
		tabelaProdutos.add(rim1);

		Produto rim2 = new Produto();
		rim2.setNome("Rímel 2");
		rim2.setMarca("Oboticario");
		rim2.setPreco(20.90);
		rim2.setCodBarra(5);
		tabelaProdutos.add(rim2);

		Produto bas1 = new Produto();
		bas1.setNome("Base tom 1");
		bas1.setMarca("Avon");
		bas1.setPreco(16.99);
		bas1.setCodBarra(6);
		tabelaProdutos.add(bas1);

		Produto bas2 = new Produto();
		bas2.setNome("Base tom 2");
		bas2.setMarca("Oboticario");
		bas2.setPreco(16.99);
		bas2.setCodBarra(7);
		tabelaProdutos.add(bas2);

		Produto bas3 = new Produto();
		bas3.setNome("Base tom 3");
		bas3.setMarca("Ruby Rose");
		bas3.setPreco(16.99);
		bas3.setCodBarra(8);
		tabelaProdutos.add(bas3);

		Produto corr1 = new Produto();
		corr1.setNome("Corretivo tom 1");
		corr1.setMarca("Ruby Rose");
		corr1.setPreco(15.00);
		corr1.setCodBarra(9);
		tabelaProdutos.add(corr1);

		Produto corr2 = new Produto();
		corr2.setNome("Corretivo tom 2");
		corr2.setMarca("Oboticario");
		corr2.setPreco(15.00);
		corr2.setCodBarra(10);
		tabelaProdutos.add(corr2);

		Produto corr3 = new Produto();
		corr3.setNome("Corretivo tom 3");
		corr3.setMarca("Ruby Rose");
		corr3.setPreco(15.00);
		corr3.setCodBarra(11);
		tabelaProdutos.add(corr3);

		Produto del1 = new Produto();
		del1.setNome("Delineador 1");
		del1.setMarca("Avon");
		del1.setPreco(19.90);
		del1.setCodBarra(12);
		tabelaProdutos.add(del1);

		Produto del2 = new Produto();
		del2.setNome("Delineador 2");
		del2.setMarca("Oboticario");
		del2.setPreco(25.00);
		del2.setCodBarra(13);
		tabelaProdutos.add(del2);

		// produtos de pele

		Produto sab1 = new Produto();
		sab1.setNome("Sabonete Suave");
		sab1.setMarca("Dove");
		sab1.setPreco(4.90);
		sab1.setCodBarra(14);
		tabelaProdutos.add(sab1);

		Produto sab2 = new Produto();
		sab2.setNome("Sabonete D'Leite ");
		sab2.setMarca("Natura");
		sab2.setPreco(6.98);
		sab2.setCodBarra(15);
		tabelaProdutos.add(sab2);

		Produto sab3 = new Produto();
		sab3.setNome("Kit sabonete floral");
		sab3.setMarca("Oboticario");
		sab3.setPreco(19.75);
		sab3.setCodBarra(16);
		tabelaProdutos.add(sab3);

		Produto hid1 = new Produto();
		hid1.setNome("Hidratante 1");
		hid1.setMarca("Oboticario");
		hid1.setPreco(23.98);
		hid1.setCodBarra(17);
		tabelaProdutos.add(hid1);

		Produto hid2 = new Produto();
		hid2.setNome("Hidratante 2");
		hid2.setMarca("Natura");
		hid2.setPreco(25.00);
		hid2.setCodBarra(18);
		tabelaProdutos.add(hid2);

		Produto hid3 = new Produto();
		hid3.setNome("Hidratante 3");
		hid3.setMarca("Nivea");
		hid3.setPreco(36.99);
		hid3.setCodBarra(19);
		tabelaProdutos.add(hid3);

		Produto cera1 = new Produto();
		cera1.setNome("Cera 1");
		cera1.setMarca("Depi Roll");
		cera1.setPreco(9.90);
		cera1.setCodBarra(20);
		tabelaProdutos.add(cera1);

		Produto cera2 = new Produto();
		cera2.setNome("Cera 2");
		cera2.setMarca("Veet");
		cera2.setPreco(9.90);
		cera2.setCodBarra(21);
		tabelaProdutos.add(cera2);

		Produto oleo1 = new Produto();
		oleo1.setNome("Oleo 1");
		oleo1.setMarca("Natura");
		oleo1.setPreco(30.90);
		oleo1.setCodBarra(22);
		tabelaProdutos.add(oleo1);

		Produto oleo2 = new Produto();
		oleo2.setNome("Oleo 2");
		oleo2.setMarca("Oboticario");
		oleo2.setPreco(50.98);
		oleo2.setCodBarra(23);
		tabelaProdutos.add(oleo2);

		Produto esf1 = new Produto();
		esf1.setNome("Esfoliante 1");
		esf1.setMarca("Nivea");
		esf1.setPreco(24.98);
		esf1.setCodBarra(24);
		tabelaProdutos.add(esf1);

		Produto esf2 = new Produto();
		esf2.setNome("Esfoliante 2");
		esf2.setMarca("Sephora");
		esf2.setPreco(32.50);
		esf2.setCodBarra(25);
		tabelaProdutos.add(esf2);

		Produto esf3 = new Produto();
		esf3.setNome("Esfoliante 3");
		esf3.setMarca("Oboticario");
		esf3.setPreco(19.98);
		esf3.setCodBarra(26);
		tabelaProdutos.add(esf3);

		// produtos de cabelo

		Produto sh1 = new Produto();
		sh1.setNome("Shampoo Seda");
		sh1.setMarca("Dove");
		sh1.setPreco(11.99);
		sh1.setCodBarra(27);
		tabelaProdutos.add(sh1);

		Produto sh2 = new Produto();
		sh2.setNome("Shampoo Dove");
		sh2.setMarca("Dove");
		sh2.setPreco(21.90);
		sh2.setCodBarra(28);
		tabelaProdutos.add(sh2);

		Produto sh3 = new Produto();
		sh3.setNome("Shampoo Elseve");
		sh3.setMarca("Elseve");
		sh3.setPreco(29.90);
		sh3.setCodBarra(29);
		tabelaProdutos.add(sh3);

		Produto cond1 = new Produto();
		cond1.setNome("Condicionador Seda");
		cond1.setMarca("Seda");
		cond1.setPreco(11.90);
		cond1.setCodBarra(30);
		tabelaProdutos.add(cond1);

		Produto cond2 = new Produto();
		cond2.setNome("Condicionador Dove");
		cond2.setMarca("Dove");
		cond2.setPreco(14.90);
		cond2.setCodBarra(31);
		tabelaProdutos.add(cond2);

		Produto masc1 = new Produto();
		masc1.setNome("Mascara Dove");
		masc1.setMarca("Dove");
		masc1.setPreco(26.89);
		masc1.setCodBarra(32);
		tabelaProdutos.add(masc1);

		Produto masc2 = new Produto();
		masc2.setNome("Mascara Salon Line");
		masc2.setMarca("Salon Line");
		masc2.setPreco(21.90);
		masc2.setCodBarra(33);
		tabelaProdutos.add(masc2);

		Produto masc3 = new Produto();
		masc3.setNome("Mascara Wella");
		masc3.setMarca("Wella");
		masc3.setPreco(145.30);
		masc3.setCodBarra(34);
		tabelaProdutos.add(masc3);

		Produto tin1 = new Produto();
		tin1.setNome("Tintura Koleston preto");
		tin1.setMarca("Wella");
		tin1.setPreco(20.99);
		tin1.setCodBarra(35);
		tabelaProdutos.add(tin1);

		Produto tin2 = new Produto();
		tin2.setNome("Tintura Koleston Vermelho");
		tin2.setMarca("Wella");
		tin2.setPreco(22.99);
		tin2.setCodBarra(36);
		tabelaProdutos.add(tin2);

		Produto tin3 = new Produto();
		tin3.setNome("Tintuera Koleston Roxo");
		tin3.setMarca("Wella");
		tin3.setPreco(23.90);
		tin3.setCodBarra(37);
		tabelaProdutos.add(tin3);

		Produto crem1 = new Produto();
		crem1.setNome("Creme para pentear");
		crem1.setMarca("SalonLine");
		crem1.setPreco(25.00);
		crem1.setCodBarra(38);
		tabelaProdutos.add(crem1);

		Produto crem2 = new Produto();
		crem2.setNome("Creme para pentear Seda");
		crem2.setMarca("Seda");
		crem2.setPreco(25.00);
		crem2.setCodBarra(39);
		tabelaProdutos.add(crem2);
	}
}
