interface Ifood{
    public void eat();
}

class Bread implements Ifood{
    @Override
    public void eat(){
        System.out.println("吃面包");
    }
}

class Milk implements Ifood{
    @Override
    public void eat(){
        System.out.println("喝牛奶");
    }
}

class Factory{
    public static Ifood getInstance(String className){
        if ("bread".equals(className)){
            return new Bread();
        }else if ("milk".equals(className)){
            return new Milk();
        }else{
            return null;
        }

    }
}

public class Interface_Factory {
    public static void main(String[] args) {
        Ifood food = Factory.getInstance("milk");
        food.eat();
    }
}
