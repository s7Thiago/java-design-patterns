public class Pedido {
    public final int AGUARDANDO_PAGAMENTO = 1;
    public final int PAGO = 2;
    public final int CANCELADO = 3;
    public final int ENVIADO = 4;

    private int estadoAtual;

    public Pedido() {
        // Setando estado padrão quando um objeto é criado
        this.estadoAtual = AGUARDANDO_PAGAMENTO;
    }

    public void sucessoAoPagar() {
        // Esta transição só pode ocorrer quando o status anterior for aguardando pagamento
        if (this.estadoAtual == AGUARDANDO_PAGAMENTO) {
            this.estadoAtual = PAGO;
        } else {
            System.out.println("\nErro: O pedido não está aguardando pagamento!");
        }
    }

    public void cancelarPedido() {
        // Esta transição pode ser feita sempre quando o status anterior for AGUARDANDO_PAGAMENTO ou PAGO
        if (this.estadoAtual == AGUARDANDO_PAGAMENTO || this.estadoAtual == PAGO) {
            this.estadoAtual = CANCELADO;
        } else {
            System.out.println("\nErro: O pedido não pode ser cancelado!");
        }
    }

    public void despacharPedido() {
        // O pedido só pode ser sinalizado como Despachado quando o status anterior for PAGO
        if (this.estadoAtual == PAGO) {
            this.estadoAtual = ENVIADO;
        } else {
            System.out.println("\nErro: O pedido não pode ser enviado!");
        }
    }

}
