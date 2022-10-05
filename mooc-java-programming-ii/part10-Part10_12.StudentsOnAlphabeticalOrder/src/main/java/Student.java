

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student another) {
        return this.name.compareTo(another.name);
    } 
    
    @Override
    public String toString() {
        return name;
    }

}
