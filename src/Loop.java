public class Loop {
    Integer a;
    Integer b;
    Integer c;
    boolean val = a < 10;

    public Loop(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        String a = new String("example");
        String b = new String("example");

// Compares references, false because 'a' and 'b' are different objects in memory
        System.out.println(a == b);

// Compares values, true because 'a' and 'b' have the same characters in the same order
        System.out.println(a.equals(b));

    }
    public Integer findMax(int a, int b, int c){
        int max = 0;

        return max;
    }
}
