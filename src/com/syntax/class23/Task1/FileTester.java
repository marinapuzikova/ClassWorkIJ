package com.syntax.class23.Task1;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WorldFile(), new PdfFile()};
        for (File file : files) {
            file.open();
            file.edit();
            file.close();
        }
    }
}
