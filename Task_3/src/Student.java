import java.util.ArrayList;

//  3.2
public class Student extends Person {
    //  3.3
    ArrayList<String> passedCourse = new ArrayList<>();
    ArrayList<String> currentCourse = new ArrayList<>();;

    public Student(String name, ArrayList<String> passedCourse) {
        super(name);
        this.passedCourse = passedCourse;
    }

    @Override   //  3.4
    public boolean addCourse(String course) {
        if (passedCourse.contains(course)) {
            System.out.println(getName()+" has already passed "+course);
            return false;
        } else {
            currentCourse.add(course);
            return true;
        }
    }
}