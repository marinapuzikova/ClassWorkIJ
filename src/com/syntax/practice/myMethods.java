package com.syntax.practice;

public class myMethods {


    public void param(int n1,int n2,int n3){
        int n4=(n1+n2+n3);
        System.out.println(n4);
    }
    public void meth(int n1,int n2){
        int n3=n1+n2;
        System.out.println(n3);
    }
    public int compare(int n1,int n2){
        return n1+n2;
    }
    public boolean b(int n1){
        if(n1>10){
            return true;
        }else {
            return false;
        }
    }
}
