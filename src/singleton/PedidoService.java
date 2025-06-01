package singleton;

import model.Pedido;

public class PedidoService {
    private static PedidoService instancia;
    private Pedido pedido;

    private PedidoService() {
        pedido = new Pedido();
    }

    public static PedidoService getInstancia() {
        if (instancia == null) {
            instancia = new PedidoService();
        }
        return instancia;
    }

    public Pedido getPedidoAtual() {
        return pedido;
    }

    public void reiniciarPedido() {
        pedido = new Pedido();
    }
}
