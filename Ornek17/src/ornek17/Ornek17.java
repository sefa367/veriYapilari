package ornek17;

public class Ornek17 {

    public static void main(String[] args) {
        Liste l = new Liste();

        Eleman tmp = l.elemanAsalCarpanUret(99).bas;

        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }

    }
}
