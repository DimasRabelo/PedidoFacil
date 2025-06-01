package facade;

import model.Produto;
import singleton.PedidoService;
import strategy.Pagamento;

public class PedidoFacade {

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        PedidoService.getInstancia().getPedidoAtual().adicionarProduto(produto);
        System.out.println("Produto adicionado: " + nome + " - R$" + preco);
    }

    public void finalizarPedido(Pagamento formaPagamento) {
        double total = PedidoService.getInstancia().getPedidoAtual().calcularTotal();
        System.out.println("Total do pedido: R$" + total);
        formaPagamento.pagar(total);
        PedidoService.getInstancia().reiniciarPedido();
    }
}