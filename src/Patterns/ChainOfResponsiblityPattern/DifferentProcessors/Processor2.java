package Patterns.ChainOfResponsiblityPattern.DifferentProcessors;

import Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor;

public class Processor2 extends Processor {
    Processor nextProcessor;
    public Processor2(Processor nextProcessor){
        super(nextProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == processor2){
            System.out.println("Processor2: "+message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
