package ornek4;

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
    //verilen iki sıralanmış bağlı listenin birleşimini bulan (ortak elemanlar bir kere geçmelidir) fonksiyon

    Liste sıralanmısListeninBirleşimi(Liste l1, Liste l2) {
        Liste sonuc = new Liste();
        Eleman tmp1, tmp2, yeni;
        tmp1 = l1.bas;
        tmp2 = l2.bas;
        int icerik;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.icerik > tmp2.icerik) {
                icerik = tmp1.icerik;
                tmp1 = tmp1.ileri;
            } else if (tmp1.icerik < tmp2.icerik) {
                icerik = tmp2.icerik;
                tmp2 = tmp2.ileri;
            } else {
                //ortak eleman varsa birini ekliyoruz ikisini ilerletiyoruz
                icerik = tmp1.icerik;
                tmp1 = tmp1.ileri;
                tmp2 = tmp2.ileri;
            }
            yeni = new Eleman(icerik);
            sonuc.basaEkle(yeni);

        }
        return sonuc;
    }

}
