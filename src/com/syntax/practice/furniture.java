package com.syntax.practice;

public class furniture {
    furniture(){
        System.out.println("furniture");
    }
}
class chair extends furniture{
    chair(){
        super();
        System.out.println(" chair");
    }
}
class MainClass{
    public static void main(String[] args) {
        chair d=new chair();
    }
}