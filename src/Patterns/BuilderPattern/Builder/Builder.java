package Patterns.BuilderPattern.Builder;


import Patterns.BuilderPattern.FinalObject;
import java.util.List;

// contains all the attribute of the FinalObject that where code redudancy can occur.
public abstract class Builder {
    private int rollNumber;
    private int age;
    private String Name;
    private String FatherName;
    private String MotherName;
    protected List<String> Subjects;

    public Builder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }

    public Builder setName(String Name){
        this.Name = Name;
        return this;
    }

    public Builder setFatherName(String FatherName){
        this.FatherName = FatherName;
        return this;
    }

    public Builder setMotherName(String MotherName){
        this.MotherName = MotherName;
        return this;
    }

    abstract public Builder setSubjects();
    public FinalObject buildObject(Builder builder){
        return new FinalObject(builder);
    }


    public String getFatherName() {
        return FatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return Name;
    }

    public List<String> getSubjects(){
        return Subjects;
    }
}
