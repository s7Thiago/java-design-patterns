import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PagamentoDebito {
    private double valor;
    private Gateway gateway;

    // Calcula a taxa do gateway
    public double calcularTaxa() {

//        Retorna uma taxa de 4 reais
        return 4;
    }

//    Calcula o desconto
    public double calcularDesconto() {
//        Retorna o valor do pagamento com desconto de 5%
        return this.valor * 0.05;
    }

//    Realiza a cobrança
    public boolean realizaCobranca() {
//        Calcula o valor total (valor do pagamento + taxa - desconto)
        double valorTotal = this.valor + this.calcularTaxa() - this.calcularDesconto();

//        Delega a cobrança para o gateway
        return this.gateway.cobrar(valorTotal);
    }
}
