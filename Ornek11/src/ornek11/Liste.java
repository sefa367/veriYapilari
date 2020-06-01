package ornek11;

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

    int elemanSayisiBulma() {
        int sayac = 0;
        Eleman tmp;
        tmp = bas;
        while (tmp != null) {
            tmp = tmp.ileri;
            sayac++;
        }
        return sayac;
    }
    //verilen bir bağlı listedeki i'ninci elemanı silen bir fonksiyon yazınız

    void istenilenElemanSil(int indis) {
        if (indis < 0 || indis > elemanSayisiBulma()) {
            System.out.println("lütfen yeniden deneyin ve geçerli bir değer giriniz : ");
            System.exit(0);
        }
        //eleman olmama durumu
        if (bas == null) {
            return;
        }
        Eleman tmp = bas;
        Eleman once = null;
        //ilk elemanı silme durumu
        if (indis == 0) {
            bas = bas.ileri;
        } else {
            //silinecek elemanın indisine kadar gidilmesi ve oncesinin tutulması
            for (int i = 0; i < indis; i++) {
                once = tmp;
                tmp = tmp.ileri;
            }
            once.ileri = tmp.ileri;
            // son=tmp;
        }

    }
}
