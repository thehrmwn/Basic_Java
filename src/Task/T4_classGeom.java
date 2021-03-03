package Task;

public class T4_classGeom {
    int edge, base, height, T; //Attribute
    float r;
    double vol;
    
        int cube (int rusuk) { //Methode
            edge = rusuk;
            vol = Math.pow(edge, 3);  
            
            return (int) vol;  
        }
    
        float prism (int alas, int ting1, int ting2) {
            base = alas;
            height = ting1;
            T = ting2;
            vol = 0.5 * base * height * T;
        
            return (float) vol;  
        }
        
        float lisma (int alas, int ting1, int ting2) {
            base = alas;
            height = ting1;
            T = ting2;
            vol = 0.167 * base * height * T;
        
            return (float) vol;  
        }
    
        double cone (float jari, int tinggi) {
            r = jari;
            T = tinggi;
            vol = 0.5f * 3.14f * (Math.pow(r, 2)) * (float)T;
        
            return (float)vol;
        }
    
        double sphere (float jar) {
            r = jar;
            vol = 1.33f * 3.14f * (Math.pow( r, 3));
            
            return (float)vol;
        }
    
    
    
}
