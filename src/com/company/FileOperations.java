package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void mkDir(File file) {

        if (file.mkdir()) {
            System.out.println("Directory " + file.getName() + " has been created to: " + file.getAbsolutePath());
        } else {
            System.out.println("Directory " + file.getName() + " cannot be created!");
        }
    }

    public static void mkDirs(File file) {

        if (file.mkdirs()) {
            System.out.println("Directories created: " + file.getAbsolutePath());
        } else {
            System.out.println("Directories " + file.getAbsolutePath() + " already exist!");
        }
    }

    public static void mkFile(File file) {

        try {
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " has been created to " + file.getAbsolutePath());
            } else {
                System.out.println("Cannot create file: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWriter(File file, String text) {
        try {
            if (file.exists()) {
                FileWriter writer = new FileWriter(file);

                if (file.canWrite()) {
                    writer.write(text);
                    writer.close();
                    System.out.println("File " + file.getName() + " updated!");
                } else {
                    System.out.println("File " + file.getName() + " is not writable!");
                }
            } else {
                System.out.println("File " + file.getAbsolutePath() + "does not exist!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileReader(File file) {

        try {
            if (file.canRead()) {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            } else {
                System.out.println("File " + file + " is not readable!");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(File file) {
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size " + file.length() + " bytes");
            System.out.println("Last update: " + file.lastModified());
        } else {
            System.out.println("File does not exist!");
        }
    }

    public static void removeFile(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File " + file.getName() + " has been removed!");
            } else {
                System.out.println("Cannot remove " + file.getName());
            }
        } else {
            System.out.println(file.getAbsolutePath() + " not found!");
        }
    }

}

