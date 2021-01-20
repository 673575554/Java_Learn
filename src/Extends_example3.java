/**
定义员工类、具有姓名、年龄、性别属性，并具有构造方法和显示数据方法。
定义管理层类，继承员工类，并具有自己的职务和年薪
定义职员类，继承员工类，并具有自己的所属部门和月薪
*/

class Employee2{
    private String name;
    private int age;
    private String sex;
    public Employee2(){};
    public Employee2(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getInfo(){
        return "名字："+this.name+"、年龄："+this.age+"、性别："+this.sex;
    }
}

class Manager extends Employee2{
    private String job;
    private double income;
    public Manager(){};
    public Manager(String name,int age,String sex,String job,double income){
        super(name,age,sex);
        this.job = job;
        this.income = income;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"、职务："+this.job+"、岗位："+this.income;
    }
}

class staff extends Employee2{
    private String dept;
    private double salary;
    public staff(){};
    public staff(String name,int age,String sex,String dept,double salary){
        super(name,age,sex);
        this.dept = dept;
        this.salary = salary;
    };
    @Override
    public String getInfo(){
        return super.getInfo()+"、部门："+this.dept+"、月薪："+this.salary;
    }
}


public class Extends_example3 {
    public static void main(String[] args) {
        Manager m1 = new Manager("张三",32,"女","主管",200000);
        staff m2 = new staff("李四",14,"男","信息部",2122);
        System.out.println(m1.getInfo());
        System.out.println(m2.getInfo());
    }
}
