package strategy.controleFrete;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoMoveis extends Pedido {
    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = "Móveis";
    }

}
