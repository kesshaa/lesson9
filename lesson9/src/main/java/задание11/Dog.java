package zad2;

public class Dog extends Pet {
    public Dog(){
        super(4);
    }

    @Override
    public  void sleep(){
        System.out.println("Сплю");
    }
    @Override
    public  void play(){
        System.out.println("Играю");
    }
    @Override
    public  void giveVoice(){
        System.out.println("Гав-гав");
    }
    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
