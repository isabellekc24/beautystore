package modelo;

import java.util.ArrayList;

public interface IProdutoDAO {
	
	public Produto buscaProdutoPorCodBarras(long codBarra);

	public boolean inserir(Produto p);

	public boolean alterar(Produto p);

	public boolean excluir(Produto p);

	public ArrayList<Produto> listarProdutos();
	
}
