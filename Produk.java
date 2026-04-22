

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
    
    public void tampilInfo(){
        System.out.println("Produk : " + this.nama);
        System.out.println("harga : " + this.harga);
        System.out.println("stok : " + this.stok);
        System.out.println("kategori : " + this.kategori);

    }
}
