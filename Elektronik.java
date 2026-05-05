public class Elektronik extends Produk{
    private int Garansi;
    public Elektronik (String nama, double harga, int stok, String kategori, int Garansi){
        super(nama, harga, stok, kategori);
        this.Garansi = Garansi;

    }

    public void tampilkanData(){
        super.tampilInfo();
        System.out.println("Masa Garansi: " + Garansi + "Hari" );
    }

    public void setGaransi(int Garansi){
       if(Garansi <= 0){
        System.out.println("Masa expired tidak boleh negatif");
    }else{
        this.Garansi = Garansi;
       }
        
    }
    
}


