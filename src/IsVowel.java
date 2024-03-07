import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = scanner.next().toLowerCase();
        char ch = input.charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:
                if((ch >= 'a' && ch <= 'z')) {
                    System.out.println("The character is a consonant.");
                }
                break;
        }

        scanner.close();
    }
}

