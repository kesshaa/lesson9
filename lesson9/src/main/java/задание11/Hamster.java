package zad2;




public class Hamster extends Pet {
    public Hamster() {
        super(4);
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
        System.out.println("Пищит");
    }

    public void hideFood() {
        System.out.println(" Вся еда — в щёчках!");
    }
}