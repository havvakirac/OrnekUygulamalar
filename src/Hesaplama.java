public class Hesaplama {
    public int Faktoriyel(int sayi) {
        int sonuc = 1;

        while (sayi > 0) {
            sonuc *= sayi;
            sayi--;
        }
        return sonuc;
    }


}