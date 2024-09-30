package lesson1.Task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by: Umar
 * DateTime: 9/23/2024 11:07 AM
 */
public class TaskTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String name= sc.nextLine();

        char[] br = name.toCharArray();

        Arrays.sort(br);

        System.out.print("Tartiblangan harflar:");
        for (char c : br) {
            System.out.print(c);
        }
    }
}
