package variant9;


public class Teacher {
    private String name;
    private int age;
    private String science;

    public Teacher(String name, int age, String science) {
        this.name = name;
        this.age = age;
        this.science = science;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return  "| FIO | " + name + " | age |" + age + " | science |" + science + "|";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
