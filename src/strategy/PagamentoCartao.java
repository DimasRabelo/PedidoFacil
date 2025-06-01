package strategy;

public class PagamentoCartao implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via Cartão de Crédito: R$" + valor);
    }
}