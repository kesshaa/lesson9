package zad2;



public class Cat extends Pet {
    public Cat(){
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
        System.out.println("Мяу");
    }
    public void catchMouse(){
        System.out.println(" Поймала мышку!");
    }
}
