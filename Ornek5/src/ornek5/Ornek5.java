package ornek5;

public class Ornek5 {

    public static void main(String[] args) {
        Eleman e = new Eleman(6);
        Eleman e1 = new Eleman(22);
        Eleman e2 = new Eleman(17);
        Eleman e3 = new Eleman(4);
        Eleman e4 = new Eleman(-5);

        Liste l = new Liste();

        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);

        System.out.print("listenin en küçük elemanı : ");
        System.out.println(l.enKücükEleman());
    }

}
