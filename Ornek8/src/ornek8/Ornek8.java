package ornek8;

public class Ornek8 {

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

        System.out.print("listenin tek sıra numaralı elemanları farklı bir listeye eklendi : ");

        Eleman tmp = l.tekSıraAyrıListe().bas;

        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }

    }

}
