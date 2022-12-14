package Lesson24.ad;

public class Advertisement {
    private final Object content;
    private final String name;
    private final long initialAmount;
    private int hits;
    private final int duration;
    private long amountPerOneDisplaying;



    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;

        if (hits > 0) {
            amountPerOneDisplaying = initialAmount / hits;
        }
    }

    public Object getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public long getInitialAmount() {
        return initialAmount;
    }

    public int getHits() {
        return hits;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate(){
        if (hits < 0) {
            throw new UnsupportedOperationException();
        }
        hits--;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setAmountPerOneDisplaying(long amountPerOneDisplaying) {
        this.amountPerOneDisplaying = amountPerOneDisplaying;
    }

    public boolean isActive() {
        return hits > 0;
    }

  /**  @Override
    public String toString() {
        return "Advertisement content: " + content +
                ", name: " + name +
                ", initialAmount:  " + initialAmount +
                ", hits: " + hits +
                ", duration:  " + duration +
                ", amountPerOneDisplaying: " + amountPerOneDisplaying;
    }*/
}
