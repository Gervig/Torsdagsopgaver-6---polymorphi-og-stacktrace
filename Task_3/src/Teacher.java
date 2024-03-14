import java.util.ArrayList;

//  3.2
public class Teacher extends Person{
    //  3.3
    ArrayList<String> canTeach = new ArrayList<>();;
    ArrayList<String> currentCourse = new ArrayList<>();;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }
    @Override   // 3.5
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourse.add(course);
            return true;
        } else {
            System.out.println(getName()+" can't teach "+course);
            return false;
        }
    }
}