import lombok.AllArgsConstructor;
import observer.Observer;
import observer.Subject;

@AllArgsConstructor // Para instanciar um cliente, todos os atributos serã exigidos
public class Cliente implements Observer {
    private String nome;
    private String email;
    private Subject subject;


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
