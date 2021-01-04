/*
分析可得出结果：
一个部门有多个雇员
一个雇员属于一个部门
一个雇员有一个领导
要求：
根据部门信息获得：一个部门的完整信息、一个部门之中所有雇员的完整信息、一个雇员对应的领导信息
根据雇员信息获得：一个雇员所在部门信息、一个雇员对应的领导信息
 */


class Dept1{
    private long deptno;    //部门编号
    private String dname;   //部门名称
    private String loc;     //部门位置
    private Emp emps[];     //一个部门有多个雇员
    public Dept1(long deptno,String dname,String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
    //getter、setter、无参构造略
    public String getInfo(){
        return "【部门信息】部门编号："+this.deptno+"、部门名称："+this.dname+"、部门位置："+this.loc;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }
    public Emp[] getEmps() {
        return this.emps;
    }
}

class Emp{
    private long empno;    //雇员编号
    private String ename;  //姓名
    private String job;    //职位
    private double sal;    //基本工资
    private double comm;   //佣金
    private Dept1 dept1;   //部门
    private Emp mgr;       //领导
    public Emp(long empno,String ename,String job,double sal,double comm){
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }
    //getter、setter、无参构造略
    public String getInfo(){
        return "【雇员信息】雇员编号："+this.empno+"、姓名："+this.ename+"、职位："+this.job+"、基本工资："+this.sal+"、佣金："+this.comm;
    }

    public void setDept1(Dept1 dept1){
        this.dept1 = dept1;
    }
    public Dept1 getDept1() {
        return this.dept1;
    }
    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }
    public Emp getMgr() {
        return this.mgr;
    }
}


public class ArrayDemo_example2 {
    public static void main(String[] args) {
        //第一步：根据关系进行类的定义
        //定义出各个的实例化对象，此时没有任何关联定义
        Dept1 dept1 = new Dept1(01,"信息技术部","长沙");
        Emp empA = new Emp(001L,"张三","技术员",800,0);
        Emp empB = new Emp(002L,"李四","经理",6000,0);
        Emp empC = new Emp(003L,"王五","老总",12000,0);
        //为对象进行关联的设置
        empA.setDept1(dept1);
        empB.setDept1(dept1);
        empC.setDept1(dept1);
        empA.setMgr(empB);
        empB.setMgr(empC);
        dept1.setEmps(new Emp[] {empA,empB,empC});
        //第二部：根据关系获取数据
        System.out.println(dept1.getInfo());
        for(int x = 0; x<dept1.getEmps().length; x++) {
            System.out.println("\t|-" + dept1.getEmps()[x].getInfo());
            if (dept1.getEmps()[x].getMgr() != null) {
                System.out.println("\t\t|-" + dept1.getEmps()[x].getMgr().getInfo());
            }
        }
        System.out.println("-------------------------------------");
        System.out.println(empB.getDept1().getInfo());   //根据雇员获取部门信息
        System.out.println(empB.getMgr().getInfo());     //根据雇员获取领导信息
    }
}
