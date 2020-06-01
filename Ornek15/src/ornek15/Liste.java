package ornek15;

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

    //bir bağlı listede verilen iki elemanı yer değiştiren fonksiyon
//yazdığınız fonksiyon, elemanların içeriğini değil sadece bağlantılarını değiştirebilir
//listemiz : 32-->21-->3-->12-->8
    void ikiElemanYerDegistir(Eleman birinci, Eleman ikinci) {//birinci=8,ikinci=32
        //elemanların aynı olma durumu
        if (birinci == ikinci) {
            return;
        }
        //while döngüleri elemanların yerini bulur
        Eleman birinciOnce = null;//birinci elemanın öncesini tutar
        Eleman birinciTmp = bas;//birinci elemanı tutar
        while (birinciTmp != null && birinciTmp != birinci) {
            birinciOnce = birinciTmp;//birinciOnce=12
            birinciTmp = birinciTmp.ileri;//birinciTmp=8
        }
        Eleman ikinciOnce = null;//ikinci elemanın öncesini tutar
        Eleman ikinciTmp = bas;//ikinci elemanı tutar
        while (ikinciTmp != null && ikinciTmp != ikinci) {
            ikinciOnce = ikinciTmp;//ikinciOnce=null
            ikinciTmp = ikinciTmp.ileri;//ikinciTmp=32
        }
        //eleman olmaması durumu
        if (birinciTmp == null || ikinciTmp == null) {
            return;
        }
        //ikinci elemanın birinci elemana bağlandığı durum
        if (birinciOnce != null) {
            birinciOnce.ileri = ikinciTmp;//birinciOnce ilerisi=32
        } else {
            bas = ikinciTmp;//bas=32
        }        //birinci elemanın ikinci elemana bağlandığı durum
        if (ikinciOnce != null) {
            ikinciOnce.ileri = birinciTmp;//ikinciOnce ilerisi=null
        } else {
            bas = birinciTmp;//bas=8
        }        //birinci ve ikinci elemanların ilerisinin yer değiştirilmesi
        Eleman degistir = birinciTmp.ileri;//degistir=null
        birinciTmp.ileri = ikinciTmp.ileri;//birinciTmp ilerisi=21
        ikinciTmp.ileri = degistir;//ikinciTmp ilerisi=null

    }
}
