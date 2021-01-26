/**
 * 考虑使用工厂模式来一个表示绘图的标准，并且可以根据不同的图形来进行绘制。
 * */
interface IGraphical{  //定义绘图的标准
    public void print();  //绘图
}

class Point{    //坐标类
    private double x;
    private double y;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

class Triangle implements  IGraphical{  //绘制三角形
    private Point [] x;   //保存第一条边的坐标
    private Point [] y;   //保存第一条边的坐标
    private Point [] z;   //保存第一条边的坐标
    public Triangle(Point [] x,Point [] y,Point [] z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void print() {
        System.out.println("绘制第一条边，开始坐标：[" + this.x[0].getX() + "，" + this.x[0].getY() +"]，结束坐标：[" + this.x[1].getX() + "，" + this.x[1].getY() +"]" ) ;
        System.out.println("绘制第二条边，开始坐标：[" + this.y[0].getX() + "，" + this.y[0].getY() +"]，结束坐标：[" + this.y[1].getX() + "，" + this.y[1].getY() +"]" ) ;
        System.out.println("绘制第三条边，开始坐标：[" + this.z[0].getX() + "，" + this.z[0].getY() +"]，结束坐标：[" + this.z[1].getX() + "，" + this.z[1].getY() +"]" ) ;
    }

}

class Circular implements IGraphical{  //绘制圆形
    private double radius;
    public Circular(double radius){
        this.radius = radius;
    }

    @Override
    public void print(){
        System.out.println("以半径为“"+this.radius+"”绘制圆形。");
    }
}

class Factory2{
    public static IGraphical getInstance(String classname,double ... args){
        if("Triangle".equalsIgnoreCase(classname)) {
            return new Triangle(
                    new Point[] {
                            new Point(args[0],args[1]) , new Point(args[2],args[3])} ,
                    new Point[] {
                            new Point(args[4],args[5]),new Point(args[6],args[7])} ,
                    new Point[] {
                            new Point(args[8],args[9]),new Point(args[10],args[11])}
            ) ;
        } else if("Circular".equalsIgnoreCase(classname)) {
            return new Circular(args[0]) ;
        } else {
            return null ;
        }
    }
}

public class Interface_example2 {
    public static void main(String[] args) {
        IGraphical iga = Factory2.getInstance("triangle",1.1,2.2,3.3,4.4,11.11,22.22,33.33, 44.44,111.111,222.222,333.333,444.444);
        iga.print();
        IGraphical igb = Factory2.getInstance("circular",88.11) ;
        igb.print();
}
}
