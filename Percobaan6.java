import java.util.Scanner;

public class Percobaan6 {

    static int hitungLuas(int p, int l) {
        int luas = p * l;
        return luas;
    }

    static int hitungVolume(int p, int l, int t) {
        int volume = p * l * t;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan Panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input.nextInt();

        L= hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume Persegi Panjang Adalah " + vol);

        input.close();
    }
}