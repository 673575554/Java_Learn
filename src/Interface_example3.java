/**
 * 定义类Shape，用来表示一般二维图形。Shape具有抽象方法area()和perimeter()，分别用来计算形状的面积和周长。
 * 试定义一些二维形状类（如矩形、三角形、圆形、椭圆形等），这些类均为Shape类的子类。
 * */
abstract class AbstractShape{
    public abstract double area();
    public abstract double perimeter();
}

class Circular2 extends AbstractShape{
    private double radius;
    public Circular2(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return 3.14*this.radius*this.radius;
    };
    @Override
    public double perimeter(){
        return 3.14*2*this.radius;
    };
}

public class Interface_example3 {
    public static void main(String[] args) {
        Circular2 circular2 = new Circular2(4);
        System.out.println(circular2.area());
        System.out.println(circular2.perimeter());
    }
}
