package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses = new ArrayList<>();
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> canTeach = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        Person teacher1 = new Teacher("Signe", canTeach);
        Person teacher2 = new Teacher("Tess", canTeach2);
        Person student1 = new Student("Alissa", passedCourses);
        Person student2 = new Student("Bente", passedCourses2);

        canTeach.add("IT-Security");
        canTeach2.add("Java 1.0");
        passedCourses.add("IT-Security");
        passedCourses2.add("Java 1.0");


        persons.add(student1);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(student2);


        for(Person p : persons){
            p.addCourse("Java 1.0");
        }

    }
}
