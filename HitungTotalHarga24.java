import java.util.Scanner;

public class HitungTotalHarga24 {
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if(kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 70 / 100; // Diskon 30%
        } else if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 50 / 100; // Diskon 50%
        } else if (!kodePromo.equals("-")) { // Jika kode bukan "-" dan bukan valid
            System.out.println("Kode tidak valid, pesanan dihitung tanpa diskon.");
        }
        return hargaTotal;
    }
    
    public static void penerimaPesanan() {
        Scanner input = new Scanner(System.in);
        int totalKeseluruhan = 0;

        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam\t - Rp.15.000");
        System.out.println("2. Cappuccino\t - Rp.20.000");
        System.out.println("3. Latte\t - Rp.22.000");
        System.out.println("4. Teh Tarik\t - Rp.12.000");
        System.out.println("5. Roti Bakar\t - Rp.10.000");
        System.out.println("6. Mie Goreng\t - Rp.18.000");
        System.out.println("=========================");

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (atau 0 untuk selesai): ");
            int pilihanMenu = input.nextInt();
            if (pilihanMenu == 0) {
                break; // Keluar dari loop jika selesai memilih
            }

            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = input.nextInt();

            System.out.print("Masukkan Kode Promo (atau '-' jika tidak ada): ");
            String kodePromo = input.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk menu ini: Rp." + totalHarga);
        }

        System.out.println("\n=========================");
        System.out.println("Total keseluruhan pesanan anda: Rp." + totalKeseluruhan);
        System.out.println("Terima kasih telah memesan!");
        
        input.close();
    }

    public static void main(String[] args) {
        penerimaPesanan();
    }
}
