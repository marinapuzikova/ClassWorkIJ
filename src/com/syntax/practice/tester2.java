package com.syntax.practice;

public class tester2 {
    public static void main(String[] args) {

      values v=new values();
      pr obj=new pr(v.num1,v.num2,v.str);
        System.out.println(obj.sum());
        int num3=obj.sum();
        obj.sum2();
        String var="yan";
        String var1="marina";
        int b=5;
        obj.compare(num3,var);
        obj.compare(b,var1);

        myMethods my=new myMethods();
        my.param(v.num1,v.num2,v.num3);

        int num5 = my.compare(v.num1,v.num2);
        System.out.println(my.b(num5));


    }
}
