package ornek7;

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
    //verilen bir bağlı listenin çift sıra numaralı  elemanlarını silen fonksiyon

    void ciftSıraElemanSil() {
        Liste ciftSıra = new Liste();
        Eleman tmp = bas;
        Eleman once = null;
        int elemanSayisi = 0;
        while (tmp != null) {
            elemanSayisi++;
            if (elemanSayisi % 2 == 0) {
                once.ileri = tmp.ileri;

            }
            once = tmp;
            tmp = tmp.ileri;
        }

    }
}
