package Kuis1;
import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama :");
        String  nama = input.nextLine();
        System.out.println("Masukkan NIP :");
        String Nip = input.nextLine();
        System.out.println("Jumlah Jam Kerja : ");
        int jumlahJamKerja = input.nextInt();

        Pegawai p = new Pegawai(nama, Nip, jumlahJamKerja);

        p.gajiPokok();
        p.lembur();
        p.uangMakan();
        p.transport();
        p.total();
    }
    
}
