package Lesson10;

public class JavaDeveloper extends AbstractEmployer {

    @Override
    public void doWork() {
        System.out.println("Пишу код на Java");
    }

    @Override
    public void keepSalary() {
        System.out.println("Получаю 1000$");
    }
}
