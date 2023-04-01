package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.StockObserver;

public interface StockObservable {
    public void add(StockObserver so);
    public void remove(StockObserver so);
    public int getData();
    public void setData(int ndata);
    public void notifyObervers();
}
