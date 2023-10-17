package OverloadingConstructors;

public class StudentsIndo {
    
    private String firstname, lastname;
    private int age;
    private char sex;
    private String year;

    StudentsIndo(){
        firstname = "N/A";
        lastname = "N/A";
        age = 0;
        sex = 'O';
        year = "N/A";

    }

    StudentsIndo(String firstname, String lastname, int age, char sex, String year){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.year = year;

        System.out.println("Firstname : " + firstname);
        System.out.println("Firstname : " + lastname);
        System.out.println("Firstname : " + age);
        System.out.println("Firstname : " + sex);
        System.out.println("Firstname : " + year);
    }

    StudentsIndo(String firstname, String lastname, int age, char sex){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;

        
    }

    String getFirstname(){
        return firstname;
    }
}
 