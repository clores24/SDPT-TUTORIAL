package OverloadingConstructors;
import java.util.Scanner;
public class OverloadingConstructors {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

        StudentsIndo studinfo = new StudentsIndo("Roildan", "Clores", 21, 'M', "First Year");
            System.out.println(studinfo);
            System.out.println();

        StudentsIndo studinfo2 = new StudentsIndo("Doeaemon", "Clores", 21, 'M');
            System.out.println(studinfo2);
            System.out.println(); 

        StudentsIndo studentsIndo3 = new StudentsIndo();
            System.out.println(studentsIndo3.getFirstname());

    }
}
