package Task;

public class T3_classBicycle {
    int awal = 0;
    int stop = 0;
    int go;
    int back;
    int tambahan;
    
        int melaju (int laju) {
            go = laju;
            awal += go;
            
            return awal;    
        }
        int mundur (int x, int belakang) {
            back = x;
            belakang -= back;
            
            return belakang;    
        }
        int berhenti (int diam) {
            stop += diam;
            
            return stop;
        }
        
}
