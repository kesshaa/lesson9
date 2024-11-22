package zad2;


public class Practicum {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();

       Dog dog = new Dog();
        dog.bringStick();

        Hamster hamster = new Hamster();
        hamster.hideFood();

       Fish fish = new Fish();
        fish.play();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}









