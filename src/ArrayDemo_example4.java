class Member1 {
    private String mid;
    private String name;
    private Product products[];
    public Member1(String mid, String name){
        this.mid = mid;
        this.name = name;
    }
    public String getInfo(){
        return "【用户信息】mid："+this.mid+"、name："+this.name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
}


class Product{
    private long pid;
    private String title;
    private double price;
    private Member1 members[];
    public Product(long pid,String title,double price){
        this.pid = pid;
        this.title = title;
        this.price = price;
    }
    public String getInfo(){
        return "【商品信息】pid："+this.pid+"、title："+this.title+"、price："+this.price;
    }

    public void setMembers(Member1[] members) {
        this.members = members;
    }
    public Member1[] getMembers() {
        return members;
    }
}

public class ArrayDemo_example4 {
    public static void main(String[] args) {
        //第一步：根据结构设置对象数据
        Member1 memberA = new Member1("01","张三");
        Member1 memberB = new Member1("02","李四");
        Product productA = new Product(1L,"第一个商品",9.9);
        Product productB = new Product(2L,"第二个商品",99);
        Product productC = new Product(3L,"第三个商品",999);
        memberA.setProducts(new Product[]{productA,productB});
        memberB.setProducts(new Product[]{productA});
        productA.setMembers(new Member1[]{memberA,memberB});
        productB.setMembers(new Member1[]{memberA});
        productC.setMembers(new Member1[]{memberB});
        //第二步：根据要求获取数据
        System.out.println("--------------------根据用户查看浏览商品信息--------------------");
        System.out.println(productA.getInfo());
        for (int x=0;x<productA.getMembers().length;x++){
            System.out.println("\t|-"+productA.getMembers()[x].getInfo());
        }
        System.out.println("--------------------根据商品找到浏览记录信息--------------------");
        System.out.println(memberA.getInfo());
        for(int x=0;x<memberA.getProducts().length;x++){
            System.out.println("\t|-"+memberA.getProducts()[x].getInfo());
        }


    }
}
