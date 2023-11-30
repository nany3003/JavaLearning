package org.abdo.observer;

public class StockListView implements Observer {
    private final Stock observable;

    public StockListView(Stock observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        int price = observable.getPrice();
        System.out.println("Price changed caught by StockListView to : " + price);
    }
}
