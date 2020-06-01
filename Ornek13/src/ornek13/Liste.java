package ornek13;

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

    //bir bağlı listedeki verilen bir elemanı n kadar ileriye taşıyan fonksiyon
    void elemanıIleriTasıma(Eleman eN, int n) {//eN=eninci eleman silinip n kadar ileri taşınıcak
        Eleman tmp = bas;
        Eleman once = null;
        int sayac = 0;
        //eN listenin kaçıncı indiste olduğunu bulma
        while (tmp != null) {
            if (tmp == eN) {
                break;
            }
            tmp = tmp.ileri;
            sayac++;
        }
        tmp = bas;
        once = null;
        //gerekli indise taşınılması için,ilk önce listeden kaldırıldığı durum
        while (tmp != null) {
            if (bas == eN) {
                bas = bas.ileri;
            } else if (tmp == eN) {
                once.ileri = eN.ileri;
            }
            once = tmp;
            tmp = tmp.ileri;
        }
        tmp = bas;
        once = null;
        System.out.println();
        //kaçıncı indise taşınılacağının bulunduğu durum
        for (int i = 0; i < n + sayac && tmp != null; i++) {
            once = tmp;
            tmp = tmp.ileri;
        }
        //istenilen indise taşınılması durumu
        if (n + sayac <= elemanSayisiBulma()) {
            eN.ileri = tmp;
            once.ileri = eN;
            System.out.print(eN.icerik + " bulunduğu indisten " + n + " adım ileri taşındı ");
        } else {
            System.out.println("istenilen indis değeri liste boyutunu aşmaktadır lütfen geçerli bir değer giriniz");
        }

    }
}
