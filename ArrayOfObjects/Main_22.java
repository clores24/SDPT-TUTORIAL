package ArrayOfObjects;
import java.util.Scanner;
public class Main_22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    System.out.println("Are you a student here in the AMA University?");
    System.out.print("\"yes\" or \"no\": ");
        String yesOrno = s.nextLine();

            boolean isTrue = false;
        if (yesOrno.equals("no")) {
            System.out.println("Unable to continue");
            isTrue =true;
        }


        while (!isTrue){
            if (yesOrno.equals("yes")){
                System.out.print("Enter your ID number: ");
                    String idNumber = s.nextLine();
                        if (idNumber.equals("22-18068")){
                            System.out.println("<----------You can now proceed---------->");
                            System.out.println();
                            isTrue = true;
                        } else {
                            System.out.println(idNumber + " ID number not found");
                            System.out.println();
                            continue;
                        }
                    } else { // i think this will be useless unless i change the while loop to for loop with the size of 3 attenmpts
                        System.out.println("unable to proceed");
                        isTrue = true;
                    }
                }

        System.out.println("How many students you want ot register: ");
            int studToReg = s.nextInt();
            s.nextLine();
            StudentRegistrationForm stud[] = new StudentRegistrationForm[studToReg];

        for (int i = 0; i < stud.length; i++){
            System.out.println("Student " + (i + 1));

grwer            System.out.print("FIRSTNAME: ");
                String firstname = s.nextLine();

            System.out.print("MIDDLENAME: ");
                char middlename = s.nextLine().charAt(0);
                
            System.out.print("LASTNAME: ");
                String lastname = s.nextLine();

            System.out.print("AGE: ");
                int age = s.nextInt();
                s.nextLine();

            System.out.print("GENDER: ");
                String gender = s.nextLine();

            System.out.print("NATIONALITY: ");
                String nationality = s.nextLine();

            System.out.print("YEAR: ");
                String year = s.nextLine();

            System.out.print("COURSE: ");
                String course = s.nextLine();

            System.out.print("SECTION: ");
                String section = s.nextLine();

            stud[i] = new StudentRegistrationForm(firstname, gender, lastname, age, middlename, nationality, year, course, section);
        }
        System.out.println();

        String university = "AMA Universiry";
        for (int i = 0; i < stud.length; i++){
            stud[i].welcome(university);
            stud[i].registeredStudents();
            System.out.println();
        }

    // i made it without the help of chat gpt

    }
}
