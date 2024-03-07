package Patterns.BuilderPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Type2Build extends Builder{

    @Override
    public Builder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("type21");
        subjects.add("type22");
        subjects.add("type23");
        subjects.add("type24");
        subjects.add("type25");
        this.Subjects = subjects;
        return this;
    }
}
