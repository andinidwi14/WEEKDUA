class Elektronik extends Produk{
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public Elektronik(String nama, String merek, double harga, int stok, int garansiTahun){
            super(nama,harga,stok);
            this.merek = merek;
            this.garansiTahun = garansiTahun;
    }

    public String getMerek(){
        return merek;
    }
    public int getGaransiTahun(){
        return garansiTahun;
    }
    
    @Override
    public void tampilInfo(){
        System.out.println("Elektronik");
        System.out.println("Nama  : " + getnama());
        // super. tampilInfo
        System.out.println("Merek   : + merek");
        System.out.println("Garansi: " + garansiTahun + "Hari" );
        System.out.println("--------");
    }
    // overloading hitung pajak()
    // versi 1 pajak standar PPN 11%
    public double hitungDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli)*PPN;
    }

    //versi 2 pajak dengan persentase custom
    public double hitungDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli)* (persenPajak/100);
    }
    public doble hitungHargaSetelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga){
        retutn harga * 0.20;
    }
    
    
}


