package Abstractions;

abstract class Devices {


    String gadget = "Gadget";

    abstract void deviceName();

    void isApple(String deviceNmme) {
           System.out.println(deviceNmme +  " is a type of " + gadget);
    }

    void isAndroid(String deviceNmme) {
           System.out.println(deviceNmme +  " is a type of " + gadget);
    }

}
