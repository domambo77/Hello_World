package Lesson24.kitchen;

public enum Dish {
    FISH(25), STEAK(30), SOUP(15), JUICE(5), WATER(3);
private final int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){
        String result = "";
        for (Dish dish: Dish.values()) {
            if("".equals(dish)){
                result += dish.name();
            }else {
                result += "," + dish.name();
            }
        }
        return result;
    }
}
