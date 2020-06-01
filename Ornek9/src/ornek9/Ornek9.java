package ornek9;

public class Ornek9 {

    public static void main(String[] args) {
        Eleman e = new Eleman(1);
        Eleman e1 = new Eleman(2);
        Eleman e2 = new Eleman(3);
        Eleman e3 = new Eleman(4);
        Eleman e4 = new Eleman(5);
        Eleman e5 = new Eleman(6);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);

        l.sonElemanOnuneElemanEkle(e5);

        System.out.print("listenin son elemanının önüne yeni bir eleman eklendi : ");
        l.yazdir();
    }

}
