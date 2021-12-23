package observer;

public interface Observer {

    // Método que será utilizado pelo Observable (observer.Subject) para notificar um observer.Observer
    public void update(String mensagem);

    // Métodos que fazem parte do contexto da aplicação
    public String getNome();
    public String getEmail();

}
