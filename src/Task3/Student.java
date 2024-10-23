package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<Boolean> passedCourses = new ArrayList<>();
    ArrayList<Boolean> currentCourses = new ArrayList<>();

    public Student(String name){
        super(name);
    }

    @Override
    public boolean addCourse(String course){

        return true;
    }
}
