package DesignPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.ObserverPattern.Observer.StockObserver;

public class IphoneStockObservable implements StockObservable{

    List<StockObserver>listOfObservers;
    int data;

    IphoneStockObservable(){
        this.listOfObservers= new ArrayList<>();
    }

    @Override
    public void add(StockObserver so) {
        this.listOfObservers.add(so);
    }

    @Override
    public void remove(StockObserver so) {
        this.listOfObservers.remove(so);
    }

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void setData(int ndata) {
        if( this.data != ndata){
            this.data = ndata;
            notifyObervers();
        }
      
    }

    @Override
    public void notifyObervers() {
        for(StockObserver so : listOfObservers){
            so.update();
        }
    }

}
