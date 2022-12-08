package Lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main1 {
    public static void main(String[] args) {
        File startDir = new File("C:\\ jhdhdhd\\kdknn");
        if (!startDir.exists()){
                startDir.mkdirs();
        }

        File secondDir = new File("");
        File[] files = secondDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return (pathname.getName().endsWith(".jpeg")||pathname.getName().endsWith(".pdf"));

            }
        });
        for (File f:files ) {
            System.out.println(f.getName());
        }
        System.out.println();
    }
}
