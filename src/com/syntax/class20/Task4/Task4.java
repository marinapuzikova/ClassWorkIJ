package com.syntax.class20.Task4;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void method(){
        System.out.println("void method");
    }
    private int method(int num){
        System.out.println("int method");
        return 5;
    }
   private int method(String str){
        System.out.println("str method");
        return 5;// it's useless in this example,but if we don't put any return we will get an error
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.method();
        task4.method(5);
        task4.method("Hello");
    }
}
