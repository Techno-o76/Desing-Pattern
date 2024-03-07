package Patterns.BuilderPattern;


import Patterns.BuilderPattern.Builder.Builder;

import java.util.List;

// with respect to student
public class FinalObject {
    int rollNumber;
    int age;
    String Name;
    String FatherName;
    String MotherName;
    List<String> Subjects;

    public FinalObject(Builder builder){
        this.rollNumber = builder.getRollNumber();
        this.age = builder.getAge();
        this.Name = builder.getName();
        this.FatherName = builder.getFatherName();
        this.MotherName = builder.getMotherName();
        this.Subjects = builder.getSubjects();
    }

}
