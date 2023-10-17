package Inheritance;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String andoroidBrand[] = {"Samsung", "Vivo", "OPPO"};

        System.out.print("Brand of your android device: ");
            String deviceName = s.nextLine();
                System.out.println("Loading..............");
                System.out.println();

            System.out.println("Enter the version of your android device or MODEL");
            System.out.print("Android device name: ");
                String deviceName2 = s.nextLine();
                
            System.out.print("Android Version: ");
                Float androidVersion = s.nextFloat();
                    s.nextLine();

            System.out.print("Storage: ");
                int storage = s.nextInt();
                    s.nextLine();
                
            System.out.print("RAM: ");
                int ram = s.nextInt();
                    s.nextLine();
                        System.out.println();

        String sPenYes = "Yes";
        String sPenNo = "No";
            AndroidPhone samsung = new Samsung(deviceName2, androidVersion, storage, ram, sPenYes);
            AndroidPhone oppo = new OPPO(deviceName2, ram, storage, ram, sPenNo);
            AndroidPhone vivo = new Vivo(deviceName2, ram, storage, ram, sPenNo);

                if (deviceName.equals(andoroidBrand[0])){
                    samsung.callAndroidDetails();
                } else if (deviceName.equals(andoroidBrand[1])){
                    vivo.callAndroidDetails();
                } else if (deviceName.equals(andoroidBrand[2])){
                    oppo.callAndroidDetails();
                } else {
                    System.out.println("Check your input");
                }

                


 
    }
}
