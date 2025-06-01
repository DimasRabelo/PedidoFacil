package strategy;

public class PagamentoDinheiro implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento em Dinheiro: R$" + valor);
    }
}