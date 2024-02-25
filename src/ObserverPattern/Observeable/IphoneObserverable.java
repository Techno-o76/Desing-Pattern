package ObserverPattern.Observeable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserverable implements StockObserveable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0 ){
            notifySubscribers();
        }
        stockCount = stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
