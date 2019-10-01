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
public class pelajarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        pelajarClass Mahas1 = new pelajarClass();
         Mahas1.setNamaPelajar("TRISAN");
         Mahas1.setNipKu(26102909);
         Mahas1.setNilaiKuis1(100);
         Mahas1.setNilaiKuis2(100);
         Mahas1.setNilaiTugas(100);
         int nilaiAkhir = Mahas1.getNilaiKuis1()* 40/100 + Mahas1.getNilaiKuis2()* 40/100+ Mahas1.getNilaiTugas()* 20/100;
        
         
         System.out.println("=====INFORMASI PELAJAR=====");
         System.out.println("========== *^_^* ==========");
         System.out.println("Nama\t\t: "+ Mahas1.getNamaPelajar());
         System.out.println("NIP\t\t: "+ Mahas1.getNipKu());
         System.out.println("Nilai Ujian 1\t: "+ Mahas1.getNilaiKuis1());
         System.out.println("Nilai Ujian 2\t: "+ Mahas1.getNilaiKuis2());
         System.out.println("Nilai Tugas\t: "+ Mahas1.getNilaiTugas());
         System.out.println("Nilai Akhir\t: " + nilaiAkhir);
         System.out.println("==========================");
         System.out.println("");
          if (nilaiAkhir >=60){
             System.out.println("LULUS");
         }
         else{
             System.out.println("TIDAK LULUS");
         }
          System.out.println("");
          System.out.println("==========================");
    }
}