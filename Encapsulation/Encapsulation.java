package Encapsulation;

public class Encapsulation {
    private String firstname, lastname;
    private char gender;
    private int age;

    Encapsulation(String firstname, String lastbane, char gender, int age){
        this.firstname = firstname;
        this.lastname = lastbane;
        this.gender = gender;
        this.age = age;

    }

    void greet(){
        System.out.println("Welcome, "+ firstname +" "+ lastname );
    }

    void afterGreet(){
        System.out.println("Here's your provided information");
        System.out.println("fullname: " + firstname + " " + lastname);
        System.out.println("Sex: " + gender);
        System.out.println("Age: " + age);

    }

}
