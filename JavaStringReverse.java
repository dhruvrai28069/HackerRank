import java.io.*;
import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int head = 0;
        int tail = A.length() - 1;
        boolean isPalindrome = true;

        while (head < tail) {
            if (A.charAt(head) != A.charAt(tail)) {
                isPalindrome = false;
                break;
            }
            head++;
            tail--;
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
