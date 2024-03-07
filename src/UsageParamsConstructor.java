public class UsageParamsConstructor {
    String name;
    Integer Id;

    // This constructor has 2 params, using "this" key word to specify the "name" Data member declared in line 2
    public UsageParamsConstructor(String name, Integer id) {
        this.name = name;
        Id = id;
    }

    public UsageParamsConstructor() {
        name = "yincheng";
        Id = 777;
    }

    public static void main(String[] args) {
        // print the instance of the class
        System.out.println("The printed object is " + new UsageParamsConstructor("yimai yan", 1340319) +  "       "+ new UsageParamsConstructor());

    }
}
