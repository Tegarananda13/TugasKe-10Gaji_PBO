public class VirtualDemo {
    public static void main (String[] args){
        Gaji s = new Gaji ("Asep", "Padang", 3, 5000.00);
        Pegawai e = new Gaji ("Tegar", "Bukittinggi", 2, 2500.00);
        Pegawai p = new Pegawai("Ananda", "Payakumbuh", 10000);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        System.out.println(s.x);
        s.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(e.x);
        e.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(p.x);
        p.mailCheck();
        
    }
}