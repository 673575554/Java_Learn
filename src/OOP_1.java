class Person{
    private String name;
    private int age;
    public void tell(){
        System.out.println("姓名："+name+"年龄："+age);
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class OOP_1 {
    public  static  void main(String [] args){
        Person per1 = new Person();
        per1.setName("张三");
        per1.setAge(18);
        per1.tell();
        System.out.println(per1.getName());
        System.out.println(per1.getAge());
    }
}
