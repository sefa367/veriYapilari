package ornek16;

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

    //bir bağlı listenin belirli bir parçasını kesip diğer bir listeye yapıştırmak istiyoruz
    //kesmenin başladığı ve bittiği yer ile kopyalanacak yerin adreslerinin verildğini varsayarak
    //bu işlemi yapan fonksiyon
    void belirliParcaKesipYapıstırma(Eleman basla, Eleman bitis, Eleman kopyalanan) {
        Eleman baslatmp = bas;
        Eleman bitistmp = bas;
        Eleman once = null;
        //başla elemanın bulunduğu kısım
        while (baslatmp != null && baslatmp != basla) {
            once = baslatmp;
            baslatmp = baslatmp.ileri;
        }
        //bitis elemanın bulunduğu kısım
        while (bitistmp != null && bitistmp != bitis) {
            bitistmp = bitistmp.ileri;
        }
        //eğer kesilecek eleman baş ise
        if (basla == bas) {
            baslatmp = bitis.ileri;
            bas = baslatmp;
            bitistmp.ileri = null;
        } //diğer durumlarda
        else {
            once.ileri = bitistmp.ileri;
            bitistmp.ileri = null;
        }
        //kesilen elemanları diğer listeye eklenmesi
        kopyalanan.ileri = basla;
    }
}
