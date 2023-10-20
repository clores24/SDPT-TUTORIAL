package QUICKPRACTICE;
import java.util.Scanner;
public class challenges {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //1. Write a Java Program to print the result of the following operation:
        System.out.println("1. Write a Java Program to print the result of the following operation:");
        // a) "Your Name";
        System.out.println("a) \"Your Name\";");
        System.out.println("Roildan Clores");
        System.out.println();

        // b) 20 + -3 * 9 / 8;
        System.out.println("b) 20 + -3 * 9 / 8;");
        int result = 20 + -3 * 9 / 8;
        System.out.println(result);
        System.out.println();
        
        // c) 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("c) 5 + 15 / 3 * 2 - 8 % 3;");
        int result2 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(result2);
        System.out.println();

        // d) 5 <= 1;
        System.out.println("d) 5 <= 1;");
        boolean num = 5 <= 1;
        System.out.println(num);
        // another way
        System.out.println(5 <= 1);
        System.out.println();

        // e) true AND false;
        System.out.println("e) true AND false;");
        boolean isTrue1 = true;
        boolean isFalse1 = false;
        System.out.println(isTrue1 + " AND " + isFalse1);
        System.out.println();

        // true OR false
        System.out.println("true OR false");
        boolean isTrue2 = true;
        boolean isFalse2 = false;
        System.out.println(isTrue2 + " OR " + isFalse2);
        System.out.println();

        //2. write a Java program that accepts two integer values from the user and return the larger value.
        System.out.println("2. write a Java program that accepts two integer values from the user and return the larger value.");
        System.out.println("Enter a number of your choice");
        System.out.print("Number of choice: ");
        int user1 = s.nextInt();
        s.nextLine();

        System.out.print("Number of choice: ");
        int user2 = s.nextInt();
        s.nextLine();

        int larger = 0;
        int smallwr = 0;
            if (user1 < user2){
                larger = user2;
            } else {
                smallwr = user2;
            }
        System.out.println(larger);
        System.out.println();

            // another way
            int larger1 = Math.max(user1, user2);
                System.out.println(larger1);
            int smaller1 = Math.min(user1, user2);
                System.out.println();
        
        //3. Write a Java program that accepts input from the user and then print the even numbers from 0 up to the user input.
        System.out.println("Write a Java program that accepts input from the user and then print the even numbers from 0 up to the user input.");
        System.out.print("Enter a number of your choice: ");
        int number = s.nextInt();
        for (int i = 0; i <= number; i++){
            if (i % 2 == 0){
                int even = i;
                System.out.print(even + ", ");
            }
        }

    }
}
