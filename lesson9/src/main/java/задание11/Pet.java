package zad2;

public abstract class  Pet {
    protected int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public abstract void sleep();

    public abstract void play();

    public abstract void giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }
}
