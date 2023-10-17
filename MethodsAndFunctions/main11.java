package MethodsAndFunctions;
import java.util.Scanner;
public class main11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String info[][] = {
            {"Name 0", "pass 0", "email 0"},
            {"Name 1", "pass 1", "email 1"},
            {"Name 2 ", "pass 2", "email 2"},
        };
        main11methods.info2DArray(info);
        System.out.println();
        
        int infoNums[][] = {
            {1,2,3,4,5},
            {5,4,3},
            {1,3}
        };
        int total = main11methods.numbersInfo(infoNums);
            System.out.println(total);
        System.out.println();

        main11methods.numbersInfo2(infoNums);
        System.out.println();

        // code 2
        String studentsInfo[][] = new String[3][3];
        main11methods.arrayStudentsInfo(studentsInfo, s);
        for (int i = 0; i < studentsInfo.length; i++){
            System.out.println("Student#" + (i + 1));
            System.out.println("USERNAME : "+  studentsInfo[i][0]);
            System.out.println("EMAIL : "+  studentsInfo[i][1]);
            System.out.println("PASSWORD : "+  studentsInfo[i][2]);
            System.out.println();
        }

    }
} 