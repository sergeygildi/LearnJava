package com.headfirst.desingpatterns.SecondExample;

public interface Subject{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(); // Вызыается для оповещения наблюдателей об изменении состояния
}
