package strategy.strategy.desconto;

public class DescontoNormal implements Desconto
{
    @Override
    public double calculaNovoValor(double valorProduto) {
        return valorProduto;
    }
}
