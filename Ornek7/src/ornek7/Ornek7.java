
package ornek7;


public class Ornek7 {

   
    public static void main(String[] args) {
        Eleman e = new Eleman(1);
        Eleman e1 = new Eleman(2);
        Eleman e2 = new Eleman(3);
        Eleman e3 = new Eleman(4);
        Eleman e4 = new Eleman(5);
        
        Liste l = new Liste();
        
        l.basaEkle(e);
        l.basaEkle(e1);
        l.basaEkle(e2);
        l.basaEkle(e3);
        l.basaEkle(e4);
        
        l.ciftSıraElemanSil();
        
        System.out.print("listenin çift numaralı elemanları silindi : ");
        l.yazdir();
    }
    
}
