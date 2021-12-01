public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setValor(100.0);

        System.out.println("Frete Comum: R$ " + pedido.calculaFreteComum());
        System.out.println("Frete Expresso: R$ " + pedido.calculaFreteExpresso());
    }
}
