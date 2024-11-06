public class Majalah extends Buku {
    private String edisi;
    private String kategori;

    public Majalah(String judul, String penulis, String penerbit, int tahunTerbit, String edisi, String kategori) {
        super(judul, penulis, penerbit, tahunTerbit);
    }

    //getter
    public String getEdisi() {
        return edisi;
    }

    public String getKategori() {
        return kategori;
    }

    //setter
    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("----------MAJALAH----------");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Penerbit: " + getPenerbit());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Edisi: " + getEdisi());
        System.out.println("Kategori: " + getKategori());
        System.out.println("----------------------------");
    }
}
