package Patterns.BuilderPattern;

// ask for the required object.

import Patterns.BuilderPattern.Builder.Builder;
import Patterns.BuilderPattern.Builder.Type1Build;
import Patterns.BuilderPattern.Builder.Type2Build;

// for example in this I have take the example of students enrollment in a university.
public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new Type1Build());
        Director director2 = new Director(new Type2Build());
        FinalObject finalObject1 = director1.getObject();
        FinalObject finalObject2 = director2.getObject();
        System.out.println(finalObject1.Name);
        System.out.println(finalObject2.Name);
    }
}
