package com.syntax.class23.Task1;

public abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method
    while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
    specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
     to open .doc file we need Microsoft word to be installed etc
     */
    void edit() {
        System.out.println("Editing file");
    }
    void close(){
        System.out.println("Closing file");
    }

    abstract void open();
}
class JavaFile extends File{
    @Override
    void open(){
        System.out.println("To open Java file we need notepad++ or sublime text");
    }
}
class WorldFile extends File{

    @Override
    void open(){
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("To open pdf file we need to have adobe reader");

    }
}