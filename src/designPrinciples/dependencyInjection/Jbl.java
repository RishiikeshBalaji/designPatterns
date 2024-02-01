package designPrinciples.dependencyInjection;

public class Jbl implements AudioSystem{

    public void brand(){
        System.out.println("JBL");
    }

    public void sub_woofer(){
        System.out.println("JBL Sub Woofer");
    }

    public void tweeters(){
        System.out.println("JBL Tweeters");
    }

    public void speakers(){
        System.out.println("JBL Speakers");
    }

}
