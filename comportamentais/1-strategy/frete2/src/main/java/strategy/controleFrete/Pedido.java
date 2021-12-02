package strategy.controleFrete;

import strategy.familiaFrete.Frete;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pedido {
    private Double valor;

    @Getter(AccessLevel.NONE)
    private Frete tipoFrete;

    public double calcularFrete() {
        return tipoFrete.calcula(this.valor);
    }

}
