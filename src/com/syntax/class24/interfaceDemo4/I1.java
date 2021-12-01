package com.syntax.class24.interfaceDemo4;

public interface I1 {
    int age=18;
    void method();
    static void method2(){
        System.out.println("Im method2 from Interface 1");
    }
}
interface I2{
    int age=28;
    void method();
    static void method2(){
        System.out.println("Im method2 from Interface 2");
    }
}
class Test implements I1,I2{
    @Override
    public void method() {//single implementation works for all the methods of interfaces
        System.out.println(I1.age);// we need specify which age we want to print.
                                // We have access to age because interfaces is implicitly static
        System.out.println("I will be called for both the methods from both Interfaces");
    }
}
class Main{
    public static void main(String[] args) {
        I1 i1=new Test();
        i1.method();
        I2 i2=new Test();
        i2.method();
        I1.method2();//for static, we have to call static method for each interface
        I2.method2();
    }
}
