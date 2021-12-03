import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PagamentoDinheiro {
    private double valor;
    private Gateway gateway;

    // Calcula a taxa do gateway
    public double calcularTaxa() {
//        Pagamento em dinheiro não possui taxa
        return 0;
    }

//    Calcula o desconto
    public double calcularDesconto() {
//        Retorna o valor do pagamento com desconto de 10%
        return this.valor * 0.1;
    }

//    Realiza a cobrança
    public boolean realizaCobranca() {
//        Calcula o valor total (valor do pagamento + taxa - desconto)
        double valorTotal = this.valor + this.calcularTaxa() - this.calcularDesconto();

//        Delega a cobrança para o gateway
        return this.gateway.cobrar(valorTotal);
    }
}
