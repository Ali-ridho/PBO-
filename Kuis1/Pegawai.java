package Kuis1;

public class Pegawai {
    private String nama;
    private String Nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    private double total;

    Pegawai (String nama, String Nip, int jumlahJamKerja){
        this.nama = nama;
        this.Nip = Nip;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void gajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
    }

    public void transport(){
        if(jumlahJamKerja >= 9){
            transport = 4500;
        }else{
            transport = 0;
        }
    }

    public void uangMakan(){
        if (jumlahJamKerja >= 8){
            uangMakan = 3500;
        }else{
            uangMakan = 0;
        }
    }

    public void lembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7) * (1.5 * gajiPokok);
        }else{
            lembur = 0;
        }
    }
    
    public void total(){
        total = gajiPokok + uangMakan + lembur + transport;
        System.out.println("Gaji Pokok : " + gajiPokok );
        System.out.println( "Uang Makan :" + uangMakan);
        System.out.println("Lembur : " + lembur);
        System.out.println("Transportasi : " + transport);

        System.out.println("Total Gaji : " + total);

    }
    
    
}
