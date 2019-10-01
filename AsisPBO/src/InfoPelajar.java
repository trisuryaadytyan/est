public class InfoPelajar {
    private String nip;
    private String nama;
    private String is;
    private double nilaiUjian1, nilaiUjian2, nilaiTugas;

    public InfoPelajar(String nip, String n, double u1, double u2, double t) {
        this.nip = nip;
        this.nama = n;
        this.nilaiUjian1 = u1;
        this.nilaiUjian2 = u2;
        this.nilaiTugas = t;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(double u1) {
        this.nilaiUjian1 = u1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(double u2) {
        this.nilaiUjian2 = u2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double t) {
        this.nilaiTugas = t;
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
    public void info(){
        System.out.println("NIP\t\t : "+getNip());
        System.out.println("Nama\t\t : "+getNama());
        System.out.println("Nilai Ujian 1\t : "+getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t : "+getNilaiUjian2());
        System.out.println("Nilai Tugas\t : "+getNilaiTugas());
        System.out.println("Nilai Akhir\t : "+nilaiAkhir());
        System.out.println("Status\t\t : "+isLulus());
        
        
    }
    
    
    
    
}
