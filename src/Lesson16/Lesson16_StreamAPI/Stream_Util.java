package Lesson16.Lesson16_StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Util {
    //Поиск специалиста с минимальной зарплатой
    public static Specialist findWithMinSalary(List<Specialist> list){
        return list.stream()
                .min(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }
    //Поиск специалиста с максимальной зарплатой

    public static Specialist findWithMaxSalary(List<Specialist>list){
        return list.stream()
                .max(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }
    //Поиск по специальности
    public static List<Specialist> filterBySpecialty(List<Specialist> list, Specialty specialty){
        return list.stream()
                .filter(x -> x.getSpecialty().equals(specialty))
                .collect(Collectors.toList());
    }
    //метод для печати
    public static void printCollection(List<Specialist>list){
        list.forEach(specialist -> System.out.println(specialist.getName() + " "
                + specialist.getSalary() + " " + specialist.getSpecialty()));
    }

    //Сортировка например по именам
    public static List<Specialist> sortCollection(List<Specialist> list){
        return list.stream()
                .sorted(Comparator.comparing(Specialist::getName))
                .collect(Collectors.toList());
    }
    //Поиск по наличию используя boolean
    public static boolean matchAllDevops(List<Specialist> list){
        return list.stream()
                .allMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVOPS));
    }

    public static boolean anyMatchAllDevops(List<Specialist> list){
        return list.stream()
                .anyMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVOPS));
    }
     //поиск по зарплате
    public static boolean matchAllSalaryMoreThan(List<Specialist> list, Integer count){
        return list.stream()
                .allMatch(specialist -> specialist.getSalary().compareTo(count) > 0);
    }

}
