import java.util.Scanner;

import service.Frete;
import service.TipoFrete;
import service.frete.Normal;
import service.frete.Sedex;

public class App {
    public static void main(String... args) throws Exception {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Informe a distância: ");
            int distancia = in.nextInt();

            System.out.println("Qual é o tipo de frete? (1) Normal (2) Sedex: ");
            int opcaoFrete = in.nextInt();
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

            Frete frete = null;

            if (tipoFrete.equals(TipoFrete.NORMAL)) {
                frete = new Normal();
            } else if (tipoFrete.equals(TipoFrete.SEDEX)) {
                frete = new Sedex();
            }

            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$ %.2f", preco);

            in.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
