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
public class pelajarClass {
    
    private String nama;
    private int nip;
    private int nilai1;
    private int nilai2;
    private int nilaiT;

    public pelajarClass() {

    }

    public pelajarClass(String nama, int nip, int nilai1, int nilai2, int nilaiT) {
        this.nama = nama;
        this.nip = nip;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilaiT = nilaiT;

    }

    public String getNamaPelajar() {
        return nama;
    }

    public void setNamaPelajar(String nama) {
        this.nama = nama;
    }

    public int getNipKu() {
        return nip;
    }

    public void setNipKu(int nip) {
        this.nip = nip;
    }

    public int getNilaiKuis1() {
        return nilai1;
    }

    public void setNilaiKuis1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilaiKuis2() {
        return nilai2;
    }

    public void setNilaiKuis2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilaiTugas() {
        return nilaiT;
    }

    public void setNilaiTugas(int nilaiT) {
        this.nilaiT = nilaiT;
    }
}