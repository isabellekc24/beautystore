package controle;

import java.util.ArrayList;

import modelo.Produto;

public interface ICarrinhoDAO {

	public boolean inserir(Produto p);

	public boolean alterar(Produto p);

	public boolean excluir(Produto p);

	public ArrayList<Produto> listarProdutos();

}
