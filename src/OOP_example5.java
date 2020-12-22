/**
 * 设计一个表示用户的User类
 * 类中的变量有用户名、口令和记录用户个数的变量，
 * 定义类的3各构造方法（无参、为用户名赋值和为用户名和口令赋值）
 * */

class User{
    private String uid;
    private String password;
    public static int count = 0;
    public User(){
        this("nouid","nopassword");
    }
    public User(String uid){
        this(uid,"nopassword");
    }
    public User(String uid,String password){
        count ++;
        this.uid=uid;
        this.password=password;
    }
    // setter、getter略

    public String getInfo(){
        return "【用户信息】用户名："+this.uid+"、用户密码："+this.password;
    }
}

public class OOP_example5 {
    public static void main(String[] args) {
        System.out.println(new User().getInfo());
        System.out.println(new User("只有名字").getInfo());
        System.out.println(new User("用户名","密码").getInfo());
        System.out.println("用户个数："+User.count);
    }
}
