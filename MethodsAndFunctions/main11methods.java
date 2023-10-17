package MethodsAndFunctions;

import java.util.Scanner;

public class main11methods {

    public static final String numbersInfo = null;
    static void info2DArray(String info[][]){
        for (int i = 0; i < info.length; i++){
            System.out.println("Info #"+ i);
            for (int j = 0; j < info[i].length; j++){
                System.out.println(info[i][j]);
            }
            System.out.println();
        }
                System.out.println("Created");
    }
    static int numbersInfo(int numbers[][]){
            int total = 0; // this is the way to sum all the numbers in every rows
        for (int i = 0; i < numbers.length; i++){
            int sum = 0; // this is to sum the numbers only for the row
            System.out.println("Number Info #"+ i);
            for (int j = 0; j < numbers[i].length; j++){
                    total += numbers[i][j];
                    sum += numbers[i][j];
                    
            }
            System.out.println("The total number for storage "+ i + " is "+ sum);
        }
        return total;
    }
    static void numbersInfo2(int numbers[][]){
        for (int i = 0; i < numbers.length; i++){
            int total = 0;
            System.out.println("Number Info #"+ i);
            for (int j = 0; j < numbers[i].length; j++){
                    total += numbers[i][j];
            }
            System.out.println("The total number for storage "+ i + " is "+ total);
        }
        System.out.println();
    }
    public static void arrayStudentsInfo(String studentsinfo[][], Scanner s){
            for (int i = 0; i < studentsinfo.length; i++){
                System.out.println("Student #"+ (i + 1));
                for (int j = 0; j < studentsinfo[i].length; j++){
                    if (j == 0){
                        System.out.print("username : ");
                    } else if (j == 1){
                        System.out.print("email : ");
                    } else if (j == 2){
                        System.out.print("password : ");
                    }
                    studentsinfo[i][j] = s.nextLine();
            }
            System.out.println();
        }
        System.out.println();

    }
}



