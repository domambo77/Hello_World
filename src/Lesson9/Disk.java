package Lesson9;

public abstract class Disk {
    private String name;//Название фильма
    private int year;//Год выпуска

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void printInfo();
}
