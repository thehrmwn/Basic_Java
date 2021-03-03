package TaskCC;

public class classSepeda {
    int fast, slow, kecepatan;
    int go, back, stop;
    int tambah;
    
    int maju (int x, int y) {
        int hasil;
            tambah = x;
            go = y;
//            kecepatan = k;
//            hasil = kecepatan + 1;
            kecepatan = tambah + go;
            return kecepatan;
    }
    int berhenti (int x){
        int hasil;
            kecepatan = x;
            kecepatan = 0;
            return kecepatan;
    }
    int mundur (int x, int y) {
        int hasil;
//            kecepatan = k;
//            hasil = kecepatan - 1;
            fast = x;
            back = y;
            kecepatan = fast - back;
            return kecepatan;
    }
    
}
