package Lesson16.Lesson16_StreamAPI;


public class Specialist {
    //Поля
    private String name;
    private Integer salary;
    private Specialty specialty;

    //Конструктор

    public Specialist(String name, Integer salary, Specialty specialty) {
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;

    }


    //Методы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
