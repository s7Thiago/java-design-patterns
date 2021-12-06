package observer;

import java.util.List;

public class Newsletter implements Subject{
//    Lista de observers interessados nas alterações de estado neste objeto
    private List<Observer> observers;
    private List<String> mensagens;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(mensagens.get(mensagens.size() - 1));
        }
    }

//    Método que faz parte do contexto da aplicação (não do padrão Observer)
    public void addMensagem(String mensagem) {
        this.mensagens.add(mensagem);
        notifyObservers();
    }
}
