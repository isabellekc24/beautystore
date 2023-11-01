package modelo;

import java.util.ArrayList;

public interface IProdutoDAO {

	public boolean inserir(Produto p);

	public boolean alterar(Produto p, long codBarra);

	public boolean excluir(Produto p);

	public ArrayList<Produto> listarProdutos();
	
}
