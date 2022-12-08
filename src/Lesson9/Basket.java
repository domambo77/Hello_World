package Lesson9;

 public class Basket {

    Tovar [] buyTovars = new Tovar[5];

    public Basket(Tovar[] buyTovars) {
        this.buyTovars = buyTovars;
    }

    public Basket() {
    }

    public Tovar[] getBuyTovars() {
        return buyTovars;
    }

    public void setBuyTovars(Tovar[] buyTovars) {
        this.buyTovars = buyTovars;
    }

}

