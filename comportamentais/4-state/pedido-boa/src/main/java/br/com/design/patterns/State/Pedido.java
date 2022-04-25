package br.com.design.patterns.State;

import br.com.design.patterns.State.impl.AguardandoPagamentoState;
import br.com.design.patterns.State.impl.CanceladoState;
import br.com.design.patterns.State.impl.EnviadoState;
import br.com.design.patterns.State.impl.PagoState;
import lombok.Getter;
import lombok.Setter;

public class Pedido {

    // Agora será chamado o método correspondente a cada transição de cada estado

    @Getter
    private State aguardandoPagamento;

    @Getter
    private State pago;

    @Getter
    private State cancelado;

    @Getter
    private State enviado;

    @Setter
    private State estadoAtual;

    public Pedido() {
        // Estanciando todos os estados do pedido
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);

        // Setando estado padrão quando um objeto é criado
        this.estadoAtual = this.aguardandoPagamento;
    }

    public void realizarPagamento() throws Exception {

        // Esta transição só pode ocorrer quando o status anterior for aguardando
        // pagamento
        this.estadoAtual.sucessoAoPagar();
    }

    public void cancelarPedido() throws Exception {
        // Esta transição pode ser feita sempre quando o status anterior for
        // AGUARDANDO_PAGAMENTO ou PAGO
        this.estadoAtual.cancelarPedido();
    }

    public void despacharPedido() throws Exception {
        // O pedido só pode ser sinalizado como Despachado quando o status anterior for
        // PAGO
        this.estadoAtual.despacharPedido();
    }

}
