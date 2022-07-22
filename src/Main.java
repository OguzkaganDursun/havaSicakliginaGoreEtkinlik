import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken tanimlandi.
        int sicaklik;

        /*
        Kullanicidan bilgi alindi.
        Alinan degere gore etkinlik onerildi.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------"+
                "\nHava Sicakligina Gore Etkinlik Onerisi \n---------------------------------");
        System.out.println("1. Hava Sicakligi 5 dereceden kucuktur. \n2. Hava Sicakligi 5 Derece Ile 15 Derece Arasindadir " +
                "\n3. Hava Sicakligi 15 Derece Ile 25 Derece Arasindadir \n4. Hava Sicakligi 25 Dereceden Buyuktur.");
        System.out.print("Hava Sicakligi Hakkinda Seciminizi Yapiniz (1-4) : ");

        sicaklik = scan.nextInt();

        switch (sicaklik)
        {
            case 1:
                System.out.println("Kayak Yapmaya Gidebilirsiniz.");
                break;
            case 2:
                System.out.println("Sinemaya Gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Piknige gidebilirsiniz.");
                break;
            case 4:
                System.out.println("Yuzmeye gidebilirsiniz.");
                break;

            default:
                System.out.println("Hatali Giris Yaptiniz!");
        }
    }
}
