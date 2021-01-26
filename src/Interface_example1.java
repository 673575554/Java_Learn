/**
 * 1、定义一个ClassName接口，接口中只有一个抽象方法getClassName()，
 * 设计一个类Company，该类实现接口ClassName中的方法getClassName()，功能是获取该类的类名称；编写应用程序使用Company类。
 * */


interface IClassName{
    public String getClassName();
}

class Company implements IClassName{
    @Override
    public String getClassName(){
        return "Company";
    }
}


public class Interface_example1 {
    public static void main(String[] args) {
        IClassName Ia = new Company();
        System.out.println(Ia.getClassName());

    }
}
