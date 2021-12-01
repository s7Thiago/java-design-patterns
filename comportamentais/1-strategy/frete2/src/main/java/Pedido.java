import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pedido {
    private Double valor;

    public double calculaFreteComum() {
        return this.valor * 0.05;
    }

    public double calculaFreteExpresso() {
        return this.valor * 0.1;

    }
}
