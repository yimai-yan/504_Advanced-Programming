public class Student {

    String name;
    Integer roll_no;
    public Student(String name, Integer roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public Student() {

    }

    public static void main(String[] args) {
        Student aNewStudent = new Student("yimai_yan", 1340319);
        System.out.println(aNewStudent.getResult());
    }
    public String getResult() {
        return " name is " + name + " , roll_no is " + roll_no;
    }

}
