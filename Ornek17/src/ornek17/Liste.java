package ornek17;

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
    //size bir N sayısı veriliyor. N sayısının asal çarpanlarını üreten ve onları bir bağlı liste içinde 
    //döndüren fonksiyon

    Liste elemanAsalCarpanUret(int N) {
        System.out.print("parametre olarak gönderilen sayının liste türünde dönen asal çarpan bölenleri : ");
        boolean asalsayi;
        Eleman yeni;
        Liste asalcarpan = new Liste();
        for (int i = 2; i <= N; i++) {
            asalsayi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalsayi = false;
                    break;
                }
            }
            if (asalsayi) {
                if (N % i == 0) {
                    yeni = new Eleman(i);
                    asalcarpan.basaEkle(yeni);

                }
            }
        }
        return asalcarpan;

    }

}
