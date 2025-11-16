package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<Transaction> listTransaksi;

    // Constructor
    public TransactionManager() {
        listTransaksi = new ArrayList<>();
    }

    // ================================
    // 1. CREATE (Tambah Data)
    // ================================
    public void add(Transaction t) {
        listTransaksi.add(t);
    }

    // ================================
    // 2. READ (Ambil Semua Data)
    // ================================
    public List<Transaction> getAll() {
        return new ArrayList<>(listTransaksi);
    }

    // ================================
    // 3. UPDATE (Edit Data Berdasarkan Index)
    // ================================
    public void update(int index, Transaction t) {
        if (index >= 0 && index < listTransaksi.size()) {
            listTransaksi.set(index, t);
        }
    }

    // ================================
    // 4. DELETE (Hapus Data Berdasarkan Index)
    // ================================
    public void delete(int index) {
        if (index >= 0 && index < listTransaksi.size()) {
            listTransaksi.remove(index);
        }
    }

    // ================================
    // 5. Hitung Total Saldo
    // ================================
    public double getTotalSaldo() {
        double saldo = 0;

        for (Transaction t : listTransaksi) {
            if (t.getKategori().equalsIgnoreCase("Pemasukan")) {
                saldo += t.getJumlah();
            } else {
                saldo -= t.getJumlah();
            }
        }

        return saldo;
    }
}
