package ornek18;

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
        System.out.print("liste : ");
        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }
    }

    //verilen bir listenin içinden N'ye bölünen tüm elemanları silen ve yeni bir listeye 
    //ekleyip o listeyi döndrüen fonksiyon
    Liste birSayıBolunenElemanSilEkle(int N) {
        Eleman tmp = bas;
        Eleman once = null;
        Eleman sil = null;
        Liste silinen = new Liste();
        System.out.print("listenin " + N + "'e bölünen elemanları silindi : ");
        while (tmp != null) {
            if (tmp.icerik % N == 0) {
                sil = tmp;

                if (tmp == bas) {
                    bas = bas.ileri;
                    silinen.basaEkle(sil);
                } else {

                    once.ileri = tmp.ileri;
                    tmp = once;
                }
                sil.ileri = null;
                silinen.basaEkle(sil);
            }
            once = tmp;
            tmp = tmp.ileri;

        }

        return silinen;
    }
}
