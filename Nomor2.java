import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String labubu, jenglot, voodo, namaboneka, boneka;
        int pilihanbarang;
        double pendapatan;
        double diskon;
        double hargaproduk;

        pilihanbarang = scanner.nextInt();

        System.out.print("masukan  namaboneka");
        namaboneka = scanner.next();
        System.out.print("masukan  pilihanbarang");
        pilihanbarang = scanner.nextInt();
        System.out.print("masukan nama boneka");
        boneka= scanner.next();

        hargaproduk = 0;
        if (pilihanbarang == 1) {
          hargaproduk = 300000;
        } else 
        if (pilihanbarang == 2){
          hargaproduk = 250000;
        } else 
        if (pilihanbarang == 3){
          hargaproduk = 200000;
        if (pilihanbarang > 50)
        diskon = hargaproduk * 0.10;
        else if (pilihanbarang >= 50000 && pilihanbarang <= 100000){
            diskon = hargaproduk * 0.15;

        System.out.println ("selamat datang, " + pilihanbarang);
        System.out.println ("biayaboneka , " + hargaproduk);
        System.out.println ("diskon"+ 15);
        System.out.println ("total bayar, " + 30000);
    }
    }
  }
 }


    }
}
