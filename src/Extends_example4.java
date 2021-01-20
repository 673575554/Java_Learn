/**
 统计字符串“want you to know one thing”中字母n和字母o出现的次数。
 * */

class StringCount{
    public int[] Count(String str) {
        int countData [] = new int[2];
        char [] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 'o'){
                countData[0]+=1;
            }
            if (data[i] == 'n'){
                countData[1]+=1;
            }
        }
        return countData;
    }
}

public class Extends_example4 {
    public static void main(String[] args) {
        StringCount s1 = new StringCount();
        int[] count = s1.Count("want you to know one thing");
        System.out.println("n出现的次数："+count[0]+",o出现的次数"+count[1]);
    }
}
