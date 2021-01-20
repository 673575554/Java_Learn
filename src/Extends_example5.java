/**
 建立一个可以实现整型数组的操作类，在里面可以操作的数组大小由外部来决定，并且需要提供如下功能：
 • 进行数据的增加（如果数据满了则无法增加）
 • 实现数组的容量扩充、取得数组全部内容
 完成之后再派生出两个子类：
 数组排序类：返回的数据必须是排序后的结果；
 数组反转类：可以实现内容的首尾交换；
 * */

class Array{     //数组操作类
    private int[] data;    //整型数组
    private int foot;    //数组索引控制
    public Array(int len){
        if (len>0){
            this.data = new int[len];    //开辟数组
        }else {
            System.out.println("输入的长度不正确");
        }
    };

    public int[] getData() {
        return this.data;
    }
    public boolean add(int num){
        if (this.foot<data.length){
            this.data[this.foot++] = num;
            return true;
        }
        return false;
    };
    public void increse(int num){
        int[] newData = new int[this.data.length+num];
        System.arraycopy(this.data,0,newData,0,this.data.length);
        this.data = newData;
    }
}


class SortArray extends Array{
    public SortArray(int len) {
        super(len);
    }
    @Override
    public int[] getData(){
        java.util.Arrays.sort(super.getData());
        return super.getData();
    }
}


public class Extends_example5 {
    public static void main(String[] args) {
        SortArray a1 = new SortArray(2);
        System.out.println(a1.add(1));
        System.out.println(a1.add(2));
        System.out.println(a1.add(3));
        a1.increse(1);
        System.out.println(a1.add(3));
        System.out.println(a1.add(4));
        int[] x = a1.getData();
        for (int temp:x){
            System.out.println(temp+'、');
        }

    }
}
