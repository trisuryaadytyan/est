/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPackage;

/**
 *
 * @author hp
 */
public class bukuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukuClass bukuku = new bukuClass();
        bukuku.setNamaBuku("Al-Battani");
        bukuku.setJudulBuku("Perhitungan Satu Tahun Bumi");
        bukuku.setTahunBuku(929);
        bukuku.setCetakanBuku(1);
        bukuku.setHargaBuku(505000);
        
        System.out.println("===== INFORMASI TENTANG BUKU =====");
        System.out.println("Nama Pengarang\t : " + bukuku.getNamaBuku());
        System.out.println("Judul Buku\t : " + bukuku.getJudulBuku());
        System.out.println("Tahun Terbit\t : " + bukuku.getTahunBuku());
        System.out.println("Cetakan ke\t : "+ bukuku.getCetakanBuku());
        System.out.println("Harga Buku\t : " + bukuku.getHargaBuku());
        System.out.println("==================================");
    }
    
    
}