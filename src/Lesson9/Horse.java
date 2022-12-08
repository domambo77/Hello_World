package Lesson9;

public class Horse extends Animal{
    private boolean Jumping;
    private boolean sleepingAtStanding;
    private String color;

    public boolean isJumping() {
        return Jumping;
    }
    public void setJumping(boolean jumping) {
        Jumping = jumping;
    }
    public boolean isSleepingAtStanding() {
        return sleepingAtStanding;
    }
    public void setSleepingAtStanding(boolean sleepingAtStanding) {
        this.sleepingAtStanding = sleepingAtStanding;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

   public Horse(String eat, String makeNoise, String sleep) {
      super(eat, makeNoise, sleep);
    }

    @Override
    void eat() {
        System.out.println("Hay");
    }

    @Override
        void makeNoise() {
            System.out.println("Igogo");
        this.sleep();
        }

    @Override
    void sleep() {
        System.out.println("Horse is sleeping");
    }


}
