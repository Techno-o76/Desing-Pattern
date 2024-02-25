package ObserverPattern;

import ObserverPattern.Observeable.IphoneObserverable;
import ObserverPattern.Observeable.StockObserveable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        // observerable
        StockObserveable iphoneStockObserverable = new IphoneObserverable();

        // observer
        NotificationAlertObserver observer1 = new EmailAlertObserver("jayesh@gmail.com", iphoneStockObserverable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("8269378378", iphoneStockObserverable);

        iphoneStockObserverable.add(observer1);
        iphoneStockObserverable.add(observer2);
        iphoneStockObserverable.setStockCount(10);


    }







}
