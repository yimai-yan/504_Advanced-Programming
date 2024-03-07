public class NestedClassPrac {
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    Integer Id;
    public static void main(String[] args) {
        Super s = new Super(11);
        s.foo(13);
        Super.foo(16);
        System.out.println();
    }

    class SayMyName{

    }
}
class Super{
    public int test = 10;

    Super(int test){
        this.test = test;
    }

    public static void foo(int test) {
        System.out.println(test);
    }

}
