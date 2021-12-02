import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoEletronicos extends Pedido {
    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = "Eletrônicos";
    }

    @Override
    public Double calculaFreteComum() {
        return this.getValor() * 0.05;
    }

    @Override
    public Double calculaFreteExpresso() {
        return this.getValor() * 0.1;
    }
}
