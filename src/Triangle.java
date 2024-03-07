public class Triangle {
    public Triangle() {
    }
    int lineA; int lineB; int lineC;
    public Integer getLineA(){
        return lineA;
    }

    public void SetLineA(int a){
        this.lineA = a;
    }

    public Integer getLineB(){
        return lineB;
    }

    public void SetLineB(int b){
        this.lineB = b;
    }

    public Integer getLineC(){
        return lineC;
    }

    public void SetLineC(int c){
        this.lineC = c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.SetLineA(3);
        triangle.SetLineB(4);
        triangle.SetLineC(5);
        System.out.println("The Area is " + triangle.getArea() + ". The Perimeter is " + Triangle.getPerimeter(3,4,5));
    }

    public Float getArea(){
        return (float) (this.lineA);
    }

    public static Float getPerimeter(int a, int b, int c){
        return (float)(a + b +c);
    }
}
