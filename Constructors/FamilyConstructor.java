package Constructors;

import java.util.Scanner;

public class FamilyConstructor {
    String firstname, lastname;
    int age;
    char sex, middleName;

    private FamilyConstructor(String firstname, String lastname, int age, char sex, char middleName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middleName = middleName;
        this.age = age;
        this.sex = sex;
    }

    public static FamilyConstructor createFamilyMember(String fullName, Scanner s) {
        String[] names = fullName.split(" ");
        String firstname = names[0];
        String lastname = names[names.length - 1];

        System.out.print("Enter middlename for " + firstname + " " + lastname + ": ");
        char middleName = s.nextLine().charAt(0);

        System.out.print("Enter age for " + firstname + " " + lastname + ": ");
        int age = Integer.parseInt(s.nextLine());

        System.out.println("Type M for 'Male' and F for 'Female'");
        System.out.print("Enter gender for " + firstname + " " + lastname + ": ");
        char sex = s.nextLine().charAt(0);

        return new FamilyConstructor(firstname, lastname, age, sex, middleName);
    }

    void introduceFamily() {
        System.out.println("Family");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("MiddleName: " + middleName);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }

    static void cloresFam(String[][] info, char[][] middleNames, int[][] ages, char[][] sexes, Scanner s) {
        boolean found = false;
        String infoUser[][] = new String[5][5];
        
        while (!found) {
            for (int i = 0; i < info.length; i++) {
                System.out.println("Family #" + (i + 1));
                System.out.print("Firstname : ");
                infoUser[i][0] = s.nextLine();

                System.out.print("Lastname : ");
                info[i][1] = s.nextLine();
                
                System.out.print("Middlename : ");
                middleNames[i][0] = s.nextLine().charAt(0);

                System.out.print("Age : ");
                ages[i][0] = Integer.parseInt(s.nextLine());

                System.out.println("Type M for 'Male' and F for 'Female'");
                System.out.print("Gender : ");
                sexes[i][0] = s.nextLine().charAt(0);

                if (info[i][0].equals(info[i][0])
                        && info[i][1].equals(info[i][1])
                        && middleNames[i][0] == middleNames[i][0]
                        && ages[i][0] == ages[i][0]
                        && sexes[i][0] == sexes[i][0]) {
                    System.out.println("Firstname : " + info[i][0]);
                    System.out.println("Lastname : " + info[i][1]);
                    System.out.println("Middlename : " + middleNames[i][0]);
                    System.out.println("Age : " + ages[i][0]);
                    System.out.println("Sex : " + sexes[i][0]);
                    found = true; // Set found to true if the family is found
                } else {
                    System.out.println("NOT FOUND");
                }
            }
        }

        if (!found) {
            System.out.println("Try again");
        }
    }
}