package variant9;

import java.util.ArrayList;
import java.util.List;


public class TestTeacher {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(new Teacher("Rahmatov Rabbim ",65,"Calculus             "));
        teachers.add(new Teacher("Radjabov Farxod ",70,"computer organization"));
        teachers.add(new Teacher("Shodmonov Shokir",36,"Programming          "));
        teachers.add(new Teacher("Gulyamov Ilhom  ",30,"Historic             "));
        System.out.print("--------------------------------------------------------------------\n");

        for (Teacher teacher : teachers) {

            System.out.println(teacher);
        }

        System.out.print("--------------------------------------------------------------------");


    }
}
