package Patterns.BuilderPattern;

import Patterns.BuilderPattern.Builder.Builder;
import Patterns.BuilderPattern.Builder.Type1Build;
import Patterns.BuilderPattern.Builder.Type2Build;

// direct and execute the flow to make the desired object.
public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
        if(builder instanceof Type1Build){
            // follow this instruction
            buildType1();
        }
        else if(builder instanceof Type2Build){
            // follow this instruction
            buildType2();
        }
        else{
            // some other logic
        }
    }

    public FinalObject getObject(){
        return new FinalObject(builder);
    }

    private void buildType1(){
         builder.setRollNumber(1).setName("Object1").setFatherName("OBJECT1").setMotherName("object1").setAge(22).setSubjects();
    }

    private void buildType2(){
        builder.setRollNumber(1).setName("Object2").setFatherName("OBJECT2").setMotherName("object2").setAge(22).setSubjects();
    }
}
