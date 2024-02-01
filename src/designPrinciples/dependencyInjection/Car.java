package designPrinciples.dependencyInjection;

import javax.print.attribute.standard.JobHoldUntil;

public class Car {

    String name;
    private TurboCharged e;
    private AudioSystem a;

    // public Car(String name, Engine e, AudioSystem a){
    //     this.name = name;
    //     this.e = e;
    //     this.a = a;
    // }

    // public Car(){
    //     this.name = "Swift";
    //     this.e = new NaturalAspirated();
    //     this.a = new Bose();
    // }

    public Car(String name){
        this.name = name;
        this.e = new TurboCharged();
        this.a = new Jbl();
    }

    

    public void display(){
        System.out.println("Name: " + this.name);
        e.type();
        e.capacity();
        a.brand();
        a.sub_woofer();
        a.tweeters();
        a.speakers();
    }

}
