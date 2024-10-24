package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses = new ArrayList<>();
        ArrayList<String> canTeach = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        canTeach.add("IT-Security");
        canTeach.add("Programming");
        passedCourses.add("IT-Security");
        passedCourses.add("Programming");


        Person teacher1 = new Teacher("Signe", canTeach);
        Person teacher2 = new Teacher("Tess", canTeach);
        Person student1 = new Student("Alissa", passedCourses);
        Person student2 = new Student("Bente", passedCourses);


        persons.add(student1);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(student2);

        teacher1.addCourse("Webdesign");
        teacher2.addCourse("Programming");

        student1.addCourse("webdesign");
        student1.addCourse("IT-Security");

        for(Person p : persons){
            if(p instanceof Teacher){

            }
            p.addCourse("Java 1.0");

        }

    }
}
