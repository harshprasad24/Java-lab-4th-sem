import java.util.Scanner;

public class programe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int stocks = sc.nextInt();
        System.out.print("Enter the number of time intervals: ");
        int times = sc.nextInt();
        double[][] Data = new double[stocks][times];
        for (int i = 0; i < stocks; i++) {
            System.out.println("Enter values for Stock " + (i + 1) + ":");
            for (int j = 0; j < times; j++) {
                System.out.print("Time " + (j + 1) + " value: ");
                Data[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nStock Values at Different Time Intervals:");
        for (int i = 0; i < stocks; i++) {
            System.out.print("Stock " + (i + 1) + ": ");
            for (int j = 0; j < times; j++) {
                System.out.print(Data[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}