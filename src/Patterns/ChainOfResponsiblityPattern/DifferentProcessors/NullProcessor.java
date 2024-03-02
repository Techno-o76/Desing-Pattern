package Patterns.ChainOfResponsiblityPattern.DifferentProcessors;

import Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor;

public class NullProcessor extends Processor {
    public NullProcessor(){
//        super(null);
    }

    public void log(int logLevel, String message){
        System.out.println("This is NullProcessor :" + logLevel + " "+message);
    }

}
