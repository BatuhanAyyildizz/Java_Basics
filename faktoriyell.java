import java.util.Scanner;

public class faktoriyell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen faktöriyelinin hesaplanmasını istediğiniz sayıyı giriniz : ");
        int input = scan.nextInt();

        int faktoriyel = 1;
        for (int i = input; 0 < i; i--) {
            faktoriyel = i * faktoriyel;
        }
        System.out.println("Girdiğiniz sayı = " + input + "\nFaktöriyel sonucu  " + faktoriyel);
    }
}