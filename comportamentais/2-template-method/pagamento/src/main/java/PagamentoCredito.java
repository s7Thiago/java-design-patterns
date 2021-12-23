import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import templatemethod.Gateway;
import templatemethod.Pagamento;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(double valor, Gateway gateway) {
        super(valor, gateway);
    }

    // Calcula a taxa do gateway
    @Override
    public double calcularTaxa() {
        return this.valor * 0.05;
    }

//    Calcula o desconto
    @Override
    public double calcularDesconto() {

//        Se o valor for maior que 300,00
        if (this.valor > 300.00) {
            return this.valor * 0.02;
        }

//        Pagamentos menores do que 300,00 não recebem desconto
        return 0.00;
    }

}
