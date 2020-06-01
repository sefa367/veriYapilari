package ornek4;

public class Ornek4 {

    public static void main(String[] args) {
        Liste l = new Liste();

        Liste l1 = new Liste();

        Liste l2 = new Liste();

        Eleman e5 = new Eleman(3);
        Eleman e6 = new Eleman(6);
        Eleman e7 = new Eleman(7);
        Eleman e8 = new Eleman(15);
        Eleman e9 = new Eleman(22);
        Eleman e10 = new Eleman(3);
        Eleman e11 = new Eleman(7);
        Eleman e12 = new Eleman(13);
        Eleman e13 = new Eleman(20);
        Eleman e14 = new Eleman(22);

        l1.basaEkle(e5);
        l1.basaEkle(e6);
        l1.basaEkle(e7);
        l1.basaEkle(e8);
        l1.basaEkle(e9);

        l2.basaEkle(e10);
        l2.basaEkle(e11);
        l2.basaEkle(e12);
        l2.basaEkle(e13);
        l2.basaEkle(e14);

        System.out.print("liste 1'in elemanları : ");

        l1.yazdir();

        System.out.print("\nliste 2'nin elemanları : ");

        l2.yazdir();

        System.out.print("\niki listenin birleşimi : ");

        Eleman tmp = l.sıralanmısListeninBirleşimi(l1, l2).bas;

        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }

    }

}
