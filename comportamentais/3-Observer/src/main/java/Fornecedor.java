import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import observer.Observer;
import observer.Subject;

@Getter
@Setter
public class Fornecedor implements Observer {
    private String nome;
    private String email;
    private Subject subject;

    // Para instanciar um cliente, todos os atributos serã exigidos
    public Fornecedor(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;

        // Registrando o Fornecedor no subject
        this.subject.registerObserver(this);
    }


    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
