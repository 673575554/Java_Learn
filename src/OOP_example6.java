/**
 * 声明一个图书类、其数据成员为书名、编号（静态变量自动编号）、价格。
 * 并拥有静态数据成员册数、记录图书的总量，
 * 在构造方法中利用此静态变量为对象的编号赋值，
 * 在主方法中定义多个对象，并求出总册数。*/

class Book{
    private String title;
    private int bid;
    private double price;
    private static int count=1;
    public Book(){}
    public Book(String title,double price){
        this.title = title;
        this.bid =  count ++;
        this.price = price;
    }
    //setter、getter略
    public String getInfo(){
        return "【图书信息】编号："+this.bid+"、书名："+this.title+"、价格："+this.price;
    }
}

public class OOP_example6 {
    public static void main(String[] args) {
        Book book1 = new Book("Python",100);
        Book book2 = new Book("Java",120);
        Book book3 = new Book("Vue",140);
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
    }
}
