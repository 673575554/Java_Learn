interface IEat{
    public void get();
}

class EatReal implements IEat{
    @Override
    public void get(){
        System.out.println("【真实客户】：得到一份食物");
    }
}

class EatProxy implements IEat{
    private IEat eat;
    public EatProxy(IEat eat){
        this.eat = eat;
    }
    public void prepare(){
        System.out.println("【代理人员】：1、购买食材。");
        System.out.println("【代理人员】：2、处理食材。");
    }
    public void clear(){
        System.out.println("【代理人员】：3、收拾碗筷。");
    }

    @Override
    public void get(){
        this.prepare();
        this.eat.get();
        this.clear();
    }
}


public class Interface_Proxy {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new EatReal());
        eat.get();
    }
}
