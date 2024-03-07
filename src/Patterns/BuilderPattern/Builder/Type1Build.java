package Patterns.BuilderPattern.Builder;

import java.util.*;
public class Type1Build extends Builder{

    @Override
    public Builder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("type11");
        subjects.add("type12");
        subjects.add("type13");
        subjects.add("type14");
        subjects.add("type15");
        this.Subjects = subjects;
        return this;
    }
}
