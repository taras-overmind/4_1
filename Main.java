public class Main {
    public static void main(String[] args) {
    Triangle t1= new Triangle(6, 8, 10);
        System.out.println(t1.calcPerimeter());
        System.out.println(t1.calcAngle(1, 2));
        System.out.println(t1.calcAngle(1, 3));
        System.out.println(t1.calcAngle(2, 3));
        t1.change_side(7, 1);
        System.out.println(t1.calcAngle(1, 2));
        System.out.println(t1.calcAngle(1, 3));
        System.out.println(t1.calcAngle(2, 3));
        System.out.println(t1.calcPerimeter());
        Equilateral_triangle t2= new Equilateral_triangle(5);
        System.out.println(t2.calcAngle(1, 2));
        System.out.println(t2.calcAngle(1, 3));
        System.out.println(t2.calcAngle(2, 3));
        System.out.println(t2.calcPerimeter());
        System.out.println(t2.calcSquare());
    }
}
