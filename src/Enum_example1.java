/**
 * 定义一个Person类，枚举性别。
 * */

class Person4{
    private String name;
    private int age;
    private Sex sex;
    public Person4(String name,int age,Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String toString1(){
        return "姓名：" + this.name + "年龄：" + this.name +"性别：" + this.sex;
    }

}

enum Sex{  //枚举性别
    MALE("男"),FEMALE("女");
    private String title;
    private Sex(String title){
        this.title = title;
    }
    public String toString1(){
        return this.title;
    }
}




public class Enum_example1 {
    public static void main(String[] args) {
        Person4 p4 = new Person4("张三",21,Sex.MALE);
        System.out.println(p4.toString1());
    }
}
