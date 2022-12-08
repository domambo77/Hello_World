package Lesson9;

public class Cat extends Animal{
    private boolean canCatchMouses;
    private boolean canScratches;

    public boolean isCanCatchMouses() {
        return canCatchMouses;
    }
    public void setCanCatchMouses(boolean canCatchMouses) {
        this.canCatchMouses = canCatchMouses;
    }
    public boolean isCanScratches() {
        return canScratches;
    }
    public void setCanScratches(boolean canScratches) {
        this.canScratches = canScratches;
    }
    public Cat(String eat, String makeNoise, String sleep) {
        super(eat, makeNoise, sleep);
    }
    @Override
    void eat() {
        System.out.println("Fish");
    }
    @Override
    void makeNoise() {
        System.out.println("meow");
    }
    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }
}
