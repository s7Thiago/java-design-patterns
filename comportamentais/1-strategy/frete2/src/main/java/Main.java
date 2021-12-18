import strategy.controleFrete.Pedido;
import strategy.controleFrete.PedidoEletronicos;
import strategy.familiaFrete.Frete;
import strategy.familiaFrete.FreteComum;
import strategy.familiaFrete.FreteExpresso;

public class Main {

    public static void main(String[] args)  {
        Pedido pe = new PedidoEletronicos();
        pe.setValor(100.0);

        Frete freteComum = new FreteComum();
        Frete freteExpresso = new FreteExpresso();

        pe.setTipoFrete(freteComum);
        System.out.println("Frete Comum: R$ " + pe.calcularFrete());
    }
}
