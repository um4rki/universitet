package Deadline;

/**
 * Created by: Umar
 * DateTime: 9/21/2024 11:19 PM
 */
public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int ball;

    public Student(String name, int age, int ball) {
        this.name = name;
        this.age = age;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public int getBall() {
        return ball;
    }


    @Override
    public String toString() {
        return "Ism Familiyasi =>" + "[ " + name + " ]" +
                ", yoshi => " + "[ " + age + " ]" +
                ", to'plagan bali => " + "[" + ball + " ]"
                ;
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
