package com.syntax.class23.abstraction;

public abstract class Phone {
    void makePhoneCals() {
        System.out.println("Making a call");
    }

    void SendText() {
        System.out.println("Sending a text");
    }

    abstract void displayPictures();//if we have abstract method class should be an abstract as well
    abstract void unlockPhone();
}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone uses Photos app to display the pictures");//providing implementation
    }

    @Override
    void unlockPhone() {
        System.out.println("Use FaceId to unlock the phone");
    }
}
class Samsung extends Phone{
@Override
    void displayPictures() {
            System.out.println("Samsung uses Gallery app to display the pictures");//providing implementation

            }
@Override
    void unlockPhone() {
            System.out.println("Use fingerprints to unlock the phone");
            }
        }
