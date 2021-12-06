package observer;

public interface Subject {

//    Registra o observer passado no parametro como um alvo de notificação quando o estado de uma realização desta
//    interface for alterado.
    void registerObserver(Observer o);

//    Descadastra um observer da lista de interessados neste observer.Subject.
    void removeObserver(Observer o);
    void notifyObserver(Observer o);
}
