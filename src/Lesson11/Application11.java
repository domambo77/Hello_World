package Lesson11;

import java.util.Scanner;

public class Application11 {
    int f = findFactorial(5);

    static int findFactorial(int x) {
        /**   int y = 1;
         int count = 1;
         while (count != x){
         y += x * y;
         count++;
         }return y;*/
        if (x == 1) {
            return 1;
        }
        return x * findFactorial(x - 1);//recurcion
    }
}



