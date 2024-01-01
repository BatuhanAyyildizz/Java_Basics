import java.util.Scanner;

public class tek_cift {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sorgu = true;
        while (sorgu) {
            System.out.print("Bir sayı giriniz : ");
            int input = scan.nextInt();
            if (input % 2 == 0) {
                System.out.println(input + " Sayısı bir çift sayıdır");
            } else {
                System.out.println(input + " Sayısı bir tek sayıdır");
            }

            while (true) {
                System.out.println("Yeni bir sayı girmek istiyorsanız 1 çıkış yapmak istiyorsanız 0'ı tuşlayınız : ");
                int i = scan.nextInt();

                if (i == 1) {
                    sorgu = true;
                    break;
                } else if (i == 0) {
                    sorgu = false;
                    break;
                } else {
                    System.out.println("Hatalı tuşlama yaptınız lütfen yeni bir tuşlama yapınız");
                }
            }

        }

    }
}