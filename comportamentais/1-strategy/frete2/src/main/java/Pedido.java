import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pedido {
    private Double valor;

    public abstract Double calculaFreteComum();

    public abstract Double calculaFreteExpresso() throws Exception;
}
