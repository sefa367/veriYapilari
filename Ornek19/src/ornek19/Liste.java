package ornek19;

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

    //verilen bir listeyi tersine çeviren ve yeni bir liste olarak döndüren fonksiyon
    Liste tersCevir() {
        Eleman tmp = bas;
        Eleman once = null;
        Eleman ters;
        Liste terscevir = new Liste();
        System.out.println();
        System.out.print("listenin ters çevrilmiş durumu : ");
        while (tmp != null) {
            ters = tmp.ileri;
            tmp.ileri = once;
            once = tmp;
            tmp = ters;
            terscevir.basaEkle(once);
        }

        bas = once;
        return terscevir;
    }
}
