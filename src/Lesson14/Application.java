package Lesson14;

import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2,2.5,"Russia", 2004);
        Coin coin2 = new Coin(5, 3.5, "Belarus", 2007);
        Coin coin3 = new Coin(5,3.5,"Belarus", 2007);
        Coin coin4 = new Coin(10,1.5,"USA",1995);
        Coin coin5 = new Coin(15,3,"Germany",2009);

        TreeSet<Coin> hashSet = new TreeSet<>();
        hashSet.add(coin1);
        hashSet.add(coin2);
        hashSet.add(coin3);
        hashSet.add(coin4);
        hashSet.add(coin5);


        for (Coin c: hashSet) {
            System.out.println(c);
        }
        System.out.println();

    }
}
