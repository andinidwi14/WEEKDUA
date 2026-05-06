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
    }
}
