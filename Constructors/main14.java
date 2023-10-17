package Constructors;

import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String familyMembers[] = {"Roildan Clores", "Rayven Clores"};

        FamilyConstructor[] cloresFamily = new FamilyConstructor[familyMembers.length];

        for (int i = 0; i < familyMembers.length; i++) {
            cloresFamily[i] = FamilyConstructor.createFamilyMember(familyMembers[i], s);
            System.out.println();
        }

        String information[][] = {
            {"Roildan", "Clores"},
            {"Rayven", "Clores"},
            {"Cassandra", "Clores"},
            {"Kim Angela Homestay", "Clores"}
        };

        char middleNames[][] = {
            {'C'},
            {'R'},
            {'C'},
            {'K'}
        };
        
        int age[][] = {
            {19},
            {19},
            {19},
            {19}
        };
        
        char gender[][] = {
            {'M'},
            {'F'},
            {'F'},
            {'F'}
        };

        FamilyConstructor.cloresFam(information, middleNames, age, gender, s);

        s.close();
    }
}
