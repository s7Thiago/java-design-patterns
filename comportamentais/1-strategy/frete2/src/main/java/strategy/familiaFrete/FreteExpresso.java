package strategy.familiaFrete;

//O frete comum representa 10% do valor do pedido.
public class FreteExpresso implements Frete{
    @Override
    public Double calcula(double valor) {
        return valor * 0.1;
    }
}
