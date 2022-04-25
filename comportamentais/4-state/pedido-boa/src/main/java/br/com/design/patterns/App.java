package br.com.design.patterns;

import br.com.design.patterns.State.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando um pedido
        Pedido p = new Pedido();

        // // Tentando mudar o status do pedido para enviado imediatamente
        // p.despacharPedido();

        // Informando que o status do pedido é PAGO
        p.realizarPagamento();
        // p.realizarPagamento();

        // Cancelando o pedido
        // p.cancelarPedido();
        // p.cancelarPedido();
        // p.realizarPagamento();

        // Tentando enviar o pedido com status CANCELADO
        p.despacharPedido();
    }
}
