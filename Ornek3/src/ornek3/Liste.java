package ornek3;

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

    //birden n'e kadar asal sayıları üreten ve onları bir bağlı listei içinde döndüren fonksiyon
    Liste asalSayi(int n) {
        boolean asalsayi;
        Eleman yeni;
        Liste asal = new Liste();
        System.out.print("n kadar asal sayı liste türünde döndü : ");
        for (int i = 2; i <= n; i++) {
            asalsayi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalsayi = false;
                    break;
                }
            }
            if (asalsayi) {
                yeni = new Eleman(i);
                asal.basaEkle(yeni);
                System.out.print(asal.bas.icerik + " ");
            }
        }
        return asal;
    }
}
