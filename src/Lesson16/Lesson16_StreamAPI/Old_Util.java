package Lesson16.Lesson16_StreamAPI;

import java.util.List;

public class Old_Util {
    //Поиск специалиста с минимальной зарплатой
    public static Specialist findWithMinSalary(List<Specialist>list){
        Specialist specialist = list.get(0);
        for (int i = 0; i <list.size() ; i++) {
            if(specialist.getSalary() < list.get(i).getSalary()){
                specialist = list.get(i);
            }
        }
        return specialist;
    }
    public static void printSpecialist(Specialist specialist){
        System.out.println(specialist.getName() + " " + specialist.getSalary() + " " + specialist.getSpecialty());
    }
}
