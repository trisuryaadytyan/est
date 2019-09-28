package tugaskedua2;

public class Pelajar {
    private String nip;
    private String nama;
    private String is;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;
    

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(int nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(int nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }
    
    public double nilaiAkhir(){
        return (0.4*this.getNilaiUjian1())+(0.4*this.getNilaiUjian2())+
                (0.2*this.getNilaiTugas());
    }
    
    public String isLulus(){
        if (this.nilaiAkhir()>=60) {
            is = "Lulus";
        } else {
            is = "Tidak Lulus";
        }
        return is;
    }

    public Pelajar(String nip, String nama, double nilaiUjian1, 
            double nilaiUjian2, double nilaiTugas) {
        this.nip = nip;
        this.nama = nama;
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
        this.is = is;
    }
    
    
    public void status(){
        System.out.println("HASIL AKHIR");
        System.out.println("----------------------------------------------");
        System.out.println("NIP\t\t: " + this.getNip());
        System.out.println("Nama \t\t: " + this.getNama());
        System.out.println("Nilai Ujian 1\t: " + this.getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t: " + this.getNilaiUjian2());
        System.out.println("Nilai Tugas\t: " + this.nilaiTugas);
        System.out.println("Nilai Akhir\t: " + this.nilaiAkhir());
        System.out.println("Status\t\t: " + this.isLulus());
        System.out.println("----------------------------------------------");
    }

}
class hasil{
    public static void main(String[] args) {
        Pelajar anak1 = new Pelajar("0611","Gita",80,90,67);
        Pelajar anak2 = new Pelajar("0981","Kinan",40,50,60);
        anak1.status();
        anak2.status();
    }
}