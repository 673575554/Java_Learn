class Dept{   //类名称可以明确描述出某类事物
    private long deptno;
    private String dname;
    private String loc;
    public Dept(){}  //必须提供无参构造
    public Dept(long deptno,String dname,String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public String getInfo(){
        return "【部门信息】部门编号："+this.deptno+"、部门名称："+this.dname+"、部门地址："+this.loc;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public long getDeptno() {
        return deptno;
    }
    public String getDname() {
        return dname;
    }
    public String getLoc() {
        return loc;
    }

}


public class OOP_simpleJava {
    public static void main(String[] args) {
        Dept dept = new Dept(10,"信息技术部","北京");
        System.out.println(dept.getInfo());
    }
}
