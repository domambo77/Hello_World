package Lesson18;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IOFilesCopy ioFilesCopy = new IOFilesCopy();
        ioFilesCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "1exe");
        long finish = System.currentTimeMillis();
        System.out.println(" С библиотекой IO" + (finish - start));

        long start1 = System.currentTimeMillis();
        NIOFilesCopy nioFilesCopy = new NIOFilesCopy();
        nioFilesCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "2.exe");
        long finish1 = System.currentTimeMillis();
        System.out.println(" С библиотекой IO" + (finish1 - start1));

        long start2 = System.currentTimeMillis();
        ApacheCommonIOCopy apacheCommonIOCopy = new ApacheCommonIOCopy();
        apacheCommonIOCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "3.exe");
        long finish2 = System.currentTimeMillis();
        System.out.println(" С библиотекой IO" + (finish2 - start2));
    }
}
