package controle;

import java.util.ArrayList;

import modelo.Produto;

public class CarrinhoDAO implements ICarrinhoDAO {
	
	private static ArrayList<Produto> carrinhoProdutos = new ArrayList<>();

	@Override
	public boolean inserir(Produto p) {
		if (p != null) {
			carrinhoProdutos.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Produto p) {
		for (int i = 0; i < carrinhoProdutos.size(); i++) {
			Produto produto = carrinhoProdutos.get(i);

			if (produto.getCodBarra() == p.getCodBarra()) {
				carrinhoProdutos.set(i, p);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Produto p) {
		return carrinhoProdutos.remove(p);
	}

	@Override
	public ArrayList<Produto> listarProdutos() {
		return carrinhoProdutos;
	}
	
	
	
}
