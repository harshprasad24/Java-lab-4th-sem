
import java.util.Scanner;

public class programe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit:");
        int x = sc.nextInt();
        int add = 0 ; 
        int count = 0;
        System.out.print("Enter the upper limit:");
        int y = sc.nextInt();
        System.out.print("Enter the number of prime no:");
        int n = sc.nextInt();
        if(y>x){
            for(int i =x ;i<=y;i++){
                add=0;
                for(int j=1;j<=y;j++){
                    if(i%j==0){
                        add++ ;
                    }
                }
                if(add==2){
                    System.out.print(i);
                    System.out.print(",");
                    count++;
                }
                if(count==n){
                    break;
                }
            }
            if(n>count){
                System.out.print("only because No of prime no ask is greater");
            }
        }else{
            System.out.print("Input again");
        }
    }
}
