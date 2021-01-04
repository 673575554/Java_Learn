class Member2 {
    private String mid ;
    private String name ;
    private Role roles [] ;
    public Member2(String mid, String name) {
        this.mid = mid ;
        this.name = name ;
    }
    public void setRoles(Role roles[]) {
        this.roles = roles ;
    }
    public Role [] getRoles() {
        return this.roles ;
    }
    public String getInfo() {
        return "【用户信息】mid = " + this.mid + "、name = " + this.name ;
    }
}
class Role {
    private long rid ;
    private String title ;
    private Member2 members [] ;
    private Privilege privileges [] ;
    public Role(long rid,String title) {
        this.rid = rid ;
        this.title = title ;
    }
    public void setMembers(Member2 members []) {
        this.members = members ;
    }
    public Member2[] getMembers() {
        return this.members ;
    }
    public void setPrivileges(Privilege privileges []) {
        this.privileges = privileges ;
    }
    public Privilege [] getPrivileges() {
        return this.privileges ;
    }
    public String getInfo() {
        return "【角色信息】rid = " + this.rid + "、title = " + this.title ;
    }
}
class Privilege {
    private long pid ;
    private String title ;
    private Role role ;
    public Privilege(long pid,String title) {
        this.pid = pid ;
        this.title = title ;
    }
    public void setRole(Role role) {
        this.role = role ;
    }
    public Role getRole() {
        return this.role ;
    }
    public String getInfo() {
        return "【权限信息】pid = " + this.pid + "、title = " + this.title ;
    }
}

public class ArrayDemo_example5 {
    public static void main(String[] args) {
        // 第一步：根据结构设置对象数据
        Member2 memA1 = new Member2("mldn-a","张三") ;
        Member2 memB1 = new Member2("mldn-b","李四") ;
        Role roleA = new Role(1L,"系统配置") ;
        Role roleB = new Role(2L,"备份管理") ;
        Role roleC = new Role(3L,"人事管理") ;
        Privilege priA = new Privilege(1000L,"系统初始化") ;
        Privilege priB = new Privilege(1001L,"系统系统还原") ;
        Privilege priC = new Privilege(1002L,"系统环境修改") ;
        Privilege priD = new Privilege(2000L,"备份员工数据") ;
        Privilege priE = new Privilege(2001L,"备份部门数据") ;
        Privilege priF = new Privilege(2002L,"备份公文数据") ;
        Privilege priG = new Privilege(3000L,"增加员工") ;
        Privilege priH = new Privilege(3001L,"编辑员工") ;
        Privilege priI = new Privilege(3002L,"浏览员工") ;
        Privilege priJ = new Privilege(3003L,"员工离职") ;
        // 增加角色与权限的对应关系
        roleA.setPrivileges(new Privilege[] {priA,priB,priC}) ;
        roleB.setPrivileges(new Privilege[] {priD,priE,priF}) ;
        roleC.setPrivileges(new Privilege[] {priG,priH,priI,priJ}) ;
        // 增加权限与角色对应
        priA.setRole(roleA) ;
        priB.setRole(roleA) ;
        priC.setRole(roleA) ;
        priD.setRole(roleB) ;
        priE.setRole(roleB) ;
        priF.setRole(roleB) ;
        priG.setRole(roleC) ;

        priH.setRole(roleC) ;
        priI.setRole(roleC) ;
        priJ.setRole(roleC) ;
        // 增加用户与角色的对应关系
        memA1.setRoles(new Role[] {roleA,roleB}) ;
        memB1.setRoles(new Role[] {roleA,roleB,roleC}) ;
        roleA.setMembers(new Member2[] {memA1,memB1}) ;
        roleB.setMembers(new Member2[] {memA1,memB1}) ;
        roleC.setMembers(new Member2[] {memB1}) ;
        // 第二步：根据要求获取数据
        System.out.println("------ 通过用户查找信息 ------") ;
        System.out.println(memB1.getInfo()) ;
        for (int x = 0 ; x < memB1.getRoles().length ; x ++) {
            System.out.println("\t|- " + memB1.getRoles()[x].getInfo()) ;
            for (int y = 0 ; y < memB1.getRoles()[x].getPrivileges().length ; y ++) {
                System.out.println("\t\t|- " + memB1.getRoles()[x].getPrivileges()[y].getInfo()) ;
            }
        }
        System.out.println("------ 通过角色查找信息 ------") ;
        System.out.println(roleB.getInfo()) ;
        System.out.println("\t|- 浏览此角色下的所有权限信息：") ;
        for (int x = 0 ; x < roleB.getPrivileges().length ; x ++) {
            System.out.println("\t\t|- " + roleB.getPrivileges()[x].getInfo()) ;
        }
        System.out.println("\t|- 浏览此角色下的所有用户信息：") ;
        for (int x = 0 ; x < roleB.getMembers().length ; x ++) {
            System.out.println("\t\t|- " + roleB.getMembers()[x].getInfo()) ;
        }
        System.out.println("------ 通过权限查找信息 ------") ;
        System.out.println(priA.getInfo()) ;
        for (int x = 0 ; x < priA.getRole().getMembers().length ; x++) {
            System.out.println("\t|- " + priA.getRole().getMembers()[x].getInfo()) ;
        }
    }
}
