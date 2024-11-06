public class Main {
    public static void main(String[] args) throws Exception {
        Majalah majalah = new Majalah(null, null, null, 0, null, null);
        TextBook textbook = new TextBook(null, null, null, 0, null, null);

        majalah.setJudul("Mastering Altcoin");
        majalah.setPenulis("Kalimasada");
        majalah.setPenerbit("Akademi Crypto");
        majalah.setTahunTerbit(2024);
        majalah.setEdisi("Altcoin");
        majalah.setKategori("Buku");

        textbook.setJudul("Quantum Entanglement");
        textbook.setPenulis("Albert Einsten");
        textbook.setPenerbit("Gramedia");
        textbook.setTahunTerbit(1945);
        textbook.setMatkul("Fisika");
        textbook.setKelas(3);

        majalah.tampilkanInfo();
        System.out.println("\n");
        textbook.tampilkanInfo();
    }
}
