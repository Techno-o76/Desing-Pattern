package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observeable.StockObserveable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String mobileNumber;
    StockObserveable observeable;
    public MobileAlertObserver(String mobileNumber, StockObserveable observeable){
        this.mobileNumber = mobileNumber;
        this.observeable = observeable;
    }

    // when ever update method is called then we can extract or get the deseired value of the object.
    @Override
    public void update() {
        sendMobile(this.mobileNumber,"Product is avaialbe now, Hurry Up!");
    }

    private void sendMobile(String number, String mssg){
        System.out.println("Alert sended to Mobile Number :" + number);
        System.out.println("With the message :" + mssg);
    }
}
