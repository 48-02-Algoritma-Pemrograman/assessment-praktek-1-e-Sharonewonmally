import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        int jumlahanggota;
        double tunjangan;
        double totaltunjangan;

            System.out.print("input jumlah anggota keluarga : ");
            jumlahanggota =scanner.nextInt();
            
            System.out.print("masukan tunjangan anggota keluarga");
            tunjangan = scanner.nextDouble();

            for (int i = 1; i <= jumlahanggota; i++){
                System.out.println("anggota keluarga ke-" + i + ":");

                String tunjangan1 = ""; 
                String tunjangan2 = ""; 
                String tunjangan3 = "";


                switch (jumlahanggota) {
                    case 1:
                        tunjangan = 100000;
                        break;
                    case 2:
                        tunjangan = 50000;
                        break;
                    case 3:
                        tunjangan = 50000;
                        break;
                    
                    }
                        double ip = jumlahanggota /tunjangan;

                        System.out.println("jumlahtunjangan" +tunjangan);

                        scanner.close();
                }    
        }
    }
    }
}
