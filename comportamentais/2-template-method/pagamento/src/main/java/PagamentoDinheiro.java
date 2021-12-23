import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import templatemethod.Gateway;
import templatemethod.Pagamento;

public class PagamentoDinheiro extends Pagamento {


    public PagamentoDinheiro(double valor, Gateway gateway) {
        super(valor, gateway);
    }

    //    Calcula o desconto
    public double calcularDesconto() {
//        Retorna o valor do pagamento com desconto de 10%
        return this.valor * 0.1;
    }

}
