class Person3 {
    private String name;						// 姓名
    private int age;							// 年龄
    // setter、getter略
}
class Student extends Person { 				// Student是子类
    private String school ;					// 子类扩充的属性
    public void setSchool(String school) {		// 扩充的方法
        this.school = school ;
    }
    public String getSchool() {				// 扩充的方法
        return this.school ;
    }

}

public class Extends_example1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("李双双"); 				// 父类定义
        stu.setAge(18); 						// 父类定义
        stu.setSchool("清华大学") ;	 		// 子类扩充方法
        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge()
                + "，学校：" + stu.getSchool());
    }
}
