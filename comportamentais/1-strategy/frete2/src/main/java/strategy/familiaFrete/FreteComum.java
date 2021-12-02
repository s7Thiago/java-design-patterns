package strategy.familiaFrete;

//O frete comum representa 5% do valor do pedido.
public class FreteComum implements  Frete {
    @Override
    public Double calcula(double valor) {
        return valor  * 0.05;
    }
}
