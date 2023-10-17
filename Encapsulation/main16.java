package Encapsulation;
import java.util.Scanner;

import javax.sound.midi.Track;

public class main16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Kindly put the appropriate information to avoid cancellation");
        System.out.print("Firstname : ");
        String firstname = s.nextLine();

        System.out.print("Lastname : ");
        String lastname = s.nextLine();

        boolean isTrue = false;
        char gender = ' ';
        int age = 0;

        while (!isTrue) {
            System.out.print("Gender (M/F): ");
            gender = s.nextLine().charAt(0);


            if (gender == 'M' || gender == 'F') {
                isTrue = true;
            } else {
                System.out.println("Invalid gender");
                continue;
            }
        }

        boolean isTrue_1 = false;
                while (!isTrue_1) {
                System.out.print("Age : ");
                age = s.nextInt();
                s.nextLine();

                if (age >= 6 && age <= 100) {
                    isTrue_1 = true;
                } else {
                    System.out.println("Invalid age");
                    continue;
                }
                isTrue_1 = true;
            }
        System.out.println();

        Encapsulation e = new Encapsulation(firstname, lastname, gender, age);
        e.greet();
        e.afterGreet();

        System.out.println();
    }
}
