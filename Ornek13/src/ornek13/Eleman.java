package ornek13;

public class Eleman {

    int icerik;
    String kelime;
    Eleman ileri;

    public Eleman(int icerik, String kelime) {
        this.icerik = icerik;
        this.kelime = kelime;
    }

    public Eleman(int icerik) {
        this.icerik = icerik;
    }

    public Eleman(String kelime) {
        this.kelime = kelime;
    }
}
