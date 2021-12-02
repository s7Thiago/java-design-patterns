package strategy.controleFrete;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoEletronicos extends Pedido {
    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = "Eletrônicos";
    }
}
