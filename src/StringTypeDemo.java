public class StringTypeDemo {
    public static void main(String[] args) {
        String str1 = "www.baidu.com";
        System.out.println(str1);
        String str2 = new String("www.baidu.com");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = new String("www.baidu.com").intern();
        System.out.println(str1==str3);

        String strA = "www";
        strA+=".com";
        strA+=".cn";
        System.out.println(strA);

    }
}
