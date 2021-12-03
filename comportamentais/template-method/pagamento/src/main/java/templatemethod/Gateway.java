package templatemethod;

import java.util.List;
import java.util.Random;

public class Gateway {
//    Simulação de uma cobrança - retorna true ou false de forma randômica
    public static boolean cobrar(double valor) {

        System.out.println("Cobrando " + valor + "\n"); // Apenas para visualização do valor no final
        List<Boolean> booleans = List.of(true, false);

        return booleans.get(new Random().nextInt(booleans.size()));
    }
}
