package ObjectMethods;
import java.util.Scanner;
public class main15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

// code 1
        heroDetaills h = new heroDetaills("Goku", "Hey, what's up.", 10, "Hard");
        heroDetaills h1 = new heroDetaills("Broly", "Kakarot", 999999999, "Legendary");

            h1.wannafight(h);
            h1.heroRespond();

System.out.println();

// code 2
        main15_2.userInfo(s);

    }
}
