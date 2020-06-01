package ornek1;

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
        } 
        
        else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void sonaEkle(Eleman yeni) {
        if (bas == null) {
            son = yeni;
            bas = yeni;

        } 
        
        else {
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

    //bir bağlı listedeki eleman sayısını bulan fonksiyon
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
}
