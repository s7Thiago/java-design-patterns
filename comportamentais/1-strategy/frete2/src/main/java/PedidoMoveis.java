public class PedidoMoveis extends Pedido {
    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = "Móveis";
    }

    @Override
    public Double calculaFreteComum() {
        return this.getValor() * 0.05;
    }

    @Override
    public Double calculaFreteExpresso() throws Exception {
        throw new Exception("O setor " + this.nomeSetor + " não pode ser entregue por expresso");

    }
}
