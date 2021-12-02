import strategy.context.Compra;
import strategy.context.Produto;
import strategy.context.TipoProduto;
import strategy.strategy.TipoPagamento;

public class App {
    public static void main(String[] args) {

        Compra c1 = new Compra(TipoPagamento.A_VISTA);
        c1.addProduto(new Produto(100.0, 1, "Livro Capa Dura", TipoProduto.LIVRO_REVISTA_FISICO));
        c1.addProduto(new Produto(100.0, 1, "Livro Capa Dura", TipoProduto.LIVRO_REVISTA_FISICO));
        c1.addProduto(new Produto(100.0, 1, "Livro Capa Dura", TipoProduto.LIVRO_REVISTA_FISICO));

        System.out.println("{ p1: " + c1.getValor() + " | " + c1.calcularValorComDesconto() +  " }");

    }
}
