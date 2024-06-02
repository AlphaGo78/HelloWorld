package demo01;

import java.util.ArrayList;
import java.util.Random;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Fry eats cup of coffee #" + i);
        }


        int c = 0;
        while (c < 10) {
            System.out.println("Fry drinks cup of coffee #" + c);
            c++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        int i = 0; // initialize counter

        while (i < list.size()) {
            // if value is odd, remove value
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            } else {
                // if value is even, increment counter
                i++;
            }
        }
        System.out.println(list);

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 3 == 0) {
                // remove value from ArrayList
                list.remove(list.get(j));
                // Decrease loop control variable by 1
                j--;
            }
        }
        System.out.println(list);


    }
}
