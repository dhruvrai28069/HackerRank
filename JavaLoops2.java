import java.util.*;
import java.io.*;

class JavaLoops2{
    static void main(String []argh) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int current_sum = a;

            for (int j = 0; j < n; j++) {

                int term_to_add = (int)Math.pow(2, j) * b;

                current_sum = current_sum + term_to_add;

                System.out.print(current_sum + " ");
            }

            System.out.println();
        }
    }
}