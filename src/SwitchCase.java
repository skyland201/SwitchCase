import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        secim = input.nextInt();

        switch (secim) {

            case 1:
                System.out.println("Toplama işlemi sonucu :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme işlemi sonucu : " + (n1 / n2));
                break;

            default:
                System.out.println("Yanlış seçim yaptınız");
        }
    }}
