import java.util.ArrayList;
import java.util.Scanner;

class Multiplier {
    static int multiply(int a, int b) {
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}

public class MultiplyOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter the number (Press * to stop): ");
            String input = scanner.next();
            if (input.equals("*")) {
                break;
            }
            numList.add(Integer.parseInt(input));
        }
        
        int size = numList.size();
        int result;
        if (size == 2) {
            result = Multiplier.multiply(numList.get(0), numList.get(1));
        } else if (size == 3) {
            result = Multiplier.multiply(numList.get(0), numList.get(1), numList.get(2));
        } else {
            int[] numbers = numList.stream().mapToInt(i -> i).toArray();
            result = Multiplier.multiply(numbers);
        }
        
        System.out.println("Multiplication result: " + result);
        scanner.close();
    }
}