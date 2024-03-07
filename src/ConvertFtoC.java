import java.util.Scanner;

public class ConvertFtoC {
    public static void outputConvertedTemp() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a F temperature");
        double userInputF = userInput.nextDouble();
        double userOutputC = (userInputF - 32) * 5 / 9;
        System.out.println("The Celsius Temperature is " + userOutputC);
    }
}
