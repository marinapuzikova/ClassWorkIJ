package com.syntax.class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        //we can't create an object of Phone because it has smth which is not complete
        Iphone iphone = new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCals();
        iphone.SendText();

        Samsung samsung = new Samsung();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.makePhoneCals();
        samsung.SendText();

        Phone[] phones = {new Iphone(), new Samsung()};
        for (Phone ph : phones) {
            ph.displayPictures();
            ph.makePhoneCals();
            ph.unlockPhone();
            ph.displayPictures();
        }
    }
}


