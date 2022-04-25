public class PedidoMoveis extends Pedido {
    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = "Móveis";
    }

    @Override
    public double calculaFreteComum() {
        return 0;
    }

    @Override
    public double calculaFreteExpresso() throws Exception {
        throw new Exception("Pedido de móveis não pode ser entregue por express");

    }
}
