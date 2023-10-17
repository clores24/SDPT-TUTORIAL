package ObjectMethods;

import java.util.Scanner;

public class heroDetaills {
    String heroname, dialog;
    int lvl;
    String EMH;

    heroDetaills(String heroname, String dialog, int lvl, String EMH){
        this.heroname = heroname;
        this.dialog = dialog;
        this.lvl = lvl;
        this.EMH = EMH;
    }

    void wannafight(heroDetaills x){
        System.out.println("Hey "+ x.heroname + ", let's go, and have some fun");
    }

    void heroRespond(){
        System.out.println("Sure! Prepare yourself, i'm coming "+ heroname);
    }

}
