package Lesson20;


import java.util.Objects;

public  class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String teacherName;
    private String birthDate;
    private String startEd;
    private double markAv;
    private int age;

    private int paidForEd;
    private boolean isStudy;
    private int course;




    public Student(int id, String firstName, String secondName, String teacherName, String birthDate, String startEd, double markAv, int age, int paidForEd) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.teacherName = teacherName;
        this.birthDate = birthDate;
        this.startEd = startEd;
        this.markAv = markAv;
        this.age = age;
        this.paidForEd = paidForEd;
    }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getSecondName () {
            return secondName;
        }

        public void setSecondName (String secondName){
            this.secondName = secondName;
        }

        public String getTeacherName () {
            return teacherName;
        }

        public void setTeacherName (String teacherName){
            this.teacherName = teacherName;
        }

        public String getBirthDate () {
            return birthDate;
        }

        public void setBirthDate (String birthDate){
            this.birthDate = birthDate;
        }

        public boolean getStartEd () {
            return true;
        }

        public void setStartEd (String startEd){
            this.startEd = startEd;
        }

        public double getMarkAv () {
            return markAv;
        }

        public void setMarkAv ( double markAv){
            this.markAv = markAv;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }
        public int getPaidForEd () {
            return paidForEd;
        }

        public void setPaidForEd ( int paidForEd){
            this.paidForEd = paidForEd;
        }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
        isStudy = study;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", startEd='" + startEd + '\'' +
                ", markAv=" + markAv +
                ", age=" + age +
                ", paidForEd=" + paidForEd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (Double.compare(student.markAv, markAv) != 0) return false;
        if (age != student.age) return false;
        if (paidForEd != student.paidForEd) return false;
        if (isStudy != student.isStudy) return false;
        if (course != student.course) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(secondName, student.secondName)) return false;
        if (!Objects.equals(teacherName, student.teacherName)) return false;
        if (!Objects.equals(birthDate, student.birthDate)) return false;
        return Objects.equals(startEd, student.startEd);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (startEd != null ? startEd.hashCode() : 0);
        temp = Double.doubleToLongBits(markAv);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + age;
        result = 31 * result + paidForEd;
        result = 31 * result + (isStudy ? 1 : 0);
        result = 31 * result + course;
        return result;
    }
}
