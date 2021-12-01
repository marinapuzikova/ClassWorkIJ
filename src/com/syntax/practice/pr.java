package com.syntax.practice;

public class pr {
   public int x;
   public int y;
   public String str;
    pr(){

    }
    pr(int x,int y,String str){
        this.str=str;
        this.x=x;
        this.y=y;
    }
    public int sum(){
        return this.x+this.y;
    }
    public void sum2(){
        int num3=this.x+this.y;
        System.out.println(num3);
    }
    public void compare(int n,String str2){
        if(n>10){
            System.out.println("i know job");
        }else{
            System.out.println("i dont know job");
        }
        if(str2.equals(this.str)){
            System.out.println("hello");
        }else{
            System.out.println("bye");
        }
    }


}

