package Lesson13;

public class Main {
    public static void main(String[] args) {
        int a = 100000;
        long startPoint = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World");
        }
        long endPoint = System.currentTimeMillis();
        long result = endPoint - startPoint;
        System.out.println("Печать " + a + " кол-ва раз заняло у нас " + result);

        People son = new People("Вася", 12);
        System.out.println(son.getAge()< 16 ? "Нет, на фильм нельзя" : "Проходи в кино" );//Тернарный оператор

        // if (son.getAge() < 16){
          //  System.out.println("Нет, на фильм нельзя");
        //}else {
          //  System.out.println("Проходи в кино");
        //}


    }
}
