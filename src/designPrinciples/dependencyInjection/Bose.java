package designPrinciples.dependencyInjection;

public class Bose implements AudioSystem{

    public void brand(){
        System.out.println("Bose");
    }

    public void sub_woofer(){
        System.out.println("Bose Sub Woofer");
    }

    public void tweeters(){
        System.out.println("Bose Tweeters");
    }

    public void speakers(){
        System.out.println("Bose Speakers");
    }

}
