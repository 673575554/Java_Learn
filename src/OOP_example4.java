/**
 * 构造一个银行账户类，类的构成包括如下内容：
 * 数据成员用户的账户名称、用户的账户余额
 * 方法包括开户（设置账户名称及余额），利用构造方法完成
 * 查询余额
 * */

class Account{
    private String name;
    private double balance;
    public Account(){}
    public Account(String name){
       this(name,0.0);
    }
    public Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }

    //setter、getter方法略
    public double getBalance() {
        return balance;
    }
    public String getInfo(){
        return "【账户信息】账户名称："+this.name+"、账户余额："+this.balance;
    }
}

public class OOP_example4 {
    public static void main(String[] args) {
        Account account = new Account("张三1",1000);
        System.out.println(account.getInfo());
        System.out.println(account.getBalance());
    }
}
