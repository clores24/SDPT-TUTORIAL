package Inheritance;

public class Vivo extends OPPO{

    Vivo(String androidName, float androidVer, int storage, int ram, String sPen){
        super(androidName, androidVer, storage, ram, sPen);
    }

    void callAndroidDetails(){
        super.callAndroidDetails();

    }
}
