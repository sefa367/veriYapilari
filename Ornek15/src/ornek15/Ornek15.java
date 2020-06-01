package ornek15;

public class Ornek15 {

    public static void main(String[] args) {
        Eleman e = new Eleman(8);
        Eleman e1 = new Eleman(12);
        Eleman e2 = new Eleman(3);
        Eleman e3 = new Eleman(21);
        Eleman e4 = new Eleman(32);
        Eleman e5 = new Eleman(81);
        Eleman e6 = new Eleman(41);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);
        // l.basaEkle(e5);
        //l.basaEkle(e6);

        l.yazdir();

        System.out.println("\niki elemanın bağlantısı değiştirildi");

        l.ikiElemanYerDegistir(e4, e);

        l.yazdir();
    }

}
