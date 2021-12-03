package templatemethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// classe abstrata que define o comportamento de um pagamento, e também delega para as subclasses a implementação de
// alguns métodos que podem ser passíveis de alguma regra de negócio específica;
@AllArgsConstructor
public abstract class Pagamento {
    protected double valor;
    protected Gateway gateway;

    // Calcula o desconto
    public abstract double calcularDesconto();

//    Método com implementação padrão (Hook), não é necessário implementar em todas as subclasses, desse modo, se alguma
//    subclasse não implementar esse método, o comportamento padrão será mantido (taxa 0);
    public double calcularTaxa() {
        return 0;
    }

//    Template method que usa os métodos com implementação delegada para as subclasses para calcular o valor total da
//    cobrança;
    public boolean realizaCobranca() {
//        Calcula o valor total (valor do pagamento + taxa - desconto)
        double valorTotal = this.valor + this.calcularTaxa() - this.calcularDesconto();

        // Imprimindo os valores separados para visualização no console
        System.out.println("Taxa: " + this.calcularTaxa());
        System.out.println("Desconto: " + this.calcularDesconto());

//         Delega a cobrança para o gateway
        return this.gateway.cobrar(valorTotal);
    }

}
