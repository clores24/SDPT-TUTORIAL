package Inheritance;

public class AndroidPhone {
    String androidName;
    float androidVer; 
    int storage, ram;

    AndroidPhone(String androidName, float androidVer, int storage, int ram){
        this.androidName = androidName;
        this.androidVer = androidVer;
        this.storage = storage;
        this.ram = ram;
        
    }

    void callAndroidDetails(){
        System.out.println("Android name: " + androidName);
        System.out.println("Android Version: " + androidVer);
        System.out.println("Storage: "+ storage);
        System.out.println("RAM: "+ ram);
    }


    }

