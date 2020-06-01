package ornek6;

public class Ornek6 {

    public static void main(String[] args) {
        Eleman e = new Eleman(4);
        Eleman e1 = new Eleman(2);
        Eleman e2 = new Eleman(32);
        Eleman e3 = new Eleman(45);
        Eleman e4 = new Eleman(35);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);

        l.ikinciElemanSil();

        System.out.print("listenin ikinci elemanı silindi : ");
        l.yazdir();
    }

}
