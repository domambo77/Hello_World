package Lesson13;

import java.util.ArrayList;

public class TestSpeed {
    //поля
    private int capacityOfArrayList;
    private int valuesOfArrayList;

    //Конструкторы
    public TestSpeed(){

    }

    public TestSpeed(int capacityOfArrayList, int valuesOfArrayList) {
        this.capacityOfArrayList = capacityOfArrayList;
        this.valuesOfArrayList = valuesOfArrayList;
    }
    //Методы


    public int getCapacityOfArrayList() {
        return capacityOfArrayList;
    }

    public void setCapacityOfArrayList(int capacityOfArrayList) {
        this.capacityOfArrayList = capacityOfArrayList;
    }

    public int getValuesOfArrayList() {
        return valuesOfArrayList;
    }

    public void setValuesOfArrayList(int valuesOfArrayList) {
        this.valuesOfArrayList = valuesOfArrayList;
    }

    public long getExecutionTimeOfArrayList(int capacityOfArrayList, int valuesOfArrayList){
        ArrayList<Integer> numbers = new ArrayList<>(capacityOfArrayList);
        long startPoint = System.currentTimeMillis();
        int num = 0;
        for (int i = 0; i <valuesOfArrayList ; i++) {
            numbers.add(i, num);
            num++;
        }

        long endPoint = System.currentTimeMillis();
        long result = endPoint - startPoint;
        return result;
    }
}

