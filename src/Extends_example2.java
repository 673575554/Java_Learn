/**
* 1、案例分析一（学生类）
建立一个人类（Person）和学生类（Student），功能要求如下：
1. Person中包含4个私有型的数据成员name、addr、sex、age，分别为字符串型，字符串型、字符型和整形。一个四参构造方法、一个两参构造方法、一个无参构造方法、一个输出方法。
2. Student类继承Person类，并增加成员math、english存放数学和英语成绩。一个六参构造方法、一个无参构造方法和重写输出方法用于显示6种属性。
* */


class Person2{
    private String name;
    private String addr;
    private char sex;
    private int age;
    public Person2(){};
    public Person2(String name,String addr){
        this.name = name;
        this.addr =addr;
    };
    public Person2(String name,String addr,char sex,int age){
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    };
    public String getInfo(){
       return ("姓名："+this.name+"、地址："+this.addr+"、性别："+this.sex+"、年龄："+this.age);
    };
}

class Student2 extends Person2{
    private double math;
    private double english;
    public Student2(){};
    public Student2(String name,String addr,char sex,int age,double math,double english){
        super(name,addr,sex,age);
        this.math = math;
        this.english = english;
    };
    @Override
    public String getInfo(){
        return (super.getInfo()+"、英语："+this.english+"、数学："+this.math);
    }

}


public class Extends_example2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("张三","长沙",'男',21);
        System.out.println(p1.getInfo());
        Student2 p2 = new Student2("李四","北京",'女',34,21.2,32.3);
        System.out.println(p2.getInfo());
    }
}
