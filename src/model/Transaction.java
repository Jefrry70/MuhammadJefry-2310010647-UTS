package model;

public class Transaction {

    // 1. Atribut
    private String tanggal;
    private String kategori;
    private String deskripsi;
    private double jumlah;

    // 2. Constructor
    public Transaction(String tanggal, String kategori, String deskripsi, double jumlah) {
        this.tanggal = tanggal;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
    }

    // 3. Getter & Setter (Encapsulation)
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
}
