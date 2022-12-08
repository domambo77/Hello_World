package Lesson9;

public class Dog extends Animal{

    private boolean security;
    private boolean canfindDrugs;

    public boolean isSecurity() {
        return security;
    }
    public void setSecurity(boolean security) {
        this.security = security;
    }
    public boolean isCanfindDrugs() {
        return canfindDrugs;
    }
    public void setCanfindDrugs(boolean canfindDrugs) {
        this.canfindDrugs = canfindDrugs;
    }
    public Dog(String eat, String makeNoise, String sleep) {
      super(eat, makeNoise, sleep);
    }

    @Override
    void eat() {
        System.out.println("Bone");

    }

    @Override
    void makeNoise() {
        System.out.println("bark");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping");
    }
}
