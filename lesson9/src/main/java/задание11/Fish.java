package zad2;


public class Fish extends Pet {
    public Fish() {
        super(0);
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void play() {
        System.out.println("Играю");
    }

    @Override
    public void giveVoice() {
        System.out.println("Буль");
    }

}