package com.headfirst.desingpatterns.Observer;

public interface Subject{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(); // Вызыается для оповещения наблюдателей об изменении состояния
}
