package Lesson13;

public class Main_2 {
    public static void main(String[] args) {
        TestSpeed ts = new TestSpeed();
        ts.setCapacityOfArrayList(10);
        ts.setValuesOfArrayList(10);
        System.out.println(ts.getExecutionTimeOfArrayList(ts.getCapacityOfArrayList(), ts.getValuesOfArrayList()));
    }
}
