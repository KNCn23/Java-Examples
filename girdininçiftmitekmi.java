import java.util.Scanner;

public class girdininçiftmitekmi {
    
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı almak için bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(); // Sayıyı bir tamsayı olarak okuyun

        // Kullanıcıya sonucu gösterin
        if (sayi % 2 == 0) {
            System.out.println(sayi + " çifttir.");
        } else {
            System.out.println(sayi + " tektir.");
        }

        // Scanner'ı kapatın
        scanner.close();
    }
}
