public class Student {
    protected String name;
    protected int age;
    protected int yearOfStudy;

    public Student(String name, int age, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
