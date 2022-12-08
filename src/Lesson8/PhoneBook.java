package Lesson8;

public class PhoneBook {
    //1. Поля
    private Contact[] contacts = new Contact[100];

    // 2. Конструкторы

    //3. Методы
    public void addContact(Contact contact){
       // for (Contact c: contacts) {
         //   c = contact;
        //}

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null){
            contacts[i] = contact;
            break;}
        }


    }
    public void search(String forSearch){
        for (Contact c: contacts) {
            if (c != null && c.getName().contains(forSearch)){
                System.out.println(c.getName());
            }
        }
    }
    public void edit(String forSearch, String forEdit){
        for(Contact c: contacts){
            if (c!= null && c.getName().contains(forSearch)){
                c.setName(forEdit);
                System.out.println(c.getName());
            }
        }
    }
    public void delete(String forSearch){
        //  for (Contact c: contacts) {
          //  if(c != null && c.getName().contains(forSearch)){
            //    c = null;
        //   }
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] != null && contacts[i].getName().contains(forSearch)){
                contacts[i] = null;
        }
        }
    }
}
