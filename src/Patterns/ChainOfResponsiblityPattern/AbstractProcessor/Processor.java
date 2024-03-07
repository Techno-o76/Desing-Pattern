package Patterns.ChainOfResponsiblityPattern.AbstractProcessor;

import Patterns.ChainOfResponsiblityPattern.DifferentProcessors.NullProcessor;

public abstract class Processor {
    public static int processor1 = 1;
    public static int processor2 = 2;
    public static int processor3 = 3;

    Processor nextProcessor;
    private static Processor nullProcessor = new NullProcessor();

    public Processor (Processor loggerProcessor){
        this.nextProcessor = loggerProcessor;
    }

    // Have to create the empty constructor to allow storage of  objectes of its sub-class having empty constructor,
    // need more clearifiation on this.
    public Processor(){

    }


    public void log(int logLevel, String message){
        if(nextProcessor!=null){
            nextProcessor.log(logLevel, message);
        }
        else{
            nullProcessor.log(logLevel, message);
        }
    }
}
