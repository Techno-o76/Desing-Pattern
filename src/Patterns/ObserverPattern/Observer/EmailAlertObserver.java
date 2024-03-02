package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observeable.StockObserveable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObserveable observeable;

    public EmailAlertObserver(String emailId, StockObserveable observeable){
        this.observeable = observeable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is in stock, hurry up!");
    }

    private void sendMail(String emailId,String message){
        System.out.println("Mail sent to:"+emailId);
        System.out.println("With the message: "+message);
        // send the actual mail to the end User
    }
}
