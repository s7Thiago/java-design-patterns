package service;

import service.frete.Normal;
import service.frete.Sedex;

/**
 * Enum que representa uma fábrica de tipos Frete
 */
public enum TipoFrete {
    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    // Adicionando um método abstrata para ser implementado por cada enum
    public abstract Frete obterFrete();
}
