package com.Opps;
import java.util.Scanner;

class Animal{
    String name;
}
//    - auto generate getters and setters
class Car{
    String Name;
    int wheel;
    String Frame;
    int Lights;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    public String getFrame() {
        return Frame;
    }
    public void setFrame(String frame) {
        Frame = frame;
    }
    public int getLights() {
        return Lights;
    }
    public void setLights(int lights) {
        Lights = lights;
    }
}
class Test{
    static int age;
    public static void increment() {
        age++;
        System.out.println("Current age is: " + age);

    }
}
class Temp {
    Temp() {
        this(5);
        System.out.println("The Default constructor");
    }

    Temp(int x) {
        this(5, 15);
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x * y);
    }
}

public class FEB23 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create class Animal with various variables and methods in it to demonstrate
        Animal animal = new Animal();

        // create multiples objects like dog, cat, cow, elephant etc and demomnstrate various approches to assign values to variables
        animal.name = "dog";
        animal.name = "cow";
        animal.name = "elephant";
        System.out.println(animal.name);
        System.out.println("enter animal name:- ");
        System.out.println(animal.name = scan.next());

        //-create static variable age and create a static method inside class named incrementAge() and inside increment the age whenever this method called (please keep break pointer and check what happens and value inside this method when you call from different objects
        Test.increment();

        //-demonstrate constructor chanining and create objects by passing no values, lesser value and more values
        new Temp();
    }
}
