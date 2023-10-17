package ObjectMethods;

import java.util.Scanner;

public class main15_2 {
    String firstname, lastname;
    char middleName, sex;
    int age;
    String year, section, coursr;

    main15_2(String firstname, 
                String lastname, 
                char middleName, 
                char sex, 
                int age, 
                String year, 
                String section, 
                String course){
                    this.firstname = firstname;
                    this.lastname = lastname;
                    this.middleName = middleName;
                    this.sex = sex;
                    this.year = year;
                    this.section = section;
                    this.coursr = course;
    }
    void greet(Scanner s){
        System.out.println("Hello Mr/Mrs "+ lastname + ", kindly check your provided information");
        System.out.print("Type 'next' to continue or 'back' to cancel : ");
        String user = s.nextLine();
            if(user.equals("next") || user.equals("back")){
            System.out.println();
            } else {
                System.out.println("Kindly follow the instructions");
                System.out.println(">>>>>loading<<<<<");
            }
            System.out.println();
    }
    static void userInfo(Scanner s){
        System.out.print("Firstname : ");
            String firstname = s.nextLine();

        System.out.print("Lastname : ");
            String lastname = s.nextLine();

        System.out.print("Middlename : ");
            char middlename = s.nextLine().charAt(0);

        System.out.println("Are you a 'Male' or 'Female'");
        System.out.print("Sex : ");
            char sex = s.nextLine().charAt(0);

        System.out.print("Age : ");
            int age = s.nextInt();
            s.nextLine();

        System.out.print("Year : ");
            String year = s.nextLine();

        System.out.print("Year : ");
            String section = s.nextLine();

        System.out.print("Course : ");
            String course = s.nextLine();

            System.out.print("Subject 1 : ");
            float sub1 = s.nextFloat();
            s.nextLine();

            System.out.print("Subject 2 : ");
            float sub2 = s.nextFloat();
            s.nextLine();

        
        main15_2 m = new main15_2(firstname, lastname, middlename, sex, age, year, section, course);
        m.greet(s);

        System.out.println("Fullname " + firstname + ", "+ middlename + " " + lastname);
        System.out.println("Sex : " + sex);
        System.out.println("Sex : " + age);
        System.out.println("Sex : " + year);
        System.out.println("Sex : " + section);
        System.out.println("Sex : " + course);
        m.averaGrade(sub1, sub2, s);

    }
    void averaGrade(float sub1, float sub2, Scanner s){
        float av = 0;

                av = (sub1 + sub2) / 2;

                String Remarks, Invalid;
            if (av > 100){
                Invalid = "Invalid Grades";
            } else if (av >= 95){
                Remarks = "With Highest Honors";
            } else if (av >= 85){
                Remarks = "With High Honors ";
            } else if (av >= 85){
                Remarks = "With Honors";
            } else if (av >= 75){
                Remarks = "Passed";
            } else {
                Invalid = "Invalid Grades";
            }
        
            System.out.println("Average : " + av);
    }
}
