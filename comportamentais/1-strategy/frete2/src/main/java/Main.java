public class Main {

    public static void main(String[] args) {
        Pedido pe = new PedidoEletronicos();
        pe.setValor(100.0);

        System.out.println("Frete Comum: R$ " + pe.calculaFreteComum());
        System.out.println("Frete Expresso: R$ " + pe.calculaFreteExpresso());

        Pedido pm = new PedidoEletronicos();
        pm.setValor(100.0);

        System.out.println("\nFrete Comum: R$ " + pm.calculaFreteComum());
        System.out.println("Frete Expresso: R$ " + pm.calculaFreteExpresso());
    }
}
