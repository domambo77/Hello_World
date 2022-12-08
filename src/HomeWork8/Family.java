package HomeWork8;

public class Family {
    public static void main(String[] args) {
        /**Требования:
         Создать класс Human.
         •  Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
         •  Добавить в класс конструктор public Human(String name, boolean sex, int age).
         •  Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
         •  Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
         •  Выведи созданные объекты на экран
         public String toString() {
         String text = "";
         text += "Имя: " + this.name;
         text += ", пол: " + (this.sex ? "мужской" : "женский");
         text += ", возраст: " + this.age;
         if (this.father != null) {
         text += ", отец: " + this.father.name;
         }if (this.mother != null) {
         text += ", мать: " + this.mother.name;
         }return text;
         } это переопределенный метод toString(), для печати используйте его * */
        /**Human brother = new Human("Дима", true, 47);
        Human brother1 = new Human("Максим", true, 46);
        Human sister = new Human("Люда", false, 36);
        Human sister1 = new Human("Нелля", false, 33);

        Human father = new Human("Валера", true, 60, father, mother);
        Human father1 = new Human("Игорь", true, 63, father, mother);
        Human father2 = new Human("Костя", true, 66, father, mother);
        Human mother = new Human("Елена", false, 61, father, mother);
        Human mother1 = new Human("Вика", false, 59, father, mother);

        System.out.println(brother);
        System.out.println(brother1);
        System.out.println(sister);
        System.out.println(sister1);

        System.out.println(father);
        System.out.println(father1);
        System.out.println(father2);
        System.out.println(mother);
        System.out.println(mother1);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;





            public String toString() {
                String text = "";
                text += "Имя: " + this.name;
                text += ", пол: " + (this.sex ? "мужской" : "женский");
                text += ", возраст: " + this.age;

                if (this.father != null) {
                    text += ", отец: " + this.father.name;
                }
                if (this.mother != null) {
                    text += ", мать: " + this.mother.name;
                }

                return text;
            }
         }*/
         }
}

