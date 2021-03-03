package Try;

interface inter{
    abstract float x();
    abstract float y();
}
class fce implements inter{
    @Override
    public float x(){
       return 0; 
    }
    @Override
    public float y(){
        return 0;
    }
}

class poly{
    float hitungLL(){
        System.out.println("Menghitung Luas");
        return 0;
    }
}
class Perr extends poly{
    @Override
    float hitungLL(){
        float p = 2;
        float l = 7;
        float luu = p*l;
        return luu;
    }
}

class Loll extends poly{
    @Override
    float hitungLL(){
        float s = 7;
        return (s*2);
    }
}

class enc {
    // Encapsulation
    private float tinggi;
    private float panjang;
    
        public void setText(float tinggi){
          this.tinggi = tinggi;
        }
        public void setTextt(float tinggi){
          this.tinggi = tinggi;
        }
        public int getText(){
          return (int) panjang;
        }
        public int getTextt(){
          return (int) tinggi;
        } 
}

class oneeS { 
    // Inheritance
    float hitungLuas(){
        System.out.println("Menghitung Luas Persegi");
        return 0;
    }
    float hitungKeliling(){
        System.out.println("Menghitung Keliling Persegi");
        return 0;
    }
}

class Persegi extends oneeS{
        float sisi;
        @Override
        float hitungLuas(){
            float luas;
              luas = sisi*sisi;
            return luas;
        }
        @Override
        float hitungKeliling(){
            float kel;
            kel = 4*sisi;
            return kel;
        }
    }
