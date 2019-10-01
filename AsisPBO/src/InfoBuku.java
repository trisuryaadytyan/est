public class InfoBuku {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;

    public InfoBuku(String p, String j, int t, int c, double h) {
        this.namaPengarang = p;
        this.judulBuku = j;
        this.tahunTerbit = t;
        this.cetakanKe = c;
        this.hargaJual = h;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String p) {
        this.namaPengarang = p;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String j) {
        this.judulBuku = j;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int t) {
        this.tahunTerbit = t;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int c) {
        this.cetakanKe = c;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double h) {
        this.hargaJual = h;
    }
    public void info(){
        System.out.println("Nama Pengarang\t : "+getNamaPengarang());
        System.out.println("Judul Buku\t : "+getJudulBuku());
        System.out.println("Tahun Terbit\t : "+getTahunTerbit());
        System.out.println("Cetakan Ke\t : "+getCetakanKe());
        System.out.println("Harga\t\t : "+getHargaJual());
    }
    
    
    
       
}
