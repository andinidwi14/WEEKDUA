public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        super.tampilInfo();
        System.out.println("Masa Expired: " + expired + " Hari");
    }

    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("Masa Expired Tidak Boleh Negatif");
        } else {
            this.expired = expired;
        }
    }

    //versi 1
    public double hitungDiskon(int jumlahBeli){
        if(jumlahBeli >= 10){
            return hitungTotalHarga(jumlahBeli) * 0.05;
        }
        return 0;
    }
    //versi 2
    public double hitungDiskon(int jumlahBeli, double persenDiskon){
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga){
        return harga = 0.10;
    }
    
}