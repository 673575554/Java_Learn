class Item{
    private long iid;
    private String title;
    private Subitem subitems[];
    public Item(long iid,String title){
        this.iid = iid;
        this.title = title;
    }
    //setter、getter、无参构造略
    public String getInfo(){
        return "【分类信息】iid："+this.iid+"、title："+this.title;
    }

    public void setSubitems(Subitem[] subitems) {
        this.subitems = subitems;
    }
    public Subitem[] getSubitems() {
        return this.subitems;
    }
}

class Subitem{
    private long sid;
    private String title;
    private Item item;
    public Subitem(long sid,String title){
        this.sid = sid;
        this.title = title;
    }
    public String getInfo(){
        return "【子分类信息】iid："+this.sid+"、title："+this.title;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public Item getItem() {
        return this.item;
    }
}

public class ArrayDemo_example3 {
    public static void main(String[] args) {
        //第一步：根据结构设置对象数据
        Item item = new Item(1,"图书");
        Subitem subitem1 = new Subitem(01,"Python指南");
        Subitem subitem2 = new Subitem(02,"Java指南");
        Subitem subitem3 = new Subitem(03,"Vue指南");
        item.setSubitems(new Subitem[]{subitem1,subitem2,subitem3});
        subitem1.setItem(item);
        subitem2.setItem(item);
        subitem3.setItem(item);

        //第二步：根据要求获取数据
        System.out.println(item.getInfo());
        for(int x=0;x<item.getSubitems().length;x++){
            System.out.println("\t|-"+item.getSubitems()[x].getInfo());
        }

    }
}
