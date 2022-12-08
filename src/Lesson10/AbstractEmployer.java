package Lesson10;

public abstract class AbstractEmployer implements Employer{
    String name;
    int age;
  //  public AbstractEmployer() {
    //    super();
    //}

    @Override
    public String getFullName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
