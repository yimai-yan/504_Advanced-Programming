public class Factorial {
    public static Integer getRecursiveFactorial(Integer n) {
        if(n == 0 | n == 1){
            return n;
        } else {
            return n * getRecursiveFactorial(n - 1);
        }
    }
}
