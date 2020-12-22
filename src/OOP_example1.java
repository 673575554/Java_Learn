/**
 * 编写并测试一个代表地址的Address类
 * 地址信息由国家、省份、城市、街道、邮编组成
 * 可以返回完整的地址信息
 */

class Address{
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipCode;

    public Address(){};
    public Address(String country,String province,String city,String street,String zipCode){
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    //setter、getter略
    public String getInfo(){
        return "国家："+this.country+"、省份："+this.province+"、城市："+this.city+"、街道："+this.street+"、邮编："+this.zipCode;
    }
}

public class OOP_example1 {
    public static void main(String[] args) {
        System.out.println(new Address("中国","湖南","长沙","岳麓大道","0731").getInfo());
    }
}
