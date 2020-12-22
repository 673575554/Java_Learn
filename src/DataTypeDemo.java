public class DataTypeDemo {
    public static void main(String [] args){
        int x = 10;
        System.out.println(x*x);
        boolean y = false;
        if (y != true){
            System.out.println("yes");
        }

        int a=2;
        int b=2;
        b = a++;
        System.out.println(a);
        System.out.println(b);

        int i = 1;
        int j = i++;
        if ((i==(++j))&&((i++)==j)){
            i+=j;
        }
        System.out.println("i="+i);

    }
}
