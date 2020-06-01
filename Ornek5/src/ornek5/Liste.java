package ornek5;

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
    //tam sayılar içeren bir bağlı listedeki en küçük sayıyı bulan fonksiyon

    int enKücükEleman() {
        Eleman tmp = bas;
        int enb = tmp.icerik;
        while (tmp.ileri != null) {

            if (enb > tmp.ileri.icerik) {
                enb = tmp.ileri.icerik;
            }
            tmp = tmp.ileri;
        }
        return enb;
    }
}
