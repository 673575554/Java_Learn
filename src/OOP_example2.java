/**
 * 定义并测试一个代表员工的Employee类
 * 员工属性包括编号、姓名、基本薪水、薪水增长率
 * 还包括计算薪水增长额以及计算增长后的工资总额的操作方法。
 * */

class Employee{
    private long empno;
    private String ename;
    private double salary;
    private double rate;
    public Employee(){}
    public Employee(long empno,String ename,double salary,double rate){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.rate = rate;
    }

    public String salaryIncValue(){   //得到薪水增长额度
        double IncValue = this.salary*(1+this.rate)-this.salary;
        return "薪水增长额度："+IncValue;
    }
    public String salaryIncResult(){   //得到工资总额
        this.salary = this.salary*(1+this.rate);
        return "现在的工资总额："+this.salary;
    }
    //setter、getter略
    public String getInfo(){
        return "【员工信息】编号："+this.empno + "、姓名："+this.ename+"、基本薪水："+this.salary+"、薪水增长率："+this.rate;
    }
}

public class OOP_example2 {
    public static void main(String[] args) {
        Employee employee = new Employee(01,"张三",100,0.5);
        System.out.println(employee.getInfo());
        System.out.println(employee.salaryIncValue());
        System.out.println(employee.salaryIncResult());
        System.out.println(employee.getInfo());
    }
}
