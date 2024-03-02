package Patterns.ChainOfResponsiblityPattern.DifferentProcessors;

import Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor;

public class Processor1 extends Processor {

    Processor nextProcessor;
    public Processor1(Processor nextProcessor){
        super(nextProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == processor1){
            System.out.println("Processor1: "+message);
        }
        else{
            super.log(logLevel, message);
        }
    }

}
