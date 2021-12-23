import lombok.AllArgsConstructor;
import templatemethod.Gateway;
import templatemethod.Pagamento;

public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(double valor, Gateway gateway) {
        super(valor, gateway);
    }

    // Calcula a taxa do gateway
    @Override
    public double calcularTaxa() {
//        Retorna uma taxa de 4 reais
        return 4;
    }

//    Calcula o desconto
    @Override
    public double calcularDesconto() {
//        Retorna o valor do pagamento com desconto de 5%
        return this.valor * 0.05;
    }
}
