package Deadline;

import java.util.ArrayList;
import java.util.Comparator;


/**
 * Created by: Umar
 * DateTime: 9/21/2024 11:26 PM
 */

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Davron Rustamjonov", 15, 5));
        students.add(new Student("Mirzobobur Alijonov", 16, 4));
        students.add(new Student("Humoyun Ruziyev", 18, 2));
        students.add(new Student("Vohidjon Norboboyev", 17, 10));
        students.add(new Student("Farrux Sobirov", 20, 9));
        students.add(new Student("Abubakr Yoqubjonov", 19, 8));
        students.add(new Student("Sirojiddin Jamoliddinov", 20, 7));

        students.sort(Comparator.naturalOrder());

        System.out.println("\nO'rni almashmasdan oldingi ro'yxat!!!\n");
        students.forEach(System.out::println);

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getBall() > students.get(maxIndex).getBall()) {
                maxIndex = i;
            }
            if (students.get(i).getBall() < students.get(minIndex).getBall()) {
                minIndex = i;
            }
        }

        Student temp = students.get(maxIndex);
        students.set(maxIndex, students.get(minIndex));
        students.set(minIndex, temp);


        System.out.println("\nO'rni almashgandan keyingi ro'yxat!!!\n");
        students.forEach(System.out::println);
    }
}

