import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen asallık durumunun kontrol edilmesini istediğiniz sayıyı giriniz : ");
        int input = scan.nextInt();
        boolean sorgu = true;

        for (int i = 2; i <= input; i++) {
            if (input == i) {
                sorgu = false;
                break;
            } else if (input % i == 0) {
                sorgu = true;
                break;
            } else {
                sorgu = false;
            }
        }
        if (sorgu) {
            System.out.println(input + " sayısı bir asal sayı değildir");
        } else {
            System.out.println(input + " sayısı bir asal sayıdır");

        }
    }
}
