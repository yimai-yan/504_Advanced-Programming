import java.util.Scanner;

public class CountInstances {
    // Give value to the "count", otherwise the default value of Interger is null
    static Integer count = 0;

    CountInstances(){
        this.count ++;
    }

    public static void main(String[] args) {
        // manually create 2 instance

        System.out.println("Thw created instances are " + CountInstances.createInstances());
    }

    public static int createInstances() {
        Scanner typedInput = new Scanner(System.in);
        int theNumber = typedInput.nextInt();
        for (int i = 0; i < theNumber ; i++) {
            CountInstances newClass = new CountInstances();
        }
        return count;
    }
}
