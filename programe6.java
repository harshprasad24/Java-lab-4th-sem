import java.util.Scanner;

public class programe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle:");
        int p = sc.nextInt();
        System.out.print("Enter the time :");
        int t = sc.nextInt();
        System.out.print("Enter the rate :");
        int r = sc.nextInt();
        int si = (p*r*t)/100;
        System.out.println("SIMPLE INTREST:"+si);
        System.out.println("TOTAL AMOUNT:"+(si+p));
    }
}
