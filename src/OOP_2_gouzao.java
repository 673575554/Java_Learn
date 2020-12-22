class Person1{
    private String name;
    private int age;

    public Person1(){
        System.out.println("打印了一句话");
    }

    //构造方法:方法名称和类名称相同
    public Person1(String name,int age){
        this();
        this.setName(name);  //为类中的属性赋值（初始化）
        this.setAge(age);  //为类中的属性赋值（初始化）
    }

    public void tell(){
        System.out.println("姓名："+name+"、年龄"+age);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}

public class OOP_2_gouzao {
    public static void main(String[] args) {
        //使用构造对象法实例化
        Person1 per = new Person1("张三",18);
        //实例化之后调用方法
        per.tell();
    }
}

