package Lesson16;

import Lesson16.Lesson16_StreamAPI.Old_Util;
import Lesson16.Lesson16_StreamAPI.Specialist;
import Lesson16.Lesson16_StreamAPI.Specialty;
import Lesson16.Lesson16_StreamAPI.Stream_Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Application_StreamAPI {
    public static void main(String[] args) {
        Specialist spec1 = new Specialist("Ivan", 10000, Specialty.BACKEND_DEVELOPER);
        Specialist spec2 = new Specialist("Petr", 9500, Specialty.FRONTED_DEVELOPER);
        Specialist spec3 = new Specialist("Igor", 9000, Specialty.BACKEND_DEVELOPER);
        Specialist spec4 = new Specialist("Fedor", 7000, Specialty.FRONTED_DEVELOPER);
        Specialist spec5 = new Specialist("Dima", 6500, Specialty.DEVOPS);

        List<Specialist> specialists = new ArrayList<>();
        specialists.add(spec1);
        specialists.add(spec2);
        specialists.add(spec3);
        specialists.add(spec4);
        specialists.add(spec5);

        Specialist specWithMinSalary1 = Old_Util.findWithMinSalary(specialists);
        Specialist specWithMinSalary2 = Stream_Util.findWithMinSalary(specialists);

        Stream_Util.printCollection(Stream_Util.filterBySpecialty(specialists, Specialty.BACKEND_DEVELOPER));
        Stream_Util.printCollection(Stream_Util.sortCollection(specialists));

        //System.out.println(specWithMinSalary1);здесь распечатаются только hashcode
        //System.out.println(specWithMinSalary2);

        Old_Util.printSpecialist(specWithMinSalary1);
        Old_Util.printSpecialist(specWithMinSalary2);

        System.out.println(Stream_Util.matchAllDevops(specialists));
        System.out.println(Stream_Util.anyMatchAllDevops(specialists));
        System.out.println(Stream_Util.matchAllSalaryMoreThan(specialists, 6000));


    }
}
