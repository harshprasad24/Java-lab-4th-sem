
public class programe9 {

    public static void main(String[] args) {
    int arr[] = {1,2,4,9,3};

       int temp = arr[0];
       for (int i = 1; i < arr.length-1; i++) {
        if (arr[0] < arr[i]) {
            temp = arr[i];
        }
       } 
       int temp1 = arr[0];
       for (int i = 1; i < arr.length-1; i++) {
        if (arr[0] < arr[i] && arr[i] != temp) {
            temp1 = arr[i];
        }
       } 
       System.out.println(temp);
       System.out.println(temp1);
       System.out.println(temp*temp1);
    }
    
}