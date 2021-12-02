package strategy.strategy.desconto;

public class DescontoB implements Desconto{
    @Override
    public double calculaNovoValor(double valorProduto) {
        return valorProduto - (valorProduto * 0.15);
    }
}
