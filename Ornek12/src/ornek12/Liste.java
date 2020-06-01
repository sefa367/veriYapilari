package ornek12;

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
    //verilen bir X elemanın önündeki elemanı silen fonksiyon

    void istenilenElemanOnuSil(Eleman sayı) {
        Eleman tmp = bas;
        while (tmp.ileri != null) {
            if (sayı == son) {
                System.out.print("istenilen elemanın önünde eleman yoktur ");
                break;
            }
            if (sayı.ileri == null) {
                tmp.ileri = null;
            }
            if (tmp == sayı) {
                tmp.ileri = tmp.ileri.ileri;
                break;
            }

            tmp = tmp.ileri;

        }
        sayı.ileri = null;
        System.out.println("istenilen eleman : " + sayı.icerik + "'in önündeki eleman  silindi");

    }
}
