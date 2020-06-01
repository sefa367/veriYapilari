package ornek10;

public class Ornek10 {

    public static void main(String[] args) {
        Eleman e = new Eleman(45);
        Eleman e1 = new Eleman(20);
        Eleman e2 = new Eleman(17);
        Eleman e3 = new Eleman(9);
        Eleman e4 = new Eleman(-9);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);

        System.out.print("sıralı bağli listenin sırasını bozmadan eleman eklendi : ");
        l.sıralanmısListedeYeniSayi(99);
    }

}
