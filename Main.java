public class Main {
    public static void main(String[] args) {
        Elektronik Laptop  = new Elektronik("Laptop Asus", 850000.0, 10,"Asus", 1);
        Elektronik Hp = new Elektronik( "Hp samsung", 3200000, 20, "samsung", 1);
        Makanan Indomie = new Makanan("Indomie goreng", 3500, 100, "Mie instan", "2026-12-01");
        Makanan roti = new Makanan("Roti Tawar", 8000, 50, "Roti", "2025-04-30");
        
    // Overriding - Satu nama method untuk semua
    System.out.println("====DAFTAR PRODUK====");
    Laptop.tampilInfo();
    Hp.tampilInfo();
    Indomie.tampilInfo();
    roti.tampilInfo();

    // --- Overloading hitungPajak() 
    System.out.println("====== RINCIAN PAJAK ELEKTRONIK ======");

    // Versi 1 - pajak standar
    double pajakLaptop = Laptop.hitungPajak(1);
    double totalLaptop = Laptop.hitungHargaSetelahDiskon(1);
    System.out.println("Laptop x1 (PPN standar 11%)");
    System.out.println("  Subtotal : Rp" + Laptop.hitungTotalHarga(1));
    System.out.println("  Pajak    : Rp" + pajakLaptop);
    System.out.println("  Total    : Rp" + totalLaptop);

    // Versi 2 - pajak custom 5% (misal barang impor khusus)
    double pajakHpCustom = hp.hitungPajak(2);
    System.out.println("HP Samsung x2 (pajak custom 5%)");
    System.out.println("  Subtotal : Rp" + hp.hitungTotalHarga(2));
    System.out.println("  Pajak    : Rp" + pajakHpCustom);
    System.out.println("  Total    : Rp" + (hp.hitungTotalHarga(2) + pajakHpCustom));

    }
}
