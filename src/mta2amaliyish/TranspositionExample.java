package mta2amaliyish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by: Umar
 * DateTime: 10/12/2024 11:37 AM
 */
public class TranspositionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();


        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(" ------------------Listning umumiy ko'rinishi ------------------");
        list.forEach(System.out::println);

        int res = findLargesDivisibleBy11(list);

        System.out.println("");
        System.out.println("");
        System.out.println("                               Natija                    ");

        if(res == -1){
            System.out.println("11 ga bo'linadigan son yo'q: ");
        }else {
            System.out.println("11 ga bo'linadigan eng katta son(agar bir nechta bo'lsa eng kichigi) : " + res);
        }


    }


    public static int findLargesDivisibleBy11(List<Integer> list) {
        int mn = Integer.MIN_VALUE;
        boolean found = false;

        for (int num : list) {
            if (num % 11 == 0) {
                if (!found || num > mn) {
                    mn = num;
                    found = true;
                } else if (num == mn) {
                    mn = Math.min(mn, num);
                }
            }
        }
        return found? mn : -1;
    }
}
