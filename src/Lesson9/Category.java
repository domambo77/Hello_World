package Lesson9;

 public class Category{
    String categoryName;
    Tovar [] tovars = new Tovar[5];

    public Category(String categoryName, Tovar[] tovars) {
        this.categoryName = categoryName;
        this.tovars = tovars;
    }

    public Category() {
    }

     public  Category(String clothes, int i) {
     }
     public void Category1(String shoes, int i) {
     }
     public void Category2(String bugs, int i) {
     }

     public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

     public Tovar[] getTovars() {
         return tovars;
     }

     public void setTovars(Tovar[] tovars) {
         this.tovars = tovars;
     }
 }

