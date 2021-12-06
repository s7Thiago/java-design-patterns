public interface Observer {

//     Método que será utilizado pelo Observable (Subject) para notificar um Observer
    public void update();

//    Métodos que fazem parte do contexto da aplicação
    public void getNome();
    public void getEmail();

}
