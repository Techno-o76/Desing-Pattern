package Patterns.ObserverPattern.Observeable;

import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObserveable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();

    // set the property of the obserable for the observer
    public void setStockCount(int newStockAdded);

    // get the value of the stock count.
    public int getStockCount();
}
