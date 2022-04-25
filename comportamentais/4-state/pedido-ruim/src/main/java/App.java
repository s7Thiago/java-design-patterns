public class AppPedido {
    public static void main(String[] args) {
        // Criando um pedido
        Pedido p = new Pedido();

        // Tentando mudar o status do pedido para enviado imediatamente
        p.despacharPedido();

        // Informando que o status do pedido é PAGO
        p.sucessoAoPagar();
        p.sucessoAoPagar();

        // Cancelando o pedido
        p.cancelarPedido();

        // Tentando enviar o pedido com status CANCELADO
        p.despacharPedido();
    }
}
