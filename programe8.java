
import java.util.Scanner;

public class programe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=24563;
        while(x>0){
            if(x%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
            x/=10;
        }
    }
}
