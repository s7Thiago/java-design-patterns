import observer.Newsletter;

public class App {
    public static void main(String[] args) {

        // Instanciando a Newsletter
        Newsletter newsletter = new Newsletter();

        Funcionario f1 = new Funcionario("João funcionario", "jj@email.com", newsletter );
        Funcionario f2 = new Funcionario("maria funcionario", "maria@email.com", newsletter );

        Cliente c1 = new Cliente("Pedro cliente", "pedro@email.com", newsletter);

        Parceiro pq = new Parceiro("Marcos ", "marcos@email .com", newsletter);
        Fornecedor fo1 = new Fornecedor("Paulo", "paulo@email.com", newsletter);

        newsletter.addMensagem("Primeira mensagem");

    }
}
