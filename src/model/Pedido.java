package model;

import java.util.ArrayList;
import java.util.List;

		public class Pedido {
	    private List<Produto> produtos = new ArrayList<>();

	    public void adicionarProduto(Produto produto) {
	        produtos.add(produto);
	    }

	    public double calcularTotal() {
	        return produtos.stream().mapToDouble(Produto::getPreco).sum();
	    }

	    public List<Produto> getProdutos() {
	        return produtos;
	    }
}
