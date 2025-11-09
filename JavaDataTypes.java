
import java.io.*;
import java.util.*;

public class JavaDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++){

            String s = sc.next() ;

            try{

                long n = Long.parseLong(s);

                System.out.println(n + " can be fitted in:");

                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }

                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }

                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            }

            catch(NumberFormatException e){
                System.out.println( s + " can't be fitted anywhere.");
            }
        }
    }
}