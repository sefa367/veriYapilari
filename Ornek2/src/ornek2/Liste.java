package ornek2;

public class Liste {

    Eleman bas;
    Eleman son;

    public Liste() {

        bas = null;
        son = null;

    }

    void basaEkle(Eleman yeni) {
        if (bas == null) {

            bas = yeni;
            son = yeni;
        } else {

            yeni.ileri = bas;
            bas = yeni;

        }
    }

    void sonaEkle(Eleman yeni) {
        if (bas == null) {

            son = yeni;
            bas = yeni;

        } else {

            son.ileri = yeni;
            son = son.ileri;

        }
    }

    void yazdir() {
        Eleman tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }
    }

    //verilen bir bağlı listenin ikinci pozisyonuna eleman ekleyen fonksiyon
    void ikinciPozisyon(Eleman yeni) {
        if (bas == null) {
            System.out.println("liste boş ikinci pozisyona eleman eklenemez");
            bas = yeni;
            son = yeni;
            System.out.println("ilk eleman listenin başına eklenmiştir");
        } else if (bas.ileri == null) {
            yeni.ileri = bas;
            bas = yeni;
        } else {

            yeni.ileri = bas.ileri;
            bas.ileri = yeni;
        }

    }
}
