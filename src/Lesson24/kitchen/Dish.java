package Lesson24.kitchen;

public enum Dish {
    FISH, STEAK, SOUP, JUICE, WATER;

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
