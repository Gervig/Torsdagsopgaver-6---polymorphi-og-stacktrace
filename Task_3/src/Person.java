//  3.1
abstract public class Person {
    private String name;

    public Person(String name){
        this.name= name;
    }
    abstract public boolean addCourse(String course);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
