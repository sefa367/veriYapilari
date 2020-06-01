package ornek14;

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

    //bir bağlı listenin ortanca elemanını bulan fonksşyon
    //algoritmamın mantığı baş' iki tane eleman'a atıcam birini bir adım diğerini iki adım ilerleticem
    //iki adım ilerleyen null düştüğünde bir adım ilerleyen ortanca eleman olucak
    Eleman ortancaElemanBulma() {
        Eleman orta = bas;
        Eleman tmp = bas;
        while (tmp != null) {

            if (tmp.ileri == null) {
                break;
            }
            orta = orta.ileri;
            tmp = tmp.ileri.ileri;

        }

        return orta;
    }
}
