package ornek1;

public class Ornek1 {

    public static void main(String[] args) {

        Eleman e = new Eleman(1);
        Eleman e1 = new Eleman(2);
        Eleman e2 = new Eleman(3);
        Eleman e3 = new Eleman(4);
        Eleman e4 = new Eleman(5);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);

        l.yazdir();

        System.out.println("\neleman sayısı : " + l.elemanSayisiBulma());
    }
}
