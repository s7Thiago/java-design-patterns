import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PagamentoCredito {
    private double valor;
    private Gateway gateway;

    // Calcula a taxa do gateway
    public double calcularTaxa() {
        return this.valor * 0.05;
    }

//    Calcula o desconto
    public double calcularDesconto() {

//        Se o valor for maior que 300,00
        if (this.valor > 300.00) {
            return this.valor * 0.02;
        }

//        Pagamentos menores do que 300,00 não recebem desconto
        return 0.00;
    }

//    Realiza a cobrança
    public boolean realizaCobranca() {
//        Calcula o valor total (valor do pagamento + taxa - desconto)
        double valorTotal = this.valor + this.calcularTaxa() - this.calcularDesconto();

//        Delega a cobrança para o gateway
        return this.gateway.cobrar(valorTotal);
    }
}
