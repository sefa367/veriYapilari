package ornek10;

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

    //verilen sıralanmış bir bağlı listenin içine yeni bir sayıyı sırayı bozmadan ekleyen fonksiyon
    void sıralanmısListedeYeniSayi(int sayi) {
        Eleman tmp = bas;
        Eleman once = bas;
        Eleman e = new Eleman(sayi);
        //eklenecek eleman bütün elemanlardan küçük ise ekleme işlemi yapar
        if (e.icerik < once.icerik) {
            basaEkle(e);
            System.out.print(e.icerik + " ");
        }

        while (tmp != null) {
            //eklenecek eleman arada bir değer ise ekleme işlemi yapar
            if ((once.icerik <= sayi && tmp.icerik > sayi)) {//eklenecek eleman kendinden öncekinden büyük,kendinden sonrasından küçük olmalıdır
                e.ileri = tmp;// yeni elemanın işaretçisi sonrakini gösterir
                once.ileri = e;//onceki elemanın işaretçisi yeni elemanı gösterir
                System.out.print(e.icerik + " ");
            }
            System.out.print(tmp.icerik + " ");
            once = tmp;
            tmp = tmp.ileri;
        }
        //eklenecek eleman bütün elemanlardan büyük ise ekleme işlemi yapar
        if (e.icerik >= once.icerik) {
            tmp = e;//burdaki tmp ileriyi gösteriyor,tmp nin işaretcisi e yi gösteriyor
            once.ileri = tmp;
            System.out.print(e.icerik + " ");
        }

    }
}
