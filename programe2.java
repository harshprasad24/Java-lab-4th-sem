
import java.util.Scanner;

public class programe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to ask");
        int x = sc.nextInt();
        int even =0 ;
        int odd = 0;
        while(x>0){
            int a = x%10;
            if(a%2==0){
                even+=a;
            }else{
                odd+=a;
            }
            x/=10;
            System.out.println("SUM of Odd no :"+odd);
            System.out.println("Sum of Even no: "+even);
        }
    }
}
