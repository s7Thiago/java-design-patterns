public class App {
    public static void main(String[] args) {
        double valor = 1000.00;
        Gateway gateway = new Gateway();

        System.out.println("Crédito");
        PagamentoCredito p1 = new PagamentoCredito(valor, gateway);
        p1.realizaCobranca();

        System.out.println("Débito");
        PagamentoDebito p2 = new PagamentoDebito(valor, gateway);
        p2.realizaCobranca();

        System.out.println("Dinheiro");
        PagamentoDinheiro p3 = new PagamentoDinheiro(valor, gateway);
        p3.realizaCobranca();
    }
}
