public class Main {

    public static void main(String[] args)  {
        Pedido pe = new PedidoEletronicos();
        pe.setValor(100.0);

        System.out.println("Frete Comum: R$ " + pe.calculaFreteComum());
        try {
            System.out.println("Frete Expresso: R$ " + pe.calculaFreteExpresso());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Pedido pm = new PedidoMoveis();
        pm.setValor(100.0);

        System.out.println("\nFrete Comum: R$ " + pm.calculaFreteComum());
        try {
            System.out.println("Frete Expresso: R$ " + pm.calculaFreteExpresso());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
