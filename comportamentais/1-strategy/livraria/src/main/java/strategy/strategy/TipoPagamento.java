package strategy.strategy;

import strategy.context.TipoProduto;
import strategy.strategy.desconto.Desconto;
import strategy.strategy.desconto.DescontoNormal;

public enum TipoPagamento {
    A_VISTA {
        @Override
        public Desconto getDesconto(TipoProduto tipo) {
            return tipo.getDescontoPorTipo();
        }
    }, PARCELADO {
        @Override
        public Desconto getDesconto(TipoProduto tipo) {
            return new DescontoNormal();
        }
    };


    public abstract Desconto getDesconto(TipoProduto tipo);
}
