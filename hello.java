import java.util.*;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        int largest;
        if (b <= a && c <= a) {
            largest = a;
        } else if (a <= b && c <= b) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest Number Is:" + largest);
    }
}