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

//        System.out.println("Frete Comum: R$ " + pe.calculaFreteComum());
//        try {
//            System.out.println("Frete Expresso: R$ " + pe.calculaFreteExpresso());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        controleFrete.Pedido pm = new controleFrete.PedidoMoveis();
//        pm.setValor(100.0);
//
//        System.out.println("\nFrete Comum: R$ " + pm.calculaFreteComum());
//        try {
//            System.out.println("Frete Expresso: R$ " + pm.calculaFreteExpresso());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
