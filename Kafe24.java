public class Kafe24 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang " + namaPelanggan + "!");
        if(isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if(kodePromo.equals("DISKON30")) {
            System.out.println("Selamat Anda Mendapatkan diskon 30");
        } else if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat Anda Mendapatkan diskon 50");
        } else {
            System.out.println("Kode tidak valid");
        }
        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam\t - Rp.15.000");
        System.out.println("2. Cappuccino\t - Rp.20.000");
        System.out.println("3. Latte\t\t - Rp.22.000");
        System.out.println("4. Teh Tarik\t - Rp.12.000");
        System.out.println("5. Roti Bakar\t - Rp.10.000");
        System.out.println("6. Mie Goreng\t - Rp.18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", true, "ddd");
    }
}