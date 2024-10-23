package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<Boolean> canTeach = new ArrayList<>();
    ArrayList<Boolean> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<Boolean> canTeach, ArrayList<Boolean> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        return false;
    }
}
