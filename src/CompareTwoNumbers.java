import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoNumbers {
    public static void getMinimumNumber() {
        Scanner userInputNums = new Scanner(System.in);
        int[] numbers = new int[2];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Please enter a int number");
            numbers[i] = userInputNums.nextInt();
        }
        int minimumValue = Arrays.stream(numbers).min().getAsInt();
        System.out.println("The minimum number is " + minimumValue);
    }
}
