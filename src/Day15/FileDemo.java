package Day15;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("Output.txt");

        System.out.println(
            "Exists: " + file.exists()
        );

        System.out.println(
            "Name: " + file.getName()
        );

        System.out.println(
            "Path: " + file.getAbsolutePath()
        );

        System.out.println(
            "Is File: " + file.isFile()
        );

    }
}