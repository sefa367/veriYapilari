package ornek6;

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

    //verilen bir bağlı listenin ikinci elemanını silen fonksiyon
    void ikinciElemanSil() {
        Eleman tmp = bas;
        Eleman once = null;
        while (tmp.ileri.ileri != null) {
            once = tmp;
            tmp = tmp.ileri;

        }
        once.ileri = tmp.ileri;
    }
}
