package strategy;

public class PagamentoPix implements Pagamento {
	 public void pagar(double valor) {
	        System.out.println("Pagamento via PIX: R$" + valor);
	    }
}
