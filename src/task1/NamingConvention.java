package task1;

public class NamingConvention {
    public static void main(String[] args) {
        // Variabel dengan camelCase
        String namaLengkapMahasiswa = "Rifan Radedo Simbolon";
        String nomorIndukMahasiswa = "2481043"; // tetap String (bisa ada leading zero)
        double ipkSemesterLalu = 3.47;
        boolean statusAktifKuliah = true;
        String alamatRumah = "Unai, Bandung";
        int jumlahSksYangDiambil = 20;

        // Output (lebih rapi: format IPK 2 desimal, status lebih manusiawi)
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap: " + namaLengkapMahasiswa);
        System.out.println("NIM: " + nomorIndukMahasiswa);
        System.out.printf("IPK Semester Lalu: %.2f%n", ipkSemesterLalu);
        System.out.println("Status Aktif Kuliah: " + "Aktif");
        System.out.println("Alamat Rumah: " + alamatRumah);
        System.out.println("Jumlah SKS yang Diambil: " + jumlahSksYangDiambil);
    }
}
