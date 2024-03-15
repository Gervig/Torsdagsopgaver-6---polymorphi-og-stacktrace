import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        ArrayList<String> s1passed = new ArrayList<>();
        s1passed.add("Biology");
        s1passed.add("How to win at boardgames");
        Student s1 = new Student("Casper", s1passed);
        personList.add(s1);

        ArrayList<String> s2passed = new ArrayList<>();
        s2passed.add("Java 1.0");
        Student s2 = new Student("Rikke", s2passed);
        personList.add(s2);
        s2.addCourse("Social Cues");

        ArrayList<String> t1canTeach = new ArrayList<>();
        t1canTeach.add("Biology");
        Teacher t1 = new Teacher("Ethan", t1canTeach);
        personList.add(t1);

//        for (Person p: personList){
//            if (p instanceof Student){
//                Student student = (Student) p;
//                p.addCourse("Java 1.0");
//            } else if (p instanceof Teacher){
//                Teacher teacher = (Teacher) p;
//                p.addCourse("Java 1.0");
//            }
//        }

        for (Person p : personList) {
            System.out.println("Name: " + p.getName());
            if (p instanceof Student) {
                Student student = (Student) p;
                p.addCourse("Java 1.0");
                p.addCourse("Biology");
                p.addCourse("Computer Science");
                System.out.println("Passed Courses: " + student.passedCourse);
                System.out.println("Current Courses: " + student.currentCourse);
            } else if (p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                p.addCourse("Java 1.0");
                p.addCourse("Biology");
                p.addCourse("Computer Science");
                System.out.println("Can Teach Courses: " + teacher.canTeach);
                System.out.println("Current Courses: " + teacher.currentCourse);
            }
            System.out.println();
        }
    }
}