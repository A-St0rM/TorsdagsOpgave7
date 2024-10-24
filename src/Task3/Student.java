package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourse){
        super(name);
        this.passedCourses = passedCourse;
    }

    @Override
    public boolean addCourse(String course){
        if(!passedCourses.contains(course)){

            currentCourses.add(course);
            System.out.println("This course: " + course + " is not passed and is in your current courses");
            return true;
        }
        System.out.println("The course: " + course + " is already passed");
        return false;
    }


}
