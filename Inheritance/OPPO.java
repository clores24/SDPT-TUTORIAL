package Inheritance;

public class OPPO extends Samsung{

    OPPO(String androidName, float androidVer, int storage, int ram, String sPen){
        super(androidName, androidVer, storage, ram, sPen);
    }

    void callAndroidDetails(){
        super.callAndroidDetails();
    }
}
