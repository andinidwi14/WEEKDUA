

public class Produk {
    private String nama;
    String kategori;
    private double harga;
    private int stok;

    public Produk (String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    
    public String getnama(){
    return nama;
    }
    public double getharga(){
    return harga;
    }
    public int getstok(){
    return stok;
    }

    public void setHarga(double Harga){
        this.harga = harga;
    }
    public void setStok(int Stok){
        this.stok = stok;
    }
    public double htungTotalHarga(int jumlahBeli){
        return harga * jumlahBeli;
    }
    public void beli(int jumlahBeli){
        if(jumlahBeli <= 0){
            System.out.println("Jumlah beli harus lebih dari 0");
            return;
        }
     if(jumlahBeli > stok){
            System.out.println("Stok: " + nama + " tidak cukup! Tersisa: " + stok);
            return;
        }
    stok -= jumlahBeli;
        System.out.println("Stok " + nama + " x" + jumlahBeli + " = Rp" + hitungTotalHarga(jumlahBeli) + " | Sisa stok: " + stok);
    }
    public void tampilInfo(){
        
    public abstract double hitungPajak(double harga);
    }
}
