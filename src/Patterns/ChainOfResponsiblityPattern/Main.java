package Patterns.ChainOfResponsiblityPattern;

import Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor;
import Patterns.ChainOfResponsiblityPattern.DifferentProcessors.Processor1;
import Patterns.ChainOfResponsiblityPattern.DifferentProcessors.Processor2;
import Patterns.ChainOfResponsiblityPattern.DifferentProcessors.Processor3;

import static Patterns.ChainOfResponsiblityPattern.AbstractProcessor.Processor.*;

public class Main {
    public static void main(String[] args){
        Processor processor = new Processor1(new Processor2(new Processor3(null)));

        processor.log(processor1,"this is processor1");
        processor.log(processor2,"this is processor2");
        processor.log(processor3,"this is processor3");
        processor.log(4,"No responsibility Found!!!");
    }
}
