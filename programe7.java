
import java.util.Scanner;

public class programe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no:");
        int x = sc.nextInt();
        int sum =0;
        while(x>0){
            int a = x%10;
            sum+=a;
            x/=10;
        }
        System.out.print("Enter the no:");
        int y = sc.nextInt();
        if(y%sum==0){
            System.out.println("NO is divisible");
        }else{
            System.out.println("Not divisibble");
        }
    }
}