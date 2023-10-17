package Inheritance;

public class Samsung extends AndroidPhone{
    String sPen;

    Samsung(String androidName, float androidVer, int storage, int ram, String sPen){
        super(androidName, androidVer, storage, ram);
        this.sPen = sPen;
    }

    void callAndroidDetails(){
        super.callAndroidDetails();
        System.out.println("S Pen: " + sPen);

    }


}
