public class Main {
    public static void main(String[] args) {
        System.out.println("No 3");
        cetakBaris(1, 5);
        System.out.println("No 4");
        cetakBilanganPrimer();
    }

    public static void cetakBaris(int awal, int akhir) {
        //jumlah baris
        int baris = akhir - awal + 1;
        int angka = akhir;

        //looping tiap baris
        for (int i = 1; i <= baris; i++) {
            //cetak angka
            for (int j = angka; j >= awal; j--){
                System.out.printf("%d ", angka);
            }
            angka--;
            System.out.println();
        }
    }

    public static void cetakBilanganPrimer() {
        //looping deret angka
        for (int i = 2; i <= 100; i++) {
            if (cekBilanganPrimer(i)) {
                System.out.printf(" %d", i);
            }
        }
    }

    public static boolean cekBilanganPrimer(int angka) {
        //cek apakah bilangan primer
        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}