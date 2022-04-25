import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pedido {
    private Double valor;

    public abstract double calculaFreteComum();

    public abstract double calculaFreteExpresso() throws Exception;
}
