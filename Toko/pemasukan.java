package Toko;

import Produk;

public class pemasukan extends Produk {
    private double totalPemasukan;
    public pemasukan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }

    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga; // protected - boleh karena pemauskan adalah subclass
            stok -= jumlah; // public - boleh
        } else {
            System.out.println("Stok tidak cukup:");
        }
    }
}
