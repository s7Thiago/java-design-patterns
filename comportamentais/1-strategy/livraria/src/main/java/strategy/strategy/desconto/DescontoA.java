package strategy.strategy.desconto;

public class DescontoA implements Desconto {
    @Override
    public double calculaNovoValor(double valorProduto) {
        return valorProduto - (valorProduto * 0.3);
    }
}
