
import java.util.Scanner;

public class programe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no:");
        int x =sc.nextInt();
        System.out.print("Enter the 2 nd no:");
        int y =sc.nextInt();
        x =x+y;
        y=x-y;
        x = x-y;
        System.out.println("THE 1st No."+x);
        System.out.println("THE 2nd no :"+y);
    }
}
