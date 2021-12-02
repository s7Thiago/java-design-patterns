package strategy.context;

import lombok.*;
import strategy.strategy.TipoPagamento;
import strategy.strategy.desconto.Desconto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Compra {

    @Setter(AccessLevel.NONE)
    private List<Produto> produtos;

    @Getter(AccessLevel.NONE)
    @NonNull
    private TipoPagamento tipoPagamento;

    private Double valor;

    public Compra(TipoPagamento t) {
        this.tipoPagamento = t;

//        Inicializando o valor da compra e a lista de produtos
        produtos = new ArrayList<>(0);
        valor = produtos.stream().mapToDouble(p -> p.getPreco() * p.getQuantidade()).sum();
        System.out.println("Valor da compra: " + valor);
    }

    public double calcularValorComDesconto() {
        double valorTotal = 0.0;

        for(Produto p : produtos) {
            Desconto d = tipoPagamento.getDesconto(p.getTipo());
            valorTotal += d.calculaNovoValor(p.getPreco() * p.getQuantidade());
        }

        return valorTotal;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public void removeProduto(int index) {
        produtos.remove(index);
    }

}
