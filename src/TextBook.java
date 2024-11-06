public class TextBook extends Buku {
    private String matkul;
    private int kelas;

    public TextBook(String judul, String penulis, String penerbit, int tahunTerbit, String edisi, String kategori) {
        super(judul, penulis, penerbit, tahunTerbit);
    }

    //getter
    public String getMatkul() {
        return matkul;
    }

    public int getKelas() {
        return kelas;
    }


    //setter
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public void tampilkanInfo() {
        System.out.println("----------TEXTBOOK----------");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Penerbit: " + getPenerbit());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Mata Kuliah: " + getMatkul());
        System.out.println("Kelas: " + getKelas());
        System.out.println("----------------------------");
    }
}
