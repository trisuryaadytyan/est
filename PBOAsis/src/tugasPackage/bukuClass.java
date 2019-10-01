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
public class bukuClass {

    private String nama;
    private String judul;
    private int tahun;
    private int cetakan;
    private double harga;

    public bukuClass() {

    }

    public bukuClass(String nama, String judul, int tahun, int cetakan, double harga) {

        this.nama = nama;
        this.judul = judul;
        this.tahun = tahun;
        this.cetakan = cetakan;
        this.harga = harga;
    }

    public String getNamaBuku() {
        return nama;
    }

    public void setNamaBuku(String nama) {
        this.nama = nama;
    }

    public String getJudulBuku() {
        return judul;
    }

    public void setJudulBuku(String judul) {
        this.judul = judul;
    }

    public int getTahunBuku() {
        return tahun;
    }

    public void setTahunBuku(int tahun) {
        this.tahun = tahun;
    }

    public int getCetakanBuku() {
        return cetakan;
    }

    public void setCetakanBuku(int cetakan) {
        this.cetakan = cetakan;
    }

    public double getHargaBuku() {
        return harga;
    }

    public void setHargaBuku(double harga) {
        this.harga = harga;
    }
}

