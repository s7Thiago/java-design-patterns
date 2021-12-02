package strategy.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Produto {
    private Double preco;
    private Integer quantidade;
    private String nome;

    private TipoProduto tipo;
}
