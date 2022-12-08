package Lesson8;

public class Contact {
    //1.Поля
    private String name;
    private String email;
    private String phoneNumber;

    //2.Конструкторы

    public Contact(String name){
        this.name = name;
    }
    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }
    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // 3 Методы


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
    return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
}
