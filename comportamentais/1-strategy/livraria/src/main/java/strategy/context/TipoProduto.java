package strategy.context;

import strategy.strategy.desconto.*;

public enum TipoProduto {
    LIVRO_REVISTA_FISICO {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoA();
        }
    },
    LIVRO_REVISTA_DIGITAL {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoB();
        }
    },
    JOGO_TABULEIRO {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoA();
        }
    },
    VIDEO_GAME {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoNormal();
        }
    }, Outros {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoNormal();
        }
    }, ESPECIAL {
        @Override
        public Desconto getDescontoPorTipo() {
            return new DescontoEspecial();
        }
    };

    public abstract Desconto getDescontoPorTipo();
}
