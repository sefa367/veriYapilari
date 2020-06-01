package ornek16;

public class Ornek16 {

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
        l.basaEkle(e5);
        l.basaEkle(e6);

        l.yazdir();

        Liste l2 = new Liste();

        Eleman e7 = new Eleman(13);
        Eleman e8 = new Eleman(27);
        Eleman e9 = new Eleman(99);

        l2.basaEkle(e7);
        l2.basaEkle(e8);
        l2.basaEkle(e9);

        System.out.println();
        System.out.print("ikinci listenin elemanları : ");
        l2.yazdir();

        l.belirliParcaKesipYapıstırma(e5, e4, l2.son);
        System.out.println();
        System.out.print("kesilen elemanların ikinci listeye eklenmesi yeni ");
        l2.yazdir();

        System.out.print("\nkalan ");
        l.yazdir();

    }
}
