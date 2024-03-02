package Patterns.ChainOfResponsiblityPattern.DifferentProcessors;

import Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor;

public class Processor3 extends Processor {
    Processor nextProcessor;
    public Processor3(Processor nextProcessor){
        super(nextProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == processor3){
            System.out.println("Processor3: "+message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
