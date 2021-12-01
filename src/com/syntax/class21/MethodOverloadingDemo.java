package com.syntax.class21;

public class MethodOverloadingDemo {
     /*  public void method(int num){
        System.out.println(num);
        System.out.println("Hello");
        System.out.println("Java");
      // can not overload by just changing the access modifier
    }*/


  /*  static void  method(int num){
        System.out.println(num);
        System.out.println("Hello");
        System.out.println("Java");
        // can not overload by just non access  modifier
    }*/

   /* int method(int num){
        System.out.println(num);
        System.out.println("Hello");
        System.out.println("Java");
        return num;
        // can not overload by just changing the return type
    }*/
   /* void method1(int num){
        System.out.println(num);
       System.out.println("Hello");
       System.out.println("Java");
       method names should be same
    }*/

    void method(int number){
        System.out.println(number);
    }

    void method(String name){
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }

    void method(String name,int num){
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }

    void method(int num,String name){
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.method(10);
        md.method("Sharif");
        md.method(10,"Sharif");
    }
}

