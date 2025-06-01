
import facade.PedidoFacade;
import strategy.*;




public class Main {
	public static void main(String[] args) {
        PedidoFacade sistema = new PedidoFacade();

        sistema.adicionarProduto("X-Burguer", 25.0);
        sistema.adicionarProduto("Refrigerante", 8.0);

        Pagamento formaPagamento = new PagamentoPix();
        sistema.finalizarPedido(formaPagamento);
    }
}
