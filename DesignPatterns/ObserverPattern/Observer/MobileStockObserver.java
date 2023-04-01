package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileStockObserver implements StockObserver {

    StockObservable myObservable;

    MobileStockObserver(StockObservable sobj) {
        this.myObservable = sobj;
    }

    @Override
    public void update() {
        int data = this.myObservable.getData();
        sendMessage(data);
    }

    private void sendMessage(int data) {
        System.out.println("The new data is " + data);
    }

}
