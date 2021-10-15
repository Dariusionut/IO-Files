package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        System.out.println("Basic IO files operations\n");

        File myFolder = new File("D:\\MyFolder");

        File myTextFile = new File(myFolder.getAbsolutePath() + "\\My textFile.txt");

//        Creating multiple directories
        FileOperations.mkDirs(new File("D:\\dir1\\dir2\\dir3\\dir4"));

//        Creating a single directory
        FileOperations.mkDir(myFolder);

//        Creating a file
        FileOperations.mkFile(myTextFile);

//        Writing into file
        FileOperations.fileWriter(myTextFile, "Hello there! My name is Darius Tinculescu!");

//        Reading from file
        FileOperations.fileReader(myTextFile);

//        Get file information
        FileOperations.getFileInfo(myTextFile);

//        Removing file
        FileOperations.removeFile(myTextFile);

    }
}
