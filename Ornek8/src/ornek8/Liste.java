package ornek8;

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

    //verilen bir bağlı listenin tek sıra numaralı elemanlarını ayrı bir bağlı listede döndüren fonksiyon
    Liste tekSıraAyrıListe() {
        Liste tekSıra = new Liste();
        Eleman tmp = bas;
        int elemanSayisi = 0;
        Eleman yeni;
        while (tmp != null) {
            elemanSayisi++;
            if (elemanSayisi % 2 == 1) {
                yeni = new Eleman(tmp.icerik);
                tekSıra.basaEkle(yeni);

            }
            tmp = tmp.ileri;
        }
        return tekSıra;
    }
}
