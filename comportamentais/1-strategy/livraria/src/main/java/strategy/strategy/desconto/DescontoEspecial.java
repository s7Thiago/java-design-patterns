package strategy.strategy.desconto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DescontoEspecial implements Desconto{

//    Valor entre 0 e 1
    private double desconto;

    @Override
    public double calculaNovoValor(double valorProduto) {
        return valorProduto;
    }
}
