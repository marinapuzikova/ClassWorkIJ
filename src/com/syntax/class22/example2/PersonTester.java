package com.syntax.class22.example2;

public class PersonTester {
    public static void main(String[] args) {
       /* Person person=new Teacher("Asghar");//i can do this
        person.eat();*/
        // Teacher teacher=new Person("Person");//this doesnt work->not every person in real life is a teacher

        Person person1 = new Student("Mykl");
        Person[] persons = {new Student("Farhad")
                , new Employee("Naiya"), new Teacher("Asel")};

        for (Person person2 : persons //if we only accessing the value we should always go for advanced loop
        ) {
            person2.performDailyTasks();// i will see all the methods
            //
            if (person2 instanceof Teacher) {
                ((Teacher) person2).designClasses();
            }
        }
    }
}
