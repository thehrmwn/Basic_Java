package Meetings8_Inheritance;

class bangunDatar_class{
    float luas(){
        System.out.println("Menghitung Luas Bangun Datar");
        return 0;
    }
    float keliling(){
        System.out.println("Menghitung Keliling Bangun Datar");
        return 0;
    }
}

class Persegi extends bangunDatar_class { //s*s - 4s
    public float sisi;
    
    @Override //mengOverride nilai dari luas&keliling pada superClass
    float luas() {
        float luas = sisi*sisi;
        System.out.println("Luas Persegi : " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi : " + keliling);
        return keliling;
    }
}

class Lingkaran extends bangunDatar_class{ //4phir2 - 
    float r;

  @Override //mengOverride nilai dari luas&keliling pada superClass
    float luas() {
        float luas = (float)(Math.PI *r *r);
        System.out.println("Luas Lingkaran     : " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}

class persegiPanjang extends bangunDatar_class{ //p*l - 2p*2l
    float panjang;
    float lebar;
    
    @Override //mengOverride nilai dari luas&keliling pada superClass
    float luas() {
        float luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang    : " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang : " + keliling);
        return keliling;
    }
}
class Segitiga extends bangunDatar_class{ //1/2at - 
    float alas;
    float tinggi;
    
    @Override //mengOverride nilai dari luas&keliling pada superClass
    float luas() {
        float luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga    : " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 3*alas;
        System.out.println("Keliling Segitiga : " + keliling);
        return keliling;
    }    
}
